// BlockingQueue interface: It is used to share data from one thread to another thread. ArrayBlockingQueue implements BlockingQueue.
// A BlockingQueue with one thread putting into it and another thread taking from it.
/*
Why is it called BlockingQueue?
// Suppose you are writing somewhere that place is full. Or You want read something from somewhere and that is empty. This
is a type of case when exception can come so BlockingQueue sees if there is nothing to read then the thread that works to read
will blocked. Same as if we want to write something somewhere and there is no space then it will block the thread that works to 
write until some space available. Just simply consider Enqueue = Write and Dequeue = Read.

A Blocking queue is a queue that blocks when you try to dequeue from it and the queue is empty, or if you are try to enqueue
items to it and the queue is already full. A thread trying to dequeue from an empty queue is blocked until some other thread
inserts an item into the queue.
A thread try to enqueue an item in a full queue is blocked until some thread makes space in the queue, either by dequeuing one
or more items or cleaning the queue completely.

A BlockingQueue with one thread putting into it and another thread taking from it.
Java 5 comes with blocking queue implementation in the java.util.concurrent.BlockingQueue package.

The example uses the ArrayBlockingQueue implementation of the BlockingQueue interface.

*/

import java.util.concurrent.*;
import java.util.*;


public class BlockingQueueEx{
	
	public static void main(String...args){
		try{
			ArrayBlockingQueue queue = new ArrayBlockingQueue(5);
			
			//Producer class that will enqueue the data
			Producer producer = new Producer(queue);
			
			// Consumer class that will dequeue the data
			Consumer consumer = new Consumer(queue);
			
			System.out.println("Starting Producer");
			new Thread(producer).start();
			
			System.out.println("Starting Consumer");
			new Thread(consumer).start();
			
		}catch(Exception e){ 	e.printStackTrace();	}
	}
}

// Producer class, It sleeps 3 seconds between each put() call.
// This will cause the consumer to block, while waiting for object in the queue.

class Producer implements Runnable{
	
	protected BlockingQueue queue = null;
	
	//Constructor
	public Producer(BlockingQueue queue){
		this.queue = queue;
	}
	
	@Override
	public void run(){
		try{
			queue.put("String One");
			Thread.sleep(3000);
			
			queue.put("String Two");
			Thread.sleep(3000);
			
			queue.put("String Three");
		}catch(InterruptedException e)	{	e.printStackTrace();	}
	}
}

// Consumer class: It takes out the object from the queue and prints them to System.out.

class Consumer implements Runnable{
	
	protected BlockingQueue queue = null;
	
	//Constructor
	public Consumer(BlockingQueue queue){
		this.queue = queue;
	}
	
	@Override
	public void run(){
		try{
			System.out.println(queue.take());
			System.out.println(queue.take());
			System.out.println(queue.take());
		}catch(Exception e) {	e.printStackTrace();	}
	}
}
