// Serialization: A process to convert an object to stream.
	// Later we will save that stream into files.

/* 
	1. Compile All Java Files: 		javac *.java
	2. To Serialize the object: 	java MyClientOne
	3. To De-serialize: 			java MyServerOne
*/

// Program 1:

import java.io.*;
class ParentClass{
	int z;
}
	
class AssociateClass{
	int j;
}
	
class ClassOne  extends ParentClass implements Serializable{
	int age;
	String name; 
	transient int y;	// Won't save
	static String ss;	// Won't save
	static String newBorn = "Ahmad"; 	// Won't save but come back because it will reborn every time while DeSerialization.
	AssociateClass ac;
	
	// Highly Recommend to define this. If i don't define then Java runtime will by default.
		// But default declaration will create problem.
	private final static long serialVersionUID = 101L;
	
	
	
	// At the time DeSerialization this constructor won't execute again.
	ClassOne(int age, String name, int y, String ss, int z){
		this.age = age;
		this.name = name;
		this.y = y;
		this.ss = ss;
		this.z = z;		// Won't save because parent class has not implemented Serializable interface. 
		
		// This will throw: NotSerializableException
		// this.ac = new AssociateClass(); //  Won't save because class of associated must be implementing Serializable interface.
	}
	
}


// Now Serialized the "ClassOne" 

class MyClientOne{
	
	// ObjectOutputStream converts the object into Stream and write where-ever we want.
		// Below case I am writing into file.
	ObjectOutputStream oos;
	ObjectOutputStream oos1;
	
	MyClientOne(){
		try{
			ClassOne co = new ClassOne(24, "Ahmad Sayeed", 100, "Some Text", 200);
			ClassOne co1 = new ClassOne(22, "Anonymous", 400, "Love Text", 800);
			
			this.oos = new ObjectOutputStream(new FileOutputStream("Serz1.txt"));
			oos.writeObject(co);
			
			oos.flush(); 	// clearing the buffer.
			
			// We can serialize more than objects with same object of "ObjectOutputStream" in a same file.
			oos.writeObject(co1);
			
			System.out.println("Object Serialized");
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String...a){
		new MyClientOne();
	}
}


// At the age of 70, Trying to De-serialize. 

class MyServerOne{
	
	// ObjectInputStream converts back Stream to Object.
	ObjectInputStream ois;
	
	MyServerOne(){
		try{
			this.ois = new ObjectInputStream(new FileInputStream("Serz1.txt"));
			// Stores in FIRST IN FIRST OUT
			ClassOne co = (ClassOne) ois.readObject();
			ClassOne co1 = (ClassOne) ois.readObject();
			
			System.out.println("Age: " + co.age);
			System.out.println("Name :" + co.name);
			System.out.println("Y :" + co.y);
			System.out.println("SS :" + co.ss);
			System.out.println("New Born :" + co.newBorn);
			System.out.println("AssociateClass :" + co.ac);
			
			System.out.println("==============");
			
			System.out.println("Age: " + co1.age);
			System.out.println("Name :" + co1.name);
			System.out.println("Y :" + co1.y);
			System.out.println("SS :" + co1.ss);
			System.out.println("New Born :" + co1.newBorn);
			System.out.println("AssociateClass :" + co1.ac);
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String...a){
		new MyServerOne();
	}
}