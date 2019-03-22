import java.util.Scanner;
class ObjectWithArray
{
	int id;
	String name;
	int salary;
	public static void main(String... s){
		Scanner ss=new Scanner(System.in);
	
		System.out.println("enter the name");
			a[i].name=ss.nextLine();
			
	
		System.out.println("enter the no. of objects");
	
		int x=ss.nextInt();

		array5 a[]=new array5[x];
		for(int i=0;i<a.length;i++){
			a[i]=new array5();
			System.out.println("enter the name");
			a[i].name=ss.nextLine();
			
			System.out.println("enter the id");
			a[i].id=ss.nextInt();
			//ss.nextLine();
			//System.out.println("enter the name");
			//a[i].name=ss.nextLine();
			System.out.println("enter the salary");
			a[i].salary=ss.nextInt();
			
		}

		for(int j=0;j<a.length;j++){
			System.out.println(a[j].id+" "+a[j].name+" "+a[j].salary);
		}
	}
}