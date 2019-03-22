// Externalization is an another way to achieve serialization but in a customized way.
// Externalizable extends Serializable interface.

import java.io.*;
class ClassOne extends Temp implements Externalizable{ 	
	
	//private final static long serialVersionUID = 2L;
	//private final static long serialVersionUID = 101L;
	
	// Can't make these fields private because after De-serialization, won't be able to access.
	int age;
	String name;
	transient String address; 
	static String job;
	int notSaving;
	
	// default constructor is required when achieving synchronization with Externalization.
	// it also must be public, because it run from outside. First non-parameterized constructors run then readExternal() method executes.
	public ClassOne(){
		this.age = 55;		// this value won't come while de-serialization.
		System.out.println ("Default Constructor Running");
	}
	
	ClassOne(int age, String name, String address, String job){
		this.age = age;
		this.name = name;
		this.address = address;
		this.job = job;
		this.notSaving = 200;
	}
	
	// required to override Externalizable interface methods. In this method, we define what details we want serialize.
	public void writeExternal(ObjectOutput out) throws IOException{
		System.out.println("Inside writeExternal()");
		
		// In this case, I can write my liked data member even transient and static.
		out.writeInt(this.age);		
		out.writeObject(this.name);
		out.writeObject(this.address);
		out.writeObject(this.job);
	}
	
	// required to override. In this method we will define what data we want to retrieve.
	public void readExternal(ObjectInput in) throws IOException, FileNotFoundException, ClassNotFoundException{
		System.out.println("Inside readExternal()");
		this.age = in.readInt();
		this.name = (String) in.readObject();
		this.address = (String) in.readObject();
		this.job = (String) in.readObject();
	}
	
	public String toString(){
		return "Name: " + this.name + ", Age: " + this.age + ", Address: " + this.address + ", Job: " + this.job + ", NotSaving: " + this.notSaving;
	}
}


class Temp implements Serializable{
	Temp(){
		
	}
	int tmp = 10;
}

class MyClient{
	public static void main(String...a){
		ClassOne co1 = new ClassOne(24, "Ahmad Sayeed", "New Delhi", "Java Developer");
		ClassOne co2 = null;
		
		// Let's serialize the "ClassOne" class. Store object with current state in file.
		try{
			FileOutputStream fos = new FileOutputStream("tmp.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(co1);
			oos.flush();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
		// NOw let's De-serialize. convert file to object
		try{
			FileInputStream fis = new FileInputStream("tmp.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			co2 = (ClassOne)ois.readObject();
			
		}catch(Exception e){
			System.out.print(e);
			e.printStackTrace();
		}
		
		System.out.println("Original Object is: " + co1);
		System.out.println("De-serialized Object is: " + co2);
		
		System.out.println("De-serialization data = Name: " + co2.name + ", Age: " + co2.age + ", Address: " + co2.address + ", Job: " + co2.job + ", NotSaving: " + co2.notSaving);
	}
}

