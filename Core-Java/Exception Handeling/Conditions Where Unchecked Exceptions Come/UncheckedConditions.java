// Conditions that Checked at run-time instead of compile-time is called Unchecked Conditions
// So it won't give Compilation error

class UncheckedConditions{


	public static void main(String...a){
		/*//Arithmetic Exception
		System.out.println(10/0);

		//NullPointerException
		String s = null;
		System.out.println(s.length());

		//NumberFormatException
		String sa = "Ahmad";
		int i = Integer.parseInt(sa);

		// IndexOutOfBoundsException
			//1. ArrayIndexOutOfBoundsException
				int x[] = new int[5];
				x[2] = 45;
				x[6] = 45; // It will create Exception error*/

			//2. StringIndexOutOfBoundsException
				String name = "Sayeed";
				System.out.println(name.charAt(2));
				System.out.println(name.charAt(9));
	}
}