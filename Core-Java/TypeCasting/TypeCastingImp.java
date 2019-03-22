/*Why Typcasting is important*/

class TypeCastingImp{
	public static void main(String... args){
		/*No Of Male*/
		int male = 10;		

		/*No Of Female*/
		int female = 3;

		/*Result is 3.3333 to get the ratio*/
		/*We cant take float for no of males or female because it does not demands fraction value*/

/*		Solution is typeCasting*/
		float result = (float) male/female;
		System.out.println("Result is " + result);
	}

}