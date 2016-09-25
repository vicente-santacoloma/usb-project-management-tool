from django.template import Context, loader
from project.models import Project 
from activity.models import Activity
from users.models import Membership,Role
from methodology.models import Methodology, SoftwareProcess
from django.contrib.auth.models import User
from django.http import HttpResponse
from django.http import Http404
from django.shortcuts import render_to_response, get_object_or_404
from django.template import RequestContext
from django.http import HttpResponseRedirect, HttpResponse
from django.core.urlresolvers import reverse
from django.contrib.auth.decorators import login_required, login_required, permission_required
from django.contrib.auth.models import User
from django.views.decorators.csrf import csrf_protect
from project.form import ProjectChangeForm, ProjectDeleteForm, ProjectCreateForm, ProjectManageParticipants, MembershipCreateForm
from sets import Set
from django.utils import timezone

###################################################################################################
#                                 Manage, CRUD, Quit for Project                                  #
###################################################################################################

@login_required
def manage_project(request):
    participant_projects = Set([])
    lider_projects = Project.objects.filter(leader__id=request.user.id, enabled=True)
    projects_aux = Project.objects.filter(participants__id=request.user.id, enabled=True)
    for project_aux in projects_aux:
        if(project_aux not in lider_projects):
            participant_projects.add(project_aux)
    return render_to_response('project/manage_project.html', {'lider_projects'      :lider_projects, 
                                                              'participant_projects':participant_projects},
                              context_instance=RequestContext(request))

# Hay que cambiarlo
@login_required
def create_project(request):
    if request.method == 'POST':
        form = ProjectCreateForm(request.POST)
        if form.is_valid():
            form.save()
        p = get_object_or_404(Project,name=request.POST['name'], leader=request.user)
        membership = Membership(user=request.user, project=p)
        membership.save()
        projects = Project.objects.filter(name='Prototype', leader__username='admin', methodology__pk=request.POST['methodology'], 
                                          enabled=True)
        
        if projects.count() == 1:
            project = projects.get()
            activities = Activity.objects.filter(project=project)
            for activity in activities: 
                pk_activity = activity.pk
                activity.pk = None
                activity.date_start = timezone.now()
                activity.date_end = timezone.now()
                activity.project = p
                activity_aux = get_object_or_404(Activity,pk=pk_activity)
                activity.save()
                activity.activities_required = activity_aux.activities_required.all()
                activity.activities_super = activity_aux.activities_super.all()
                activity.save()
                
            activities = Activity.objects.filter(project=p)
            for activity in activities:
                
                activities_required = activity.activities_required.all()
                activities_clone_required = []
                for activity_required in activities_required:
                    activities_clone_required.append(get_object_or_404(Activity, name=activity_required.name, project=p))
                
                activities_super = activity.activities_super.all()
                activities_clone_super = []    
                for activity_super in activities_required:
                    activities_clone_super.append(get_object_or_404(Activity, name=activity_super.name, project=p))
                             
                activity.activities_required = activities_clone_required
                activity.activities_super    = activities_clone_super
                activity.save()        
                
        return manage_project(request) 
    else:
        # m = Methodology.objects.filter(is_private=True, enabled=True)
        form = ProjectCreateForm(initial={'leader':request.user})
        return render_to_response('project/create_project.html', {'form':form,}, context_instance=RequestContext(request))

@login_required
def read_project(request,project_id):
    try:
        p = Project.objects.get(pk=project_id)
    except Poll.DoesNotExist:
        raise Http404
    return render_to_response('project/read_project.html', {'project': p},
                                context_instance=RequestContext(request))
     
@login_required
def update_project(request, project_id):
    if request.method == 'POST':
        form = ProjectChangeForm(request.POST, instance=Project.objects.get(pk=project_id))
        redirect_to = request.REQUEST.get('next', reverse('project.views.manage_project', args=()))
        if form.is_valid():
            form.save()
        return HttpResponseRedirect(reverse('project.views.manage_project', args=()))
    else:
        form = ProjectChangeForm(instance=Project.objects.get(pk=project_id))
        redirect_to = request.REQUEST.get('next', '')
    return render_to_response('project/update_project.html',
                              {'form':form,
                               'next':redirect_to,
                               'project_id':project_id},
                                 context_instance=RequestContext(request))

@login_required 
def delete_project(request, project_id):
    if request.method == 'POST':    
        form = ProjectDeleteForm(request.POST, instance=Project.objects.get(pk=project_id))
        redirect_to = request.REQUEST.get('next', reverse('project.views.manage', args=()))
        if form.is_valid():
            form.save()
        return HttpResponseRedirect(reverse('project.views.manage', args=()))
    else:
        form = ProjectDeleteForm(instance=Project.objects.get(pk=project_id))
        redirect_to = request.REQUEST.get('next', '')
    return render_to_response('project/delete_project.html',
                              {'form':form,
                               'next':redirect_to,
                               'project_id':project_id},
                              context_instance=RequestContext(request))

@login_required
def quit_project(request):
    memberships = Membership.objects.filter(user_id=request.user.id,project_id=request.POST['project_id'])
    memberships.delete()
    return HttpResponseRedirect(reverse('project.views.manage_project', args=()))

@login_required
def read_role(request):
    if request.method == 'POST':
       	return read_methodology(request, methodology_id=p.id)
    else:
	Lista_Proyectos=SoftwareProcess.objects.all()
        return render_to_response('project/read_role.html',
				{
        			'Lista_Proyectos': Lista_Proyectos,
    				},
                              context_instance=RequestContext(request))

#FALTA POR TERMIANR Y PROBAR
@login_required
def manage_participants(request,project_id):
    redirect_to = request.REQUEST.get('next', '')
    return render_to_response('project/manage_participants.html',
                              {'next':redirect_to,
                               'project_id':project_id},
                                 context_instance=RequestContext(request))
    
@login_required
def add_participant_project(request,project_id):
    if request.method == 'POST':
        form = MembershipCreateForm(request.POST, instance=Project.objects.get(pk=project_id))
        redirect_to = request.REQUEST.get('next', reverse('project.views.manage_participants', args=()))
        if form.is_valid():
            form.save()
        return HttpResponseRedirect(reverse('project.views.manage_participants', args=()))
    else:
        #projects_obj = Project.objects.filter( name = 'proj1')
        form = MembershipCreateForm(instance=Project.objects.get(pk=project_id))
        redirect_to = request.REQUEST.get('next', '')

    return render_to_response('project/add_participant_project.html',
                              {'form':form,
                               'next':redirect_to,
                               'project_id':project_id},
                                 context_instance=RequestContext(request))    

