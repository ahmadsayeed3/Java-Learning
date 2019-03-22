// Create Array Of Reference variable

class Temp{

	int x;
	
	Temp(int y){
		x = y;
	}
	public static void main(String...a){
		//Normal Way
		Temp t1 = new Temp(1);
		Temp t2 = new Temp(1);
		Temp t3 = new Temp(1);
		Temp t4 = new Temp(1);

		//using array
		
		Temp t[] = new Temp[5];
		for(int i =0; i < t.length; i++){
			t[i] = new Temp((i+10));
		}
		
		System.out.println(t[2].x);

	}
}