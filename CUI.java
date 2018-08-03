import java.util.*;
class CUI
{
	public static void main(String args[])
	{
		String validPass="Password";
		String validuserID="Anindya";
		Scanner in=new Scanner(System.in);
			int count=0;
		while(count<4)
		{
		System.out.println("Enter UserID: ");
		String userID=in.nextLine();
		
		System.out.println("Enter Password: ");
		String password=in.nextLine();
	
		
		if(password.equals(validPass) && userID.equals(validuserID))
		{
			System.out.println("Welcome "+ validuserID);
			break;
		}
		else
		{
			count++;
			if(count==3)
			{
				System.out.println("Contact Admin");
				break;
			}
		}
		}
	}
	
}