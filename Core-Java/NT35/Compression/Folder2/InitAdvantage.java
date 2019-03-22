/*
If we want to perform a common task in each constructor of our class then
rather than putting the code of that task in each constructr, we can put code of 
that common task in Init Block. 

Like Database connection. we may need DB connection every time we fetch data
from DB.
As you can see below codes, I did not made connection on every constructor. 
I made Only once and it will call with every constructor.

*/
class InitAdvantage{
	//InitBlock
	{
		System.out.println("Database Connection Made");
	}
	
	InitAdvantage(){
		//non-parameterized (default) constructor
	}

	//Constructor
	InitAdvantage(String name, int age){
		System.out.println("Data Inserted");
	}
	
	//Constructor
	InitAdvantage(int id){
		System.out.println("Data Fetched");
	}
	public static void main(String...a){
		new InitAdvantage("Ahmad Sayeed", 25);
		new InitAdvantage(1);
		new InitAdvantage().update(1);
		
		//but we need to create new object ref id every time.
		//if we hold ref id and recall function then init block won't 
		execute this is only for cunstructor function.
		
		InitAdvantage ia = new InitAdvantage();
		ia.update(1);
		ia.update(1); // this time no connection made onl function

	}

	void update(int id){
		System.out.println("Updated");
	}
}

