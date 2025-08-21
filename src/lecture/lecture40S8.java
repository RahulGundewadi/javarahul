package lecture;

public class lecture40S8 {

	public static void main(String[] args) {
		/*
		String day = "Monday";
		System.out.println(day);
		int length = day.length();
		System.out.println(length);*/
		
		////
		/*String day = "Monday";
		int length = day.length();
		System.out.println(length);
		for(int i=0; i<day.length();i++) {
		
		//	char c = day.charAt(i);
			System.out.println(day.charAt(i));
		
		}*/
		
		///***
		
	/*	String day = "Monday";
		int length = day.length();
		System.out.println(length);
		for(int i=0; i<day.length();i++) {
			if(i%2==0) {
		//	char c = day.charAt(i);
			System.out.println(day.charAt(i));
		}
		}*/
		
		//************
		
		
		String day = "Monday";
		int length = day.length();
		System.out.println(length);
		for(int i=0; i<day.length();i++) {
			if(day.charAt(i)!='a' && day.charAt(i)!='e' && day.charAt(i)!='i' && day.charAt(i)!='o' && day.charAt(i)!='u') {
		//	char c = day.charAt(i);
			System.out.println(day.charAt(i));
		}
		}
	}
}
