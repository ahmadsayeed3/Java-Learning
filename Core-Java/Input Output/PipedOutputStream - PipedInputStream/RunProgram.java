// Read and Write Data Simultaneously.

import java.io.*;
class ThreadWrite implements Runnable{
	PipedOutputStream pos;
	
	ThreadWrite(PipedOutputStream pos){
		this.pos = pos;
	}
	
	public void run(){
		int num = 65;
		while(true){
			
			try{
				pos.write(num);
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			
			
			if(num == 90){
				break;
			}else { ++num; }
		}
	}
}


class ThreadRead implements Runnable{
	PipedInputStream pis;
	ThreadRead(PipedInputStream pis){
		this.pis = pis;
	}
	
	public void run(){
		int num = 65;
		int x = 0;
		while(true){
			
			try{
				x = pis.read();
				System.out.println((char) x);
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		
			if(num == 90){  break; }
			else { num++; }
		}
	}
}


class RunProgram{
	
	public static void main(String...a) throws IOException{
		PipedOutputStream pos = new PipedOutputStream();
		PipedInputStream pis = new PipedInputStream();
		
		// Connect the the both streams so they will write and read together.
		pos.connect(pis);
		
		
		// Create Thread Object And Start.
		new Thread( new ThreadWrite(pos) ).start();
		new Thread( new ThreadRead(pis) ).start();
	}
}