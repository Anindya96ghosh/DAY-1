import java.util.*;
class ArraySearch
{
	public static void main(String args[])
	{
		int flag=0;
		Scanner in=new Scanner(System.in);
		System.out.println("the number element to be searched ");
		int element=in.nextInt();
		int arr[]=new int[15];
		System.out.println("Enter the elements of the array ");
		for(int i=0;i<15;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<15;i++)
		{
			if(element==arr[i])
			{
				System.out.println("the number " + element + "is present ");
				flag=1;
				break;
			}

		}
		if(flag!=1)
			System.out.println("the number " + element + "is not present ");
		
		
	}
}