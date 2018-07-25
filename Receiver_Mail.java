package info.sender;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;
public class Receiver_Mail {
  
	public static void main(String[] args) throws IOException{
    ServerSocket serversocket=new ServerSocket(1234);
    Socket accept=serversocket.accept();
	DataInputStream din=new   DataInputStream(accept.getInputStream());
    String readUTF=din.readUTF();
    
    String name=readUTF();
    System.out.println("Message"+name);
    serversocket.close();
    
    
	
	}

	private static String readUTF() {
		// TODO Auto-generated method stub
		return GOOD;
		
	}
}


