from pyexpat import model
from django.db import models

# Create your models here.
class Users(models.Model):
    name = models.CharField(max_length=122)
    email = models.CharField(max_length=122)
    
    def __str__(self):
        return self.name
