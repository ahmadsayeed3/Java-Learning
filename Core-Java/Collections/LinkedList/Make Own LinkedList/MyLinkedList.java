 // Create My Own LinkedList: MyLinkedList.java
 
 class Link{
	 int iData;
	 public Link next;
	 
	 // Constructor
	 public Link(int iData){
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
	 
	 //Constructor
	 public LinkedList(){
		 first = null;
	 }
	 
	 public boolean isEmpty(){
		 return (first == null); 	// returns true if first is null.
	 }
	 
	 public void insertFirst(int id){
	
		 Link newLink = new Link(id);
		 newLink.next = first;
		 first = newLink;
	 }
	 
	 public Link deleteFirst(){
		 Link temp = first;
		 first = first.next;
		 return temp;
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
	 
	 public static void main(String...a){
		 LinkedList theList = new LinkedList();
		 theList.insertFirst(22);
		 theList.insertFirst(44);
		 theList.insertFirst(66);
		 theList.insertFirst(88);
		 
		 System.out.println(theList);
		 
		 // Let's delete the first element...
		 System.out.println("Deleting firstElement..." + theList.deleteFirst());
		 System.out.println("After Deletion: " + theList);
		 
		 // Now Let's delete the all elements
		 while(!theList.isEmpty()){
			 Link aLink = theList.deleteFirst();
			 System.out.println("Deleted item is: " + aLink);
		 }
		 
		 System.out.println("");
		 System.out.println("Elements rest are: " + theList);
	 }
 }