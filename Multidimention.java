import java.util.*;
class Multidimention
{
	public static void main(String args[])
	{
		System.out.println("Enter the parameters of a 2-D array ");
		Scanner scanner=new Scanner(System.in);
		int m=scanner.nextInt();
		int n=scanner.nextInt();
		
		int arr[][]=new int[m][n];
		System.out.println("Enter the elements of the array ");
		int flag=0,i,j;
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				arr[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Enter the number to be searched ");
		int number=scanner.nextInt();
		
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				if(arr[i][j]==number)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
				{
					System.out.println("The number "+number+" is present in the multidimentional array");
					break;
				}
		}
		if(flag==0)
				{
					System.out.println("The number "+number+" is not present in the multidimentional array");
				}
		
	}
}