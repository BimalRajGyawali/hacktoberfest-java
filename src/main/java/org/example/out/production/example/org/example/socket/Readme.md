## ServerSocket
The ServerSocket class can be used to create a server socket. This object is used to establish communication with the clients.
### Constructors
* `ServerSocket()`
Creates an unbound server socket.
* `ServerSocket(int port)`
Creates a server socket, bound to the specified port.
### Important Methods
* `public Socket accept()`	-returns the socket and establish a connection between server and client.
* `public synchronized void close()`	-closes the server socket.
## Socket
A socket is simply an endpoint for communications between the machines. The Socket class can be used to create a socket.
### Constructors
* `Socket()` Creates an unconnected socket, with the system-default type of SocketImpl.
* `Socket(InetAddress address, int port)` Creates a stream socket and connects it to the specified port number at the specified IP address.
* `Socket(String host, int port)` Creates a stream socket and connects it to the specified port number on the named host.
### Important Methods
* `public InputStream getInputStream()`	-returns the InputStream attached with this socket.
* `public OutputStream getOutputStream()`	-returns the OutputStream attached with this socket.
* `public synchronized void close()`	-closes this socket