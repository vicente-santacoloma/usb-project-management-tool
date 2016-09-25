from django.contrib import admin
from django.db import models
from django.contrib.auth.models import User
from project.models import Project
from users.models import *

# Create your models here.

class Request(models.Model):
    to_user = models.ForeignKey(User, related_name='to_user')
    from_user = models.ForeignKey(User, related_name='from_user')
    project = models.ForeignKey(Project)
    
admin.site.register(Request)
