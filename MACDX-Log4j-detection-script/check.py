# import package that can send http requests
import requests
import sys

# define function that will send a post request
def post_form(ip, username, password):

    url = "http://" + ip + ":8080/Authorize"
    data = {"username": username, "password": password}

    response = requests.post(url, data=data)

    return response



def main(ip):
    try:
        response_html = post_form(ip, "admin", "1120530218@ccit.ndu.edu.tw")
        # print(response_html.text)
        if "picture1.jpg" in response_html.text:
            print("alive")
            exit(1)
        else:
            print("dead")
            exit(0)
    except requests.exceptions.RequestException as e:
        # print("Error:", e)
        print("dead")
        exit(0)
        
    

if __name__ == '__main__':
    # get arguments from command line
    ip = sys.argv[1]
    main(ip)