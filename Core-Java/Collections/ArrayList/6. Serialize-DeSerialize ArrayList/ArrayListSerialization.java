// Serialize and De-Serialize Predefined class "ArrayList"

import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;

public class ArrayListSerialization{
	
	public static void main(String...args){
		
		ArrayList<String> al = new ArrayList<> ();
		al.add("Hello");
		al.add("Hi");
		al.add("Welcome");
		
		// Serialization
		try(FileOutputStream fos = new FileOutputStream("myFile"); ObjectOutputStream oos = new ObjectOutputStream(fos); ){
			// write Object into stream
			oos.writeObject(al);
		}catch(Exception e){  e.printStackTrace();	}
		
		// DeSerialization
		System.out.println("After de-serialization");
		
		try(FileInputStream fin = new FileInputStream("myFile"); ObjectInputStream oin = new ObjectInputStream(fin); ){
			
			// read the object from stream
			// Down cast into Array
			ArrayList alNew = (ArrayList) oin.readObject();
			Iterator it = alNew.iterator();
			while(it.hasNext()){
				System.out.println(it);
			}
			System.out.println(alNew);
		}catch(Exception e){  e.printStackTrace();	}
	}
}