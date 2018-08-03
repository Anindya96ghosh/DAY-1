
//A program on Armstrong number

package armNumber;


import java.util.*;
public class armNumber {

	public static void main (String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scanner.nextInt();
		int  num1 = num;
		int sum = 0;
		int rem = 0;
		
		while(num>0)
		{
			rem = num%10;
			sum = sum+rem*rem*rem;
			num= num/10;
			
		}
				if (num1 == sum)
				{
					System.out.println("the given number "+num1+ " is Armstrong number ");
				}
				else
				{
					System.out.println("the given number "+num1+ " is not Armstrong number ");
				}
	
	}
}
