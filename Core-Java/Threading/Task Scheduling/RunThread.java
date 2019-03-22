// Task-Scheduling is used to run a task at scheduled time.
	// You can see, I am inheriting TimeTask that also implements runnable interface. 

import java.util.*;
import javax.swing.JFrame;

class ThreadOne extends TimerTask {
	
	int count = 1;
	
	// run() is a abstract method that defines task performed at scheduled time.
	
	public void run(){
		if(count == 20){
			System.exit(0);
		}
		
		JFrame jf = new JFrame();
		jf.setSize(250,300);
		jf.setVisible(true);
		
		count++;
	}
}

class RunThread{
	public static void main(String...a){
		ThreadOne to = new ThreadOne();
		Timer tm = new Timer();
		
		// First time running: delay from current time.
		int delay = 5000;
		
		// Repeating after every defined period
		int period = 1000;
		
		// Schedule the task.
		System.out.println("Task will start after 5 seconds");
		tm.scheduleAtFixedRate(to, delay, period);
	}
}