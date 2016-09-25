from django.conf.urls import patterns, include, url

from django.contrib import admin
admin.autodiscover()

urlpatterns = patterns('',

    # URL's for Request
    
    url(r'^request_join_project/(?P<project_id>\d+)/$', 'social.views.request_join_project'),

    url(r'^my_join_request/$', 'social.views.my_join_request')

)