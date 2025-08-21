package Assiment2;
/*WAP to get simple interest using parameterized methods. print statement should be in main class.
a. Add a new method to find Rate of Interest
b. Principal amount
c. Period*/
//  ***Demo1

public class simpleInteresP {
	
	public void printSimpleInterest(double amount, double Interest , double Period) {
		
		double SimpleInterest = (amount*Interest*Period)/100;
		
		System.out.println("amount is"+amount);
		
	 System.out.println("Simple Interest is:" + SimpleInterest);
		
	}
	}

