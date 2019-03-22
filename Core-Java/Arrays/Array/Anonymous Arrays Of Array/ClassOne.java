import java.util.*;

class ClassOne{

	void printArrays(int x[][]){
		for(int i = 0; i < x.length; i++){
			for(int j = 0; j < x[i].length; j++){
				System.out.print(x[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String...a){
		int x[][];
		x = new int[3][4];
		
		for(int i = 0; i < x.length; i++){
			System.out.println("Enter " + x[i].length + " Value For Array-" + i);
			for(int j = 0; j < x[i].length; j++){
				System.out.println("Enter " + j +"th Value ");
				x[i][j] = new Scanner(System.in).nextInt();
			}
		}
		
		new ClassOne().printArrays(x);

		//Annonymous Way:- Arrays Of Arrays
		new ClassOne().printArrays(
			new int[][]{ {1,2,3,4},{4,3,2,1},{7,8,9,4} }
		);
		
	}
}