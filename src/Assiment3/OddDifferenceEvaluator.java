package Assiment3;
/*Input two integers.
If both are odd, print their absolute difference. If one is even, print "Invalid".*/
public class OddDifferenceEvaluator {
		public static void main(String[] args) {
			int a = 1;
			int b = 3;
			
			if(a%2!=0 && b%2!=0) {
				System.out.println("their absolute difference");
			}else {
				System.out.println("Invalid");
			}
		}
}
