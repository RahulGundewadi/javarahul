package Assiment2;

//Write a program to find simple interest using void method. Print those in method.

public class simpleinterest {
 /* public void printAmount (double amount) {
	  System.out.println("the total amount :"+amount);
  }
  
  public void printInterest (double interest) {
	  System.out.println("the total interest :"+interest);
  }
  public void printPeriod (double Period) {
	  System.out.println("the total Period :"+Period);
  }*/
  public void printsimpleInterest (double amount , double interest , double Period) {
	  
	  double simpleInterest = (amount*interest*Period)/100;
	  
	  System.out.println("simple interest :"+simpleInterest);
  }
	
}
