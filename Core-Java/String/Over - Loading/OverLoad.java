// What is the output of below program?

public class OverLoad {

	 public void foo(String s) {
	 System.out.println("String");
	 }

	 public void foo(StringBuffer sb){
	 System.out.println("StringBuffer");
	 }

	 public static void main(String[] args) {
		new OverLoad().foo(null);
	}

}