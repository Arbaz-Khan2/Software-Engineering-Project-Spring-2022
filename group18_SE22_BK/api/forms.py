from curses.ascii import US
from dataclasses import field
import django
from django.forms import CharField, ModelForm
from django.contrib.auth.forms import UserCreationForm
from django.contrib.auth.models import User
from django import forms
from django.contrib.auth.forms import AuthenticationForm

class CreateUserForm(UserCreationForm):
    email = forms.EmailField(required=True)
    class Mata:
        model = User
        fields = ['username', 'email', 'password1', 'password2']

class UserLoginForm(AuthenticationForm):
    class Mata:
        model = User
        fields = ['username', 'email']