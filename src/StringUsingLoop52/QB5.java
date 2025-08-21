package StringUsingLoop52;
//5. Count uppercase and lowercase letters.
public class QB5 {
	public static void main(String[] args) {
		String name = "RaasWWl";
		
		int uppercaseCount = 0;
		int lowercaseCount = 0;
		
	
		for(int i=0;i<name.length();i++) {
			char c = name.charAt(i);
			if(Character.isUpperCase(c)) {
				uppercaseCount++;
			}else if(Character.isLowerCase(c)){
					lowercaseCount++;
				}
			}
		
		System.out.println("uppercaseCount"+uppercaseCount);
		System.out.println("lowercaseCount"+lowercaseCount);
	}
}

