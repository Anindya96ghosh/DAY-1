import java.util.*;
class MissingName 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the total number of names");
		int n=in.nextInt();
		int count=0;
		String names[]=new String[n+1];
		System.out.println("Enter the names");
		for(int i=0;i<=n;i++)
		{
			names[i]=in.nextLine();
		}
		System.out.println("Enter the name  to be searched");
		String name=in.nextLine();
		for(int i=0;i<=n;i++)
		{
			if(name.equals(names[i]))
			{
				count++;
			}
		}
		if(count>0)
			System.out.println("The name '"+ name + "' is present "+count+ " times.");
		else
			System.out.println("The name "+ name + "' is not present. ");
			
	}
}
