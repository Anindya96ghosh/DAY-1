import java.util.*;
class Tax
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the CTC");
		int CTC= in.nextInt();


		double tax;
		if(CTC >0 && CTC<=1_80_000)
		{
			System.out.println("The Tax is null");
		}
		else if(CTC <=3_00_000 && CTC>1_80_000)
		{
			tax = 0.1 * (double)CTC; 
			System.out.println("The Tax is " + tax);
		}
		else if(CTC >3_00_000 && CTC<=5_00_000)
		{
			tax = 0.2 * (double)CTC; 
			System.out.println("The Tax is " + tax);
		}
		else if(CTC <=10_00_000 && CTC>5_00_000)
		{
			tax = 0.3 * (double)CTC; 
			System.out.println("The Tax is " + tax);
		}
	}
}
		