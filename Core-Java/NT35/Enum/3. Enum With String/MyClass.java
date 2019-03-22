// String enum constants ...

enum UserStatus{
	PENDING("P"), ACTIVE("A"), INACTIVE("I");
	
	private String statusCode;
	
	private UserStatus(String s){
		statusCode = s;
	}
		
	public String getStatus(){
		return statusCode;
	}
}

class MyClass{
	
	public static void main(String...a){
		System.out.println("Current user status is: " + UserStatus.ACTIVE.getStatus());
		
		System.out.println("\n====== Printing All user status are: ======\n");
		for(UserStatus us: UserStatus.values()){
			System.out.println(us + " = " + us.getStatus());
		}
	}
}