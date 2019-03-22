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
			//s=new Socket("192.168.43.46",10);
			s = new Socket("localhost",10);
			din=new DataInputStream(s.getInputStream());
			dout=new DataOutputStream(s.getOutputStream());
			dout.writeUTF(name);
			//clientChat(name);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void clientChat(String name, String data, ChatClient cc) throws IOException
	{
		My m=new My(din,cc);
		Thread t = new Thread(m);
		t.start();
		
		dout.writeUTF(name+": "+data);
		dout.flush();
		
		/*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1;
		do
		{
			s1=br.readLine();
			dout.writeUTF(name+": "+s1);
			dout.flush();
		}
		while(!s1.equals("stop"));*/
	}
	public static void main(String arg[])
	{
		new MyClient("Sayeed");
	}
}
class My implements Runnable
{
	DataInputStream din;
	ChatClient cc;
	My(DataInputStream din, ChatClient cc)
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
				//cc.allMessageText.setText(cc.allMessageText.getText() + "\n" + s2);
				cc.allMessageText.setText("\n" + s2);
			}
			catch(Exception e)
			{
				
			}
		}
		while(!s2.equals("stop"));
	}
}