import java.io.*;
import java.net.*;
public class MyClient
{
	Socket s;
	DataInputStream din;
	DataOutputStream dout;
	public MyClient(String name)
	{
		try
		{
			//s=new Socket("10.47.203.90",1234);
			//s = new Socket("localhost",10);
			s = new Socket("192.168.43.30",10);		// Rishi
			din=new DataInputStream(s.getInputStream());
			dout=new DataOutputStream(s.getOutputStream());
			dout.writeUTF(name);
			clientChat(name);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void clientChat(String name) throws IOException
	{
		My m=new My(din);
		Thread t = new Thread(m);
		t.start();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1;
		do
		{
			s1=br.readLine();
			dout.writeUTF(name+": "+s1);
			dout.flush();
		}
		while(!s1.equals("stop"));
	}
	public static void main(String arg[])
	{
		new MyClient("Sayeed");
	}
}
class My implements Runnable
{
	DataInputStream din;
	My(DataInputStream din)
	{
		this.din=din;
	}
	public void run()
	{
		String s2="";
		do
		{
			try
			{
				s2=din.readUTF();
				System.out.println("MM: " + s2);
			}
			catch(Exception e)
			{
				
			}
		}
		while(!s2.equals("stop"));
	}
}