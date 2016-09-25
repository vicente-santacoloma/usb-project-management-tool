from django.conf.urls import patterns, include, url

from django.contrib import admin
admin.autodiscover()

urlpatterns = patterns('',

    # URL's for Methodology
    
    url(r'^manage_methodology/$', 'methodology.views.manage_methodology'),
    
    url(r'^create_methodology/$', 'methodology.views.create_methodology'),
    
    url(r'^read_methodology/(?P<methodology_id>\d+)/$', 'methodology.views.read_methodology'),
    
    url(r'^update_methodology/(?P<methodology_id>\d+)/$', 'methodology.views.update_methodology'),
    
    url(r'^delete_methodology/(?P<methodology_id>\d+)/$', 'methodology.views.delete_methodology'),
    
    # URL's for Software Process
    
    url(r'^manage_softwareprocess/$', 'methodology.views.manage_softwareprocess'),
    
    url(r'^read_softwareprocess/(?P<softwareprocess_id>\d+)/$', 'methodology.views.read_softwareprocess'),
    
    # URL's for Role
    
    url(r'^manage_rol/$', 'methodology.views.manage_rol'),
    #url(r'^manage_role/$', 'methodology.views.manage_role'),
    #url(r'^read_role/(?P<role_id>\d+)/$', 'methodology.views.read_role'),
)

