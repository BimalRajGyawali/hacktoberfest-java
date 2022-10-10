import java.net.Socket;
import java.util.Scanner;
import java.io.DataOutputStream;
import java.io.DataInputStream;
class Client{
	public static void main(String[] args){
		try{
			System.out.println("Connecting to server.");

			// make connection to server listening in localhost at post 9999
			Socket socket = new Socket("localhost",9999);
			System.out.println("Request Accepted.\n Connection Established.");

			// creating output stream to send data from client to server
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			
			//creating input stream to recieve data from server to client
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String input = "";
			while(true){
				System.out.print("-: ");
				String message = new Scanner(System.in).nextLine();

				// sending message from client to server
				dos.writeUTF(message);
				dos.flush();

				//recieving message from server to client
				input = dis.readUTF();
				System.out.println(input);

			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}