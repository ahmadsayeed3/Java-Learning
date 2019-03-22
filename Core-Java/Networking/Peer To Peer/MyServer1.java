import java.io.*;
import java.net.*;
class MyServer1
{
	ServerSocket ss;
	Socket s;
	DataInputStream dis;
	DataOutputStream dos;
	public MyServer1()
	{
		try
		{
			System.out.println("Server started");
			ss =new ServerSocket(10);
			s=ss.accept();
			System.out.println(s);
			System.out.println("ClientConnected");
			dis =new DataInputStream(s.getInputStream());
			dos=new DataOutputStream(s.getOutputStream());
			serverChat();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String... s)
	{
		new MyServer1();
	}
	public void serverChat()throws IOException
	{
		String str,s1;
		do
		{
			str = dis.readUTF();
			System.out.println("Client Message"+str);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//	System.out.println();
			s1=br.readLine();
			dos.writeUTF(s1);
			dos.flush();
		}
		while(!str.equals("stop"));
	}
}