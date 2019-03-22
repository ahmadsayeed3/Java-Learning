// Create My Own DeQueue
import java.io.IOException;
import java.util.Scanner;
 class Link{
	 String iData;
	 public Link next;
	 public Link previous;

	 
	 // Constructor
	 public Link(String iData){
		 this.iData = iData;
	 }
	 
	 @Override
	 public String toString(){
		 return "{ " + iData + " }";
	 }
 }
 
 
 //LinkedList
 
 class LinkedList{
	 
	 private Link first;
	 private Link last;
	 //Constructor
	 public LinkedList(){
		 first = null;
		 last = null;
	 }
	 
	 public boolean isEmpty(){
		 return (first == null); 	// returns true if first is null.
	 }
	 
	 public void insertFirst(String id){
		 Link newLink = new Link(id);
		 newLink.next = first;
		 newLink.previous = last;
		 first = newLink;
		 last = newLink;
	 }
	 
	 public void insertLast(String id){
		
	 }
	 
	 public Link deleteFirst(){
		if(isEmpty()){ return null; } 
		else{
			Link temp = first;
			first = first.next;
			return temp;
		}
	 }
	 
	 @Override
	 public String toString(){
		 String str = "";
		 Link current = first;
		 while(current != null){
			 str+= current.toString();
			 current = current.next;
		 }
		 
		 return str;
	 }
 }
 
 
 // Class that using all those classes.
 public class MyLinkedList{
	 
	 Scanner sc;
	 String message;
	 String addEMessage;
	 LinkedList theList;
	 boolean elemenAtFirstAdded;
	 boolean deletedFromFirst;
	 //Constructor
	 MyLinkedList(){
		 theList = new LinkedList();
		 sc = new Scanner(System.in);
		 message = "1: Add Element\n2: Display Elements\n3: Delete\n4: Exit";
		 addEMessage = "1: Add element at first\n2: Add element at last\n3: Back";
	 }
	 
	 public void doWork(){
		
		 System.out.println(message);
		 
		 boolean b = true;  
		 String choiceMessage =  "Alexa: Please enter your choice: ";
		 while(b){
			 System.out.print(choiceMessage);
			 String str = sc.next();
			 if(!isNumeric(str)){ choiceMessage = "Please enter valid number: "; continue; }
			 
			 int choice = Integer.parseInt(str);
			 if(choice < 0 || choice > 5 ){	choiceMessage = "Please enter valid number: "; continue; }
			 
			 switch(choice){
				case 1: addElement();
						b = false;
						break;
				case 2: displayElements();
						b = false;
						break;
				case 3: deleteElements();
						b = false;
						break;
				case 4: exit();
						b = false;
						break;
				default: 
						choiceMessage = "Please enter valid choice: ";
						continue;
			 }
		 }
	 }
	 
	 public static void main(String...a){
		 
		 
		 MyLinkedList mLL = new MyLinkedList();
		 mLL.doWork();
		 
		 /*
		 System.out.println(theList);
		 
		 
		 
		 // Now Let's delete the all elements
		 while(!theList.isEmpty()){
			 Link aLink = theList.deleteFirst();
			 System.out.println("Deleted item is: " + aLink);
		 }
		 
		 System.out.println("");
		 System.out.println("Elements rest are: " + theList);*/
	 }
	 
	 public void addElement(){
		 cls();
		 if(elemenAtFirstAdded){ System.out.println("Element are added, you can add again"); elemenAtFirstAdded = false; }
		 System.out.println(addEMessage);
		 boolean b = true;  
		 String choiceMessage = "Alexa: Please enter your choice: ";
		 while(b){
			 System.out.print(choiceMessage);
			 String str = sc.next();
			 if(!isNumeric(str)){ choiceMessage = "Alexa: Please enter valid number: "; continue; }
			 
			 int choice = Integer.parseInt(str);
			 if(choice < 0 || choice > 4 ){	choiceMessage = "Alexa: Please enter valid number: "; continue; }
			 
			 switch(choice){
				case 1: addAtFirst();
						b = false;
						break;
				case 2: addAtLast();
						b = false;
						break;
				case 3: back();
						b = false;
						break;
				default: 
						choiceMessage = "Alexa: Please enter valid choice: ";
						continue;
			 }
		 }
	 }
	 public void displayElements(){
		
		cls();
		String allElements	= theList.toString();
		if(theList.toString() == ""){ System.out.println("Result: No elements available"); }
		else{ System.out.println("Result: All available elements: " + allElements); }
		
		doWork();
	 }
	 
	 public void cls(){
		 try{
			 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			 System.out.println("");
		 }catch(Exception e){ System.out.println ("CLS error: " + e);}
	 }
	 
	 public void deleteElements(){
		cls();
		//addEMessage = "1: Delete element from first\n2: Delete element from last\n3: Back";
		 if(deletedFromFirst){ 
			System.out.println("Element is deleted, you can delete again"); 
			deletedFromFirst = false; 
		} 
		 
		 if(theList.isEmpty()){System.out.println("No elements here."); doWork(); }
		 
		 
		System.out.println("1: Delete element from first\n2: Delete element from last\n3: Back");
		 boolean b = true;  
		 String choiceMessage = "Alexa: Please enter your choice: ";
		 while(b){
			 System.out.print(choiceMessage);
			 String str = sc.next();
			 if(!isNumeric(str)){ choiceMessage = "Alexa: Please enter valid number: "; continue; }
			 
			 int choice = Integer.parseInt(str);
			 if(choice < 0 || choice > 4 ){	choiceMessage = "Alexa: Please enter valid number: "; continue; }
			 
			 switch(choice){
				case 1: deleteFromFirst();
						b = false;
						break;
				case 2: deleteFromLast();
						b = false;
						break;
				case 3: back();
						b = false;
						break;
				default: 
						choiceMessage = "Alexa: Please enter valid choice: ";
						continue;
			 }
	 }
	 }
	 
	 public void deleteFromFirst(){
		 // Let's delete the first element...
		if(theList.deleteFirst() != null){
			deletedFromFirst = true;
			deleteElements();
		}
	 }

	public void deleteFromLast(){
		
	}
	
	
	 public void exit(){
		System.exit(0);
	 }
	 
	 public void back(){
		cls();
		doWork();
	 }
	 
	 public void addAtFirst(){
		cls();
		System.out.print("Alexa: Please enter element value: ");
		theList.insertFirst(sc.next());
		System.out.println("Result: Element added, you can add again");
		elemenAtFirstAdded = true;
		addElement();
	 }
	 
	 public void addAtLast(){
		cls();
		System.out.print("Alexa: Please enter element value: ");
		theList.insertLast(sc.next());
		System.out.println("Result: Element added, you can add again");
		elemenAtFirstAdded = true;
		addElement();
	 }
	 
	 // check if coming value is integer
	 public static boolean isNumeric(String str){
		 try {
			 int i = Integer.parseInt(str);
		 }catch(NumberFormatException exp){ return false; }
		 
		 return true;
	 }
 }