class Employe
{
  static String cname ="TCS";
  String name;
  int salary;
  void get(String s1,int s2)
{
  name=s1;
  salary=s2;
}
	void show()
	{
		System.out.println(name+" "+salary+" "+cname);
}
public static void main(String... s)
{
Employe e1=new Employe();
e1.get("lalu",1000);
e1.show();
}
}

  
