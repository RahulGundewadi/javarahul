package Assiment3;
/*Input age and citizenship (Y/N).
If age ≥18 and citizen (Y/y), print "Eligible to vote".*/
public class SimpleVotingSystem {
		public static void main(String[] args) {
			
			int age = 19;
			String citizenship = "India";
			
			if(age>=18 && citizenship == "India" ) {
				System.out.println("Eligible to vote");
			}else {
				System.out.println("Not Eligible to vote");	
			}
		}
}
