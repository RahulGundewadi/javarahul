package lecture;

public class immutable287 {

	/*public static void main(String[] args) {
		//a
		
		String a = "rau";
		System.out.println(System.identityHashCode(a));
		
		//b
		a = a.toUpperCase();
		System.out.println(System.identityHashCode(a));
		
		//c
		a = a.toLowerCase();
		System.out.println(System.identityHashCode(a));
		
		System.out.println(a);
	}*/
	/*public static void main(String[] args) {
		
	String s = "Irise";
	String s1 = "irise";
	
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s1));
	
	s.toUpperCase();
	s1.toUpperCase();
	
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s1));
}*/
	public static void main(String[] args) {
		String s = "rahul";
		System.out.println(System.identityHashCode(s));
		
		
		s = s.toUpperCase();
		System.out.println(System.identityHashCode(s));
		

		s = s.toLowerCase();
		System.out.println(System.identityHashCode(s));
	}
}
