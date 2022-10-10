package org.example.datagramsocket;

import java.net.InetAddress;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;
class Client{
	public static void main(String[] args) throws SocketException,IOException,UnknownHostException{
		int send = 9999,receive = 1000;

		//Constructs a datagram socket and binds it to 9999 port on the local host machine.
		DatagramSocket datagramSocket = new DatagramSocket(send);
		InetAddress inetAddress = InetAddress.getLocalHost();
		System.out.println("Make sure server is started.\nEnter your message");
		while(true){

			//Constructs a DatagramPacket for receiving packets of length 1024.
			byte data[] = new byte[1024];
			DatagramPacket dp = new DatagramPacket(data,data.length);

			String message = new Scanner(System.in).nextLine();
			data = message.getBytes();

			//Constructs a datagram packet for sending packets of length 1024 to 1000 port number on the localhost.
			DatagramPacket dpSend = new DatagramPacket(data,data.length, inetAddress, receive);

			//Sends a datagram packet from this socket.
			datagramSocket.send(dpSend);

			//	Receives a datagram packet from this socket.
			datagramSocket.receive(dp);
			System.out.println("-: "+new String(dp.getData(),0,dp.getLength()));
		}
		// datagramSocket.close();
	}
}