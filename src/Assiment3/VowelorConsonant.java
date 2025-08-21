package Assiment3;

import java.util.Scanner;

/*Input a character.
Check if it's a vowel (a, e, i, o, u – case insensitive) or consonant*/
public class VowelorConsonant {
	public static void main(String[] args) {
		
		char h = 'b' ;
		
		
		if(h>='a' && h<='z') {
			if(h == 'a' || h == 'e' || h == 'i' || h == 'o' || h == 'u') {
			System.out.println("it is insensitive ");
		}else {
			System.out.println("it is consonant ");
		}
		
	}
	}
}
