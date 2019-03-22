// 3 Predefined compile time annotations: @Override, SuppressWarning, @Deprecated

import java.lang.annotation.*;

class CompileTime extends Parent{
	
	@Deprecated
	public void display(){
		System.out.println("I am display Method");
	}
	
	@Override
	public void show(){
		System.out.println("I am show Method");
	}
	
	@Deprecated
	//@SuppressWarnings("draw method is deprecated")
	public void draw(){
		System.out.println("I am draw Method");
	}
	
	public static void main(String...a){
		CompileTime ct = new CompileTime();
		ct.display();
		ct.show();
		ct.draw();
	}
}

class Parent{
	
	public void show(){
		System.out.println("I am Parent's show Method");
	}
}