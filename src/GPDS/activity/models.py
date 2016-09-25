from django.contrib import admin
from django.contrib.auth.models import User
from django.db import models
from methodology.models import SoftwareProcess
from project.models import Project
from users.models import Role
# Create your models here.

class Activity(models.Model):
    name = models.CharField(max_length=30)
    description = models.TextField()
    progress = models.IntegerField(null=True, blank=True, default = 0)
    date_start = models.DateTimeField('date started')
    date_end = models.DateTimeField('date ended')
    project = models.ForeignKey(Project)
    users = models.ManyToManyField(User,null=True, blank=True)
    activities_required = models.ManyToManyField('Activity',null=True, blank=True)
    activities_super = models.ManyToManyField('Activity',null=True, blank=True, related_name='activity_set_super')
    # activities_successor es redundante y genera problemas 
    #activities_successor = models.ManyToManyField('self',null=True, blank=True)
    roles = models.ManyToManyField(Role)
    techniques = models.ManyToManyField('Technique')
    enabled = models.BooleanField(default=True)
    
    def __unicode__(self):
        return self.name

class Artifact(models.Model):
    name = models.CharField(max_length=30, unique=True)
    description = models.TextField()
    content = models.FileField(upload_to='artifacts')
    activity = models.ForeignKey('Activity')
    technique = models.ForeignKey('Technique')
    enabled = models.BooleanField(default=True)
    
    def __unicode__(self):
        return self.name
    
class Technique(models.Model):
    name = models.CharField(max_length=30, unique=True)
    description = models.TextField()
    enabled = models.BooleanField(default=True)
    
    def __unicode__(self):
        return self.name
    
admin.site.register(Activity)
admin.site.register(Artifact)
admin.site.register(Technique)

    
