// In this program, we are not starting a thread but only giving it memory.

class ThreadOne extends Thread{
	ThreadOne(String s){
		super(s);
	}
}

class ThreadTwo extends Thread{
	ThreadTwo(String s){
		super(s);
	}
}

class ThreadThree extends Thread{
	ThreadThree(String s){
		super(s);
	}
}

class RunThread{
	
	public static void main(String[] a){
		ThreadOne to = new ThreadOne("Thread One");
		ThreadOne tt = new ThreadOne("Thread Two");
		ThreadOne tth = new ThreadOne("Thread Three");
		
		System.out.println(to.getName());
		System.out.println(tt.getName());
		System.out.println(tth.getName());
		
		System.out.println(Thread.currentThread().getName());
	}
}