// Callable Interface

/*
Sometimes we wish that a thread return some value that we can use. Java 5 introduced "java.util.concurrent.Callable" interface
in concurrency package that is similar to "Runnable" interface but it can return any object and able to throw exception.

Callable interface use Generic to define the return type of object. Executors class provide useful methods to execute callable
in a thread pool. Since callable tasks run in a parallel; we have to wait for the returned object. Callable tasks return
java.util.concurrent.Future object. Using Future we can find out the status of the callable task and get the returned object. 
It provides get() method that can wait for the callable to finish and then return the result.

Future provides cancel() method to cancel the associated callable task. 
There is a overloaded version of get() method where we can specify the time to wait for the result, its useful to avoid
current thread getting blocked for longer time. There are isDown() and isCancelled() methods to find out the current status
of associated callback task.

Here is a simple example of callable task that returns the name of thread executing the task after one second. We are using
"Executor" framework to execute 10 tasks in parallel and use "Future" to get the result of the submitted tasks.

Once we execute the program, we will notice the delay in output because Future.get() method wait for the callable task to 
complete.

When we submit a callable object to an Executor the framework returns an object of type java.util.concurrent.Future.
This Future object is used to check the results of a callable.

use the get() method to retrieve result of the future.

call() method is same as Runnable's run() but callable only used via ThreadPool. Thread class does not have constructor that accepts callable object.

run() method return type is void but call() has generic return type.
We can't add try-catch in run() method but on call() method we can add try-catch block.
*/


import java.util.concurrent.*;
import java.util.*;

class MyCallable implements Callable{
	
	@Override
	public String call() throws Exception{
		Thread.sleep(2000);
		
		//return name of the thread
		return ("Returned Value: " + Thread.currentThread().getName());
	}
}

public class MyCallableTest{
	
		
	public static void main(String...args){
		
		// Making object of 5 threads and sending them in pool.
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		// collection to store the result. An ArrayList that accepts Future<String> type data.
		ArrayList<Future<String>> list = new ArrayList<Future<String>> ();
		
		//now let's get and store returned data and add in the collection.
		for(int i=0; i<10; i++)	{
			
			// Executor framework has method submit() that accepts our thread-callable object and call the call().
			Future<String> future = executor.submit( new MyCallable() );
			list.add(future);
		}
		
		// Now let's print the result.
		for(Future<String> f: list){
			try{
				System.out.println(f.get());
			}catch(Exception e){	e.printStackTrace();	}
		}
	}
}
