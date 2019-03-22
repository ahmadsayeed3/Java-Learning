/*We can't this function inside static function */
class ThisStatic{
	int num = 10;
	public static void main(String... a){
		ThisStatic ts = new ThisStatic();
		ts.show();
		
		writeMessage(ts);
	}

	/*non-static variable "this" cannot be referenced from a static context*/
	
	/*static void display(){
		System.out.println(this.num);
	}*/

	/*It will work now. don't use "this" as a variable name*/ 
	static void writeMessage(ThisStatic ts){
		System.out.println(ts.num);		
	}
	
	void show(){
		System.out.println(this.num);
	}
}