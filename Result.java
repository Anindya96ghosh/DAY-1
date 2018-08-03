import java.util.*;
class Result
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter marks for Maths");
		int subject1=in.nextInt();
		
		System.out.println("Enter marks for English");
		int subject2=in.nextInt();
		
		System.out.println("Enter marks for Hindi");
		int subject3=in.nextInt();
		
		if(subject1>60 && subject2>60 && subject3>60){
			System.out.println("Passed");
		}
		else if((subject1>60 && subject2>60) || (subject2>60 && subject3>60) || (subject3>60 && subject1>60) )
		{
					System.out.println("Promoted");
		}
		else 
					System.out.println("Failed");

	}
}