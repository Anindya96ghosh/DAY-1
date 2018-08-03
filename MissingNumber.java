import java.util.*;
class MissingNumber 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the largest number of the array");
		int n=in.nextInt();
		int array[]=new int[n+1];
		int sum=0,checkSum=0;

		for(int i=0;i<n;i++)
		{
			array[i]=in.nextInt();
			sum=sum+array[i];
		}
		
		for(int i=0;i<=n;i++)
		{
			
			checkSum=checkSum+i;
		}
		int difference=checkSum-sum;
		System.out.println("The missing number is " + difference);
	}
}
