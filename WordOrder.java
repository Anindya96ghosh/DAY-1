import java.util.*;
class WordOrder
{
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the string");
		String str=in.nextLine();
		String arrOfStr[]= str.split(" ");
		int len=arrOfStr.length;
		for(int i=0;i<len;i++)
		{
			StringBuffer s =new StringBuffer(arrOfStr[i]);
			System.out.print(s.reverse() + " ");
		}
		
	}
}
