package StringUsingLoop52;
//6. Reverse a string using a loop.
public class QB6 {
	public static void main(String[] args) {
		String name = "Rahul ";
		
		String Reverse = "";
		
		for(int i=name.length()-1; i >= 0;i--) {
			
			Reverse = Reverse+name.charAt(i);
			}
		System.out.println(name);
		System.out.println(Reverse);
		}
	
	}

