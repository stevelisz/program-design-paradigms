#spec
Apply multithreaded knowledge. -completed  
Create client and server. -completed  
Client send request. -completed
Server handle request. -completed
Server send response. -completed
Client handle response. -completed.  
#description  
Client class: start client threads.  
ClientProtocol: client protocol to process whatever is being sent from user or response from server.  
CloseUtil: This class simply provides a static method to close all the closables.  
Receive: Receive thread of client.  
Send: Send thread of client.  

ClientPath: This class represents clientPath object that connected to the server to handle communication between server and client.  
Server: start server threads.  
ServerProtocol: server protocol to process incoming requests.  
#assumption  
we assume user will follow possible commands.  
#correctness  
we tested all possible commands against server and test as many as scenarios we can think of.
#usage  
run Server and Client in terminal, you can run 1 server and multiple clients. You can change 
the server address in those classes too.
• logoff: sends a DISCONNECT_MESSAGE to the server  
• who: sends a QUERY_CONNECTED_USERS to the server  
• @user: sends a DIRECT_MESSAGE to the specified user to the server  
• @all: sends a BROADCAST_MESSAGE to the server, to be sent to all users connected  
• !user: sends a SEND_INSULT message to the server, to be sent to the specified user  
• ?: sends a list of possible commands.

#dependencies
in build.gradle  
implementation files('lib/assignment4.jar')  