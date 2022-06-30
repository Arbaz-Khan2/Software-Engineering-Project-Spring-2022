from django.conf import settings
from django.core.mail import send_mail
from rest_framework.response import Response
import random

def generate_otp(len):
    otp = ""
    for i in range(len):
        otp = otp + f'{random.randint(0,9)}'
    return otp

def send_email_to_user(email):
    subject = "Verify Your Email"
    otp = generate_otp(5)
    message = f'Your OTP is {otp}'
    email_from = settings.EMAIL_HOST

    send_mail(subject, message, email_from, [email])
    return Response({"email": email, "otp" : otp})