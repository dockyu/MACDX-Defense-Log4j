import socket

HOST = ''  # empty string means localhost
PORT = 9898

# create a socket object
with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    # bind the socket to a specific address and port
    s.bind((HOST, PORT))
    # listen for incoming connections
    s.listen()

    print(f"Listening on port {PORT}...")

    while True:
        # accept a connection
        conn, addr = s.accept()
        print(f"Connection from {addr[0]}:{addr[1]}")

        with conn:
            while True:
                # receive data from the client
                data = conn.recv(1024)
                if not data:
                    break

                try:
                    # check if the received data is a number
                    message = str(data.decode())
                    print(f"Received : {message}")
                except e:
                    pass