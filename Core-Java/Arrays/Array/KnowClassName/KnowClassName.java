class KnowClassName{

	int number[] = {5,4,3,2};
int num[] = {5,4,3,2};
	
	static String []names = {"Prem", "Parul","Padmawati"};
	
	public static void main(String...a){
		KnowClassName kcn = new KnowClassName();
	
		System.out.println(names.getClass().getName());
		System.out.println(kcn.number.getClass().getName());		
		System.out.println(kcn.num.getClass().getName());

		KnowClassName sa[] = {new KnowClassName(), new KnowClassName()};
		System.out.println(sa.getClass().getName());		
	}
}