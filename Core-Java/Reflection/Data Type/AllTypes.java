/* We can also get the object/referenceID of "Class" class that represents primitive data type */

class AllTypes{
	
	public static void main(String...s){
		
		Class i = int.class;
		System.out.println(i.getName());
		
		Class ch = char.class;
		System.out.println(ch.getName());
		
		Class f = float.class;
		System.out.println(f.getName());
		
		Class d = double.class;
		System.out.println(d.getName());
		
		Class lg = long.class;
		System.out.println(lg.getName());
		
		Class bn = boolean.class;
		System.out.println(bn.getName());
		
		Class bt = byte.class;
		System.out.println(bt.getName());
		
		Class st = short.class;
		System.out.println(st.getName());
		
		Class vd = void.class;
		System.out.println(vd.getName());
	}
}