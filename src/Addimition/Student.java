package Addimition;

public class Student {
	public static void main(String[] args)
	{
		
		int maths = 58;
		int science = 78;
		int english = 68;
		int age = 18;
		
		int totalMarks = (maths+science+english);
		
		if(age>17) {
			if(maths>=50 && science>=50 && english>=50) {
				if(totalMarks>=160) {
					System.out.println("The student eligibal for addimition");
				}
				else {
					System.out.println("The student not eligibal for addimition due to totalMarks<=160");
				}
		
			}
			else {
				System.out.println("The student not eligibal for addimition becous one of subject has marks <=50");
				if(maths<=50) {
					System.out.println("maths marks <=50");
				}
				if(science<=50) {
					System.out.println("science marks <=50");
				}
				if(english<=50) {
					System.out.println("english marks <=50");
				}
			}
		}
		else {
			System.out.println("The student not eligibal for addimition for age<=17");
		}
			
	}
}
