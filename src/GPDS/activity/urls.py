from django.conf.urls import patterns, include, url

from django.contrib import admin
admin.autodiscover()

urlpatterns = patterns('',

    # URL's for Activity    
    
    url(r'^manage_activity_user/$', 'activity.views.manage_activity_user'),
    
    url(r'^manage_activity/(?P<project_id>\d+)/$', 'activity.views.manage_activity'),
    
    url(r'^graph_activities/(?P<project_id>\d+)/$', 'activity.views.generate_graph_activity'),
    
    url(r'^create_activity/(?P<project_id>\d+)/$', 'activity.views.create_activity'),
    
    url(r'^read_activity/(?P<activity_id>\d+)/$', 'activity.views.read_activity'),
    
    url(r'^update_activity/(?P<activity_id>\d+)/$', 'activity.views.update_activity'),
    
    #url(r'^delete_activity/$', 'activity.views.delete_activity'),
    url(r'^create_user_role/(?P<user_id>\d+)/$', 'activity.views.create_user_role'),
    url(r'^create_user_role/(?P<user_id>\d+)/create_user_role_form/$', 'activity.views.create_user_role_form'),
    
    # URL's for Technique
    
    url(r'^manage_technique/(?P<activity_id>\d+)/$', 'activity.views.manage_technique'),
    
    url(r'^read_technique/(?P<technique_id>\d+)/$', 'activity.views.read_technique'),
    
    # URL's for Artifact
    
    url(r'^create_artifact$', 'activity.views.create_artifact'),
    
    url(r'^read_artifact/(?P<activity_id>\d+)/$', 'activity.views.read_artifact'), 
    
    url(r'^update_artifact/(?P<artifact_id>\d+)/$', 'activity.views.update_artifact'),
    
    url(r'^update_artifact/(?P<artifact_id>\d+)/update_artifact$', 'activity.views.update_artifact'), 
    
    url(r'^open_artifact/(?P<artifact_id>\d+)$', 'activity.views.open_artifact'),
          
)
