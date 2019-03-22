// Serialize and De-Serialize With User-Defined Class 

import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;

public class EmpSerialization{
	
	public static void main(String...args){
		
		ArrayList<Emp> al = new ArrayList<> ();
		al.add(new Emp(10));
		al.add(new Emp(20));
		al.add(new Emp(30));
		
		// Serialization
		try(FileOutputStream fos = new FileOutputStream("myFile1"); ObjectOutputStream oos = new ObjectOutputStream(fos); ){
			// write Object into stream
			oos.writeObject(al);
		}catch(Exception e){  e.printStackTrace();	}
		
		// DeSerialization
		System.out.println("After de-serialization");
		
		try(FileInputStream fin = new FileInputStream("myFile1"); ObjectInputStream oin = new ObjectInputStream(fin); ){
			
			// read the object from stream
			// Down cast into Array
			Object alNew1 = oin.readObject();
			ArrayList alNew = (ArrayList) alNew1;
			 Iterator<Emp> it = alNew.iterator();
			while(it.hasNext()){
				Emp e = it.next();
				System.out.println(e.x);
			} 
			
		}catch(Exception e){  e.printStackTrace();	}
	}
}

final class Emp implements Serializable{
	private final static long serialVersionUID = 456L;
	final int x;
	
	//Constructor
	Emp(int x){
		this.x = x;
	}
}