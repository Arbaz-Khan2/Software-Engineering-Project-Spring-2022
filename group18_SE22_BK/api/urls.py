from venv import create
from django.urls import path
from . import views

urlpatterns = [
    path('', views.getRoutes),
    path('user/',views.getUsers),
    path('user/create/',views.createUser),
    path('user/<str:identity>/update',views.updateUser),
    path('user/<str:identity>/delete',views.deleteUser),
    path('user/<str:identity>/',views.getUser),
    
    # path('signup/', views.signupPage, name="signup"),
    # path('login/', views.loginPage, name="login"),
    # path('check/', views.loginPage, name="check")

]