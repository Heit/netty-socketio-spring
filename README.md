#Netty-socket.io Demo with SpringFramework

Demo for [Netty-socketio](https://github.com/mrniko/netty-socketio) project.

#Usage example

1. Run server by command
   `mvn spring-boot:run` 
    
2. Or build single executable jar file with
   `mvn package`

3. Run single jar
   `java -jar wss-server.jar`
   
#Client

Client code can be found at [Netty-socketio-demo](https://github.com/mrniko/netty-socketio-demo)
 
#Brief description

This is just a very simple example on how to use Netty-socketio in Spring. This project also shows how to exclude 
CommandLineRunner from the test configuration (if we don't, it will run during test phase in `mvn package`).

