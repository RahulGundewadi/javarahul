package StringUsingLoop52;
//4. Count spaces in a string.
public class QB4 {
	public static void main(String[] args) {
		String name = "Rau   l";
		
		int spacesCount = 0;
		
		name = name.toUpperCase();
		
		for(int i=0;i<name.length();i++) {
			char c = name.charAt(i);
			if(Character.isSpace(c)) {
				spacesCount++;
			}
		}
		System.out.println(spacesCount);
	}
}
