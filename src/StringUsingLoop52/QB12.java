package StringUsingLoop52;
//12. Replace all digits with '#'.

public class QB12 {
public static void main(String[] args) {
	
	String name = "Rahul1264";
	String Replace = "";
	
	for(int i = 0; i<name.length();i++) {
		char c = name.charAt(i); 
		//if(c=='1' || c=='2' || c=='3' || c=='4'||c=='5' || c=='6' || c=='7' || c=='8'||c=='9'||c=='0')
		if(Character.isDigit(c)){
			Replace = Replace+'#';
		}else {
			Replace = Replace+c;
		}
	}
	System.out.println(name);
	System.out.println(Replace);
}
}
