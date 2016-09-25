from django import forms
from django.forms.models import ModelForm
from django.contrib.admin.widgets import AdminDateWidget
from activity.models import *

class TechniqueForm(ModelForm):
    class Meta:
        model = Technique
        fields = ('name', 'description',)

class upload_artifact(forms.Form):
    name = forms.CharField(max_length=30)
    description = forms.CharField(widget=forms.Textarea)
    content = forms.FileField()
    activity = forms.CharField(max_length=30)
    technique = forms.CharField(max_length=30)
    
    def get_fields(self):
        return self.cleaned_data
        

class update_artifactForm(forms.Form):
    name = forms.CharField(max_length=30)
    description = forms.CharField(widget=forms.Textarea)
    activity = forms.CharField(max_length=30)
    technique = forms.CharField(max_length=30)
    
    def get_fields(self):
        return self.cleaned_data           

class ActivityCreateForm(ModelForm):
    class Meta:
        model = Activity
        fields = ('name', 'description', 'date_start', 'date_end','users','project', 'activities_required', 'activities_super', 'roles', 'techniques')
    	widgets = {
    		'date_end' : AdminDateWidget,
    		'date_start' : AdminDateWidget,
    	}
    def clean(self):
        cleaned_data = super(ActivityCreateForm, self).clean()
        d1 = cleaned_data.get("date_start")
        d2 = cleaned_data.get("date_end")
        if d1 > d2:
                raise forms.ValidationError("La fecha final debe ser menor a la inicial")
        return cleaned_data


            
class ActivityUpdateForm(ModelForm):
    class Meta:
        model = Activity
        fields = ('name', 'description', 
                   'date_start', 'date_end', 'project',
                   'activities_required', 'activities_super',
'techniques')
        widgets = {
    		'date_end' : AdminDateWidget,
    		'date_start' : AdminDateWidget,
    	}

