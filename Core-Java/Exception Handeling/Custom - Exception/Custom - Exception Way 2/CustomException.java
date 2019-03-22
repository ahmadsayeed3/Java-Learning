// CustomException.java

// Making Custom Exception

class AgeException extends Exception{
	
	String s;
	
	AgeException(String s){
		this.s = s;
	}
	
	public String toString(){
		return s;
	}
}


class Employee{
	int age;
	
	public static void main(String...a){
		Employee emp = new Employee();
		try
{
			emp.setAge(2);
		}catch(AgeException e){
			System.out.println(e);
		}
		
		System.out.println("Program is continue....");
	}
	
	public void setAge(int age) throws AgeException
{
		if(age < 18){
				throw new AgeException("Age Must Be Greater Than 18");
			
		}else{
			this.age = age;
			System.out.println("Age Is Set: " + this.age);
		}
	}
}