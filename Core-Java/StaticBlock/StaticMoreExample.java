/*This program explains how System.out.println("Ahmad"); Works*/
class StaticMoreExample{
	public static void main(String...a){
		OnCmd.display.mine("Ahmad Sayeed");
		OnCmd.display.mine(404);
		OnCmd.display.mine('S');
		OnCmd.display.mine(10.5f);
	}
}

class OnCmd{
	static PrintOnCmd display;
	static{
		display = new PrintOnCmd();
	}
}

class PrintOnCmd{
	static void mine(String s){
		System.out.println(s);
	}
	static void mine(int num){
		System.out.println(num);
	}
	static void mine(char ch){
		System.out.println(ch);
	}
	static void mine(float f){
		System.out.println(f);
	}
}
