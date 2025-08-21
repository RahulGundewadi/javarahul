package StringUsingLoop52;
//19. Check if two strings are anagrams (using frequency count).
public class QB19 {
	public static void main(String[] args) {
		String str1 = "rahul";
		String str2 = "ygjhaaalrhbu";
		
		 int[] freq1 = new int[26];
	     int[] freq2 = new int[26];
	     

	     for(int i = 0; i<str1.length();i++) {
	    	 char c = str1.charAt(i);
	    	 freq1[c - 'a']++;
	     }
	     
	     for(int i = 0; i<str2.length();i++) {
	    	 char c = str2.charAt(i);
	    	 freq2[c - 'a']++;
	     }
	     
	     for(int i = 0; i<26; i++) {
	    	 if(freq1[i] == freq2[i]) {
	    		 System.out.println("it is anagrams");
	    	 }else {
	    		 System.out.println("it is not anagrams");
	    	 }
	     }
	}
	

}
