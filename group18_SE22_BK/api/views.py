from re import U
from rest_framework.decorators import api_view
from rest_framework.response import Response
from yaml import serialize
from .serializers import UserSerializer
from .models import Users
@api_view(['GET'])
def getRoutes(request):
    routes = [
        {
            'Endpoint':'/user/',
            'method':'GET', 
            'body':None,
            'description':'Returns an array'
        },
        {
            'Endpoint':'/user/id',
            'method':'GET',
            'body':None,
            'description':'Returns a Single Object'

        },
        {
            'Endpoint':'/user/create/',
            'method':'POST',
            'body':{'body':""},
            'description':'Creates new entry with data sent in post Request'
        },
        {

            'Endpoint':'/user/id/update',
            'method':'PUT',
            'body':{'body':""},
            'description':'Updates the Existing database'
        },
        {

            'Endpoint':'/user/id/delete',
            'method':'DELETE',
            'body':None,
            'description':'Deletes Existing data'
        }
        
    ]
    return Response(routes)

@api_view(['GET'])
def getUsers(request):
    user = Users.objects.all()
    serializer = UserSerializer(user, many = True)
    return Response(serializer.data)

@api_view(['GET'])
def getUser(request, identity):
    user = Users.objects.get(id=identity)
    serializer = UserSerializer(user, many = False)
    return Response(serializer.data)

@api_view(['POST'])
def createUser(request):
    data = request.data
    user = Users.objects.create(
        name = data['name'],
        email = data['email']
    )
    serializer = UserSerializer(user, many = False)
    return Response(serializer.data)


@api_view(['PUT'])
def updateUser(request, identity):
    data = request.data
    user = Users.objects.get(id = identity)
    serializer = UserSerializer(user, data = request.POST)
    if serializer.is_valid():
        serializer.save
    return Response(serializer.data)


@api_view(['DELETE'])
def deleteUser(request,identity):
    user = Users.objects.get(identity=id)
    user.delete()
    return Response('user is Deleted')

