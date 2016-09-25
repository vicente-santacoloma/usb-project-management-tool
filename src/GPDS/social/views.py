from social.forms import *
from django.contrib.auth.decorators import login_required, permission_required
from users.models import Membership
from project.models import Project
from users.models import User
from django.shortcuts import render_to_response, get_object_or_404
from django.template import RequestContext
from django.http import HttpResponseRedirect, HttpResponse
from django.core.context_processors import request
from django.core.exceptions import ValidationError
from social.models import Request
from project.views import manage_project
from django.views.decorators.cache import cache_control

# Create your views here.

#@login_required
#def request_invite_user(request):
    
@login_required
@cache_control(no_cache=True, must_revalidate=True, no_store=True)
def my_join_request(request):
    if request.method == 'POST':     
        r = get_object_or_404(Request,to_user_id=request.user.id, project_id = request.POST['project'])
        message = ""
        if(request.POST['button'] == 'accept'):
            p = get_object_or_404(Project,pk=request.POST['project'])
            membership = Membership(user=request.user, project=p)
            membership.save()
            message = "La solicitud ha sido aceptada" 
        else:
            message = "La solicitud ha sido rechazada" 
        r.delete()
        return render_to_response('social/my_join_request.html',
                                  {'message':message},
                                  context_instance=RequestContext(request))
    else:
        join_request = Request.objects.filter(to_user_id=request.user.id)
        return render_to_response('social/my_join_request.html',
                                  {'join_request':join_request},
                                  context_instance=RequestContext(request))

@login_required
@cache_control(no_cache=True, must_revalidate=True, no_store=True)
def request_join_project(request,project_id):
    p = get_object_or_404(Project,pk=project_id)
    if request.method == 'POST':
        users = request.POST.getlist('to_user')
        for u in users:
            user = get_object_or_404(User,pk=u)
            if Request.objects.filter(from_user_id=request.user.id, to_user_id=user.id,project_id=project_id).count() == 0:
                r = Request(to_user = user, from_user=request.user,project=p)
                r.save()
        return manage_project(request)   
    else:
        memberships = Membership.objects.filter(project_id=project_id)
        users = []
        for membership in memberships:
            users.append(membership.user)
        join_requests = Request.objects.filter(from_user_id=request.user.id, project_id=project_id)    
        for r in join_requests:
            users.append(r.to_user)       
        form = RequestForm(users=users)
        return render_to_response('social/request_join_project.html',
                                  {'form':form},
                                  context_instance=RequestContext(request))
        