package palindrome;
import java.util.*;
class palindrome
{
	public static void main(String args[])
	{
		System.out.println("Enter the no");
		Scanner in=new Scanner(System.in);
		int number= in.nextInt();
		int rev=0,rem;
		int no=number;
		while(no>0)
		{
			rem=no%10;
			no=no/10;
			rev=rev*10+rem;
		}
		if(rev==number)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");			
		}
	}
}
