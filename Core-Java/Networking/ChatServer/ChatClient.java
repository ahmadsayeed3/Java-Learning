import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ChatClient implements ActionListener{
	JFrame jf, dashboard;
	JTextField ULText, ULPass, USText, USPass, USFName, writeText;
	JTextArea allMessageText;
	JButton loginButton, signButton, sendButton;
	JPanel centerPanel, lp, sp, dashSouth, dashWest,dashCenter;
	String uName, pass, fName;
	boolean loginStatus = false;
	MyClient mc;
	
	public ChatClient(){
		// Create Chat UI:
		jf = new JFrame("LogIn / SignIn");
		
		// Design Login Panel
		loginPanel();
		signinPanel();
		
		// Design Dashboard
		//dashboard();
		
		/* Setting the background color of content pane WHITE */
		jf.getContentPane().setBackground(Color.WHITE);
		
		/* Changing the default frame icon*/
		//jf.setIconImage(Toolkit.getDefaultToolkit().getImage("icons/pc.png"));
		
		/* Window will close if press on close button */
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* The frame will open with full height and width*/
		//jf.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		
		/* JFrame size will be 600x600 if clicked on maximized button */
		jf.setSize(400,600);
		
		
		/* Showing the frame finally */
		jf.setVisible(true);
	}
	
	public static void main(String...a){
		new ChatClient();
	}
	
	// Login Panel GUI
	public void loginPanel(){
		JLabel username1 = new JLabel("Enter User Name");
		ULText = new JTextField("ahmad");
		ULText.setPreferredSize(new Dimension(300,32));
		
		JLabel password1 = new JLabel("Enter Password");
		ULPass = new JTextField("12345");
		loginButton = new JButton("Login");
		
		JLabel divider = new JLabel("\n=======Create New Account ==========");
		
		lp = new JPanel();
		lp.setLayout(new GridLayout(6,1,5,5));
		lp.add(username1);
		lp.add(ULText);
		lp.add(password1);
		lp.add(ULPass);
		lp.add(loginButton);
		
		// Adding Divider..
		lp.add(divider);
		
		centerPanel = new JPanel();
		centerPanel.add(lp);
		jf.add(BorderLayout.CENTER, centerPanel);
	}

	// SignIn Panel GUI
	public void signinPanel(){
		
		JLabel fullName = new JLabel("Enter Full Name");
		USFName = new JTextField();
		
		JLabel username2 = new JLabel("Enter User Name");
		USText = new JTextField();
		USText.setPreferredSize(new Dimension(300,32));
		
		JLabel password2 = new JLabel("Enter Password");
		USPass = new JTextField();
		signButton = new JButton("SignIn");
		
		
		sp = new JPanel();
		sp.setLayout(new GridLayout(7,1,5,5));
		sp.add(fullName);		// fullName
		sp.add(USFName);
		sp.add(username2);		// UserName
		sp.add(USText);			// 
		sp.add(password2);
		sp.add(USPass);
		sp.add(signButton);

		centerPanel.add(sp);
		
		loginButton.addActionListener(this);
		signButton.addActionListener(this);
		//jf.add(BorderLayout.CENTER, centerPanel);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == signButton){
			String fullName = USFName.getText();
			String userName = USText.getText();
			String password = USPass.getText();
			String data = userName+","+password+","+fullName+";";
			// Storing information in file.
			storeInformtion("users.txt",data);
		}
		
		if(e.getSource() == loginButton){
			String userName = ULText.getText();
			String password = ULPass.getText();
			
			// very user and login etc
			if(loginVerify(userName, password)){
				System.out.println("User Match");
					jf.setVisible(false);
					
					// launch the Chat dashboard
					dashboard();
					// Start The ClientChatSocket
					this.mc = new MyClient(this.fName);
			}else{
				System.out.println("User Does Not Match");
			}
		}
		System.out.println("Hello585858585858");
		if(e.getSource() == sendButton){
			String data = writeText.getText();
			try{
				this.mc.clientChat(this.fName, data, this);
			}catch(Exception e1){ System.out.println(e1); }
			//writeText.setText("");
			//allMessageText.setText(allMessageText.getText() + "\n" + this.fName+": " + data);
		}
		
		System.out.println("Hello");
	}
	
	public void storeInformtion(String file, String data){
		try(FileOutputStream fin = new FileOutputStream(file,true)){
			fin.write(data.getBytes());
		}catch(Exception e){
			System.out.println();
		}finally{
			//fin.flush();
			//fin.close();
		}
	}
	
	public boolean loginVerify(String userName, String password){
		System.out.println(userName + ","+password);
		// Get All User Information as String...
		String data = getFileDataAsString("users.txt");
		//data = "ahmad,12345,Ahmad Sayeed;prem,12345,Prem Kumar";
		System.out.println(data);
		
		String[] user = data.split(";");
		System.out.println(user.length);
		for(int i=0; i<user.length; i++){
			String[] u1 = user[i].split(",");
			System.out.println(u1[0] + ","+ u1[1]);
			if(u1[0].equals(userName) && u1[1].equals(password)){
				System.out.println("User Match");
				// Make Login Status True;
					this.loginStatus = true;
					this.uName = userName;
					this.pass = password;
					this.fName = u1[2];
				// Break the loop
				return true;
			}
		}
		
		
		return false;
	}
	
	public String getFileDataAsString(String file){
		String data="";
		try(BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file))){
			byte b;
			while( ( b = (byte) bi.read()) != -1 ){
				//System.out.print((char) b);
				data+=(char) b;
			}
		
		}catch(IOException e){
			e.printStackTrace();
		}
		
		return data;
	}
	
	public void dashboard(){
		
		dashboard = new JFrame(this.fName);
		
		/*Start - all messages printing */
		// get all messages from file and print on text area.
		String oldMessage = getAllMessages();
			allMessageText = new JTextArea(oldMessage);
			allMessageText.setEditable(false);
			allMessageText.setPreferredSize(new Dimension(250,500));
			
			dashCenter = new JPanel();
			dashCenter.add(allMessageText);
			dashboard.add(BorderLayout.CENTER,dashCenter);
		/*End - all messages printing */
		
		/* Start ---  Send Message and Button -- */
		writeText = new JTextField();
		writeText.setPreferredSize(new Dimension(250,32));
		sendButton = new JButton("send");
		sendButton.addActionListener(this);
		
		JPanel sendPanel = new JPanel();
		sendPanel.add(writeText);
		sendPanel.add(sendButton);
		/* End -- Send Message and Button ---*/
		
		dashSouth = new JPanel();
		dashSouth.add(sendPanel);
		
		dashboard.add(BorderLayout.SOUTH, dashSouth);
		
		/* Setting the background color of content pane WHITE */
		dashboard.getContentPane().setBackground(Color.WHITE);
		
		/* Changing the default frame icon*/
		//dashboard.setIconImage(Toolkit.getDefaultToolkit().getImage("icons/pc.png"));
		
		/* Window will close if press on close button */
		dashboard.setDefaultCloseOperation(dashboard.EXIT_ON_CLOSE);
		
		/* The frame will open with full height and width*/
		//dashboard.setExtendedState(dashboardrame.MAXIMIZED_BOTH); 
		
		/* dashboard size will be 600x600 if clicked on maximized button */
		dashboard.setSize(400,600);
		
		
		/* Showing the frame finally */
		dashboard.setVisible(true);
	}
	
	public String getAllMessages(){
		String data = "";
		// Read data line by line.
		try(BufferedReader br = new BufferedReader(new FileReader("chat.txt"))){
			String s1 = " ";
			
			while(s1 != null){
				s1 = br.readLine();			// read data line by line
				if(s1!=null){
					//s1 = s1.trim().toLowerCase();	// removing spaces from lines
					data+=s1+"\n";			// Adding only one space because new line does have space and words are splitting by space 
				}
			}
		
		}catch(Exception e){	e.printStackTrace();		}
		
		return data;
	}
}