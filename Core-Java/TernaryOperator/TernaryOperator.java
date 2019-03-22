class TernaryOperator{
	public static void main(String... arg){
		String result = resultS() ? success() : failiure();
		System.out.println(result);
	
		result = resultF() ? success() : failiure();
		System.out.println(result);
	}

	public static boolean resultS(){
		/*Some Complex code is here*/
		return true;
	}

	public static boolean resultF(){
		/*Some Complex code is here*/
		return false;
	}
	
	public static String success(){
		return("Calling Succes Function");
	}

	public static String failiure(){
		return("Calling Failiure Function");
	}

}