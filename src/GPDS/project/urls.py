from django.conf.urls import patterns, include, url

# Uncomment the next two lines to enable the admin:
from django.contrib import admin
admin.autodiscover()

urlpatterns = patterns('',

    # URL's for Project
    url(r'^manage_project/$', 'project.views.manage_project'),
    
    url(r'^create_project/$', 'project.views.create_project'),
    
    url(r'^read_project/(?P<project_id>\d+)/$', 'project.views.read_project'),
    
    url(r'^update_project/(?P<project_id>\d+)/$', 'project.views.update_project'),
    
    url(r'^delete_project/(?P<project_id>\d+)/$', 'project.views.delete_project'),
    
    url(r'^quit_project/$', 'project.views.quit_project'),
    
    url(r'^manage_participants/(?P<project_id>\d+)/$','project.views.manage_participants'),
    
    url(r'^add_participant_project/(?P<project_id>\d+)/$','project.views.add_participant_project'),
    
    url(r'^read_role/$','project.views.read_role'),
    
    url(r'^(?P<project_id>\d+)/create_artifact$', 'activity.views.create_artifact'),
)
