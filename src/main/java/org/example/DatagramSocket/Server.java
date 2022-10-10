import java.net.InetAddress;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.InetSocketAddress;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
class Server{ 
	public static void main(String[] args) throws SocketException,IOException,UnknownHostException{
		int send = 9999,receive = 1000;

		//Constructs a datagram socket and binds it to 1000 port on the local host machine.
		DatagramSocket datagramSocket = new DatagramSocket(receive);
		InetAddress inetAddress = InetAddress.getLocalHost();
		System.out.println("Waiting for client");
		while(true){

			//Constructs a DatagramPacket for receiving packets of length 1024.
			byte data[] = new byte[1024];
			DatagramPacket dp = new DatagramPacket(data,data.length);

			//	Receives a datagram packet from this socket.
			datagramSocket.receive(dp);
			System.out.println("-: "+new String(dp.getData(),0,dp.getLength()));

			String message = new Scanner(System.in).nextLine();

			//Constructs a datagram packet for sending packets of length 1024 to 1000 port number on the localhost.
			DatagramPacket dpSend = new DatagramPacket(message.getBytes(),message.length(), inetAddress, send);

			//Sends a datagram packet from this socket.
			datagramSocket.send(dpSend);
		}
		// datagramSocket.close();
	}
}