import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.util.Scanner;
class ServerChat{
	public static void main(String[] args){
		try{

			// server listening at port 9999
			ServerSocket serverSocket = new ServerSocket(9999);
			System.out.println("listening...");
			Socket socket = serverSocket.accept();
			System.out.println("Connected.");

			// creating input stream to recieve data from client to server
			DataInputStream dis = new DataInputStream(socket.getInputStream());

			// creating output stream to send data from server to client
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			String input = "";
			while(true){
				
				// recieving message from client to server
				input = (String)dis.readUTF();
				System.out.println(input);
				System.out.print("-: ");
				String message = new Scanner(System.in).nextLine();

				// sending message from server to client
				dos.writeUTF(message);
				dos.flush();
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}