from django import forms
from social.models import Request
from django.contrib.auth.models import User
from django.forms.fields import DateField, ChoiceField, MultipleChoiceField
from django.forms.widgets import RadioSelect, CheckboxSelectMultiple
from django.forms.extras.widgets import SelectDateWidget
from django.forms.util import ErrorList
from users.models import *

class RequestForm(forms.Form):
    to_user = forms.MultipleChoiceField(widget= forms.CheckboxSelectMultiple())
    
    def __init__(self, data=None, files=None, auto_id='id_%s', prefix=None, 
        initial=None, error_class=ErrorList, label_suffix=':', 
        empty_permitted=False, instance=None, users=None):
        forms.Form.__init__(self, data=data, files=files, auto_id=auto_id, prefix=prefix, initial=initial, error_class=error_class, label_suffix=label_suffix, empty_permitted=empty_permitted)
    
        if((users is None)):
            pass
    
#        self.fields['from_user'].value = user
#        self.fields['project'].value = project
        
        USERS = []
        users_all = User.objects.all()
        for u in users_all:
            if ((u not in users) and (u.id != 1)):
                USERS.append((u.id, u.username))
        
        self.fields['to_user'].choices = USERS
