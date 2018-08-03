import java.util.*;
public class findInterest {
	
 public static void main(String args[]) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter the Principal value: ");
	 int principal = scanner.nextInt();

	 System.out.println("Enter the rate value: ");
	 double rate = scanner.nextDouble();

	 System.out.println ("Enter the time value:");
	 int time = scanner.nextInt();
	double simpleInterst = (principal*rate*time)/100;
	 System.out.println("Simple interst is :" +simpleInterst);
	 
    
    double compoundInterest=principal*(Math.pow((1+rate/100), time)); 
	System.out.println("The Compound Interest is "+compoundInterest);
	 
	 
	 
	 
 } 
	 
	 
}
