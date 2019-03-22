/*How to make constructor in java*/
class ConstructorClass{
	String name;
	/*Rule1 Always keep the name of costructor as clas name*/
	/*Never add  any return type while creating a constructor*/
	ConstructorClass(){
		this.name = "kid";
		System.out.println("Wha is the Default Name?");
		return; // Rule 3: Blank return
		//return "string"; // Rule2 we can't return anything from constructor except blank return
	}
	
	
	public static void main(String... a){
		ConstructorClass cc = new ConstructorClass();
		cc.pickName();
		cc.setSchool()
		/*OR this way we can also create ref id through anonymous object*/
		new ConstructorClass().pickName();
		new ConstructorClass().setSchool();
		/*constructor by default return ref id of current object*/
		System.out.println("Ref id " + cc);
	}
	
	void pickName(){
		System.out.println(this.name);
		
		System.out.println("New Name of " + name + " is");
		this.name = "Javed Alam";
		System.out.println("New name is : " + this.name);
	}
	
	void setSchool(){
		System.out.println("School Name is City M");
	}
} 