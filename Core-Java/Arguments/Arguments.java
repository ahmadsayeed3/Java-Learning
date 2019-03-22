public class Arguments {

	public static void main(String... args) {
		System.out.println("The number of argument is: "+ args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}