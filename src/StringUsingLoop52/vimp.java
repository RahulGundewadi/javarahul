package StringUsingLoop52;
//occurrence of character string
public class vimp {

	public static void main(String[] args) {
	
		String name = "raaaahuuunnnl";
		
		for(int i=0; i<name.length(); i++) {
			char c = name.charAt(i);
			int count = 0;
			
			if(name.indexOf(c)<i) {
				continue;
				
			}
			for(int j=0; j<name.length(); j++) {
				if(name.charAt(j)==c) {
					count++;
				}
			}
			System.out.println(c+" : "+count);
		}
		
	}
}