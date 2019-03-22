class TrickyQuestion{
	
	TrickyQuestion(){
		System.out.println("Welcome");
	}
	
	void TrickyQuestion(){
		System.out.println("C U Later");
	}
	
	public static void main(String... a){
		new TrickyQuestion();
				/*OR*/
		new TrickyQuestion.TrickyQuestion();
		/*now how compiler knows if you are calling constructor or function*/
		/*If "new" is behind the finction then it will find for constructor function*/
		/*If (.) is behind then it will find for function*/
	}
}

/*You may though that this compilation error cause of function or
 if think constructor with return type*/
 
 // Actually that is function becasue only in java we can create function with same as class name.
 