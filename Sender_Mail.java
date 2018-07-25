package info.sender;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
public class  Sender_Mail {

	public static void main(String[] args) throws UnknownHostException,IOException
	{
     Socket socket=new Socket("localhost",1234);
     DataOutputStream obj=new DataOutputStream(socket.getOutputStream());
     obj.writeUTF("Hello Sender");
     obj.flush();
     obj.close();
     socket.close();
	
	}

}
