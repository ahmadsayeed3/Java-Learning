class ClassOne{

	public static void main(String...a){
		String students[][];
		students = new String[3][4];
		
		for(int i = 0; i < students.length; i++){
			for(int j = 0; j < students[i].length; j++){
				students[i][j] = "Ahmad" + j;
			}
		}
		
		for(int i = 0; i < students.length; i++){
			for(int j = 0; j < students[i].length; j++){
				System.out.println(students[i][j]);
			}
		}

		// ---------OR--------

		// Assigning
		/*String names[][];
		
		// will create array memory but won't divide and first value is required
		names = new String[3][]; 
			
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				names[i][j] = "Ahmad 222" + j;
			}
		}
		
		//Printing
		
		for(int i = 0; i < names.length; i++){
			for(int j = 0; j < 5; j++){
				System.out.println(names[i][j]);
			}
		}
		*/
		// ------------OR -------------
		int m[][];
		m = new int[3][];

		m[0] = new int[2];
		m[1] = new int[4];
		m[2] = new int[5];		

		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				m[i][j] = 10 + j;
			}
		}
		
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				System.out.println(m[i][j]);
			}
		}
	
		//----------- OR -----------
		int n[] = {3,5,7};
		int d[][];
		d = new int[3][];
		for(int i=0; i<n.length; i++){
			d[i] = new int[n[i]];
		}
		// It will generate this type of array
		//int d[0][3];
		//int d[1][5];
		//int d[2][7];
		
		//-------- OR ------
		int s[][] = { {10,20,30}, {10,20,30,40}, {10,20,30,40,50} };
		
		
	
	}
}