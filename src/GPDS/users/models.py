from django.contrib import admin
from django.contrib.auth.models import User
from django.db import models

class Role(models.Model):
    name = models.CharField(max_length=30, unique=True)
    description = models.TextField()
    enabled = models.BooleanField(default=True)
    
    def __unicode__(self):
        return self.name
    
class Membership(models.Model):
    user = models.ForeignKey(User)
    project = models.ForeignKey('project.Project')
    role = models.ForeignKey(Role,null=True, blank=True)
    date_joined = models.DateField(auto_now_add=True)
    enabled = models.BooleanField(default=True)

from project.models import Project

admin.site.register(Role)
admin.site.register(Membership)
