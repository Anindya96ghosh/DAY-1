import java.util.*;
class RemoveDuplicate 
{
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the string");
		String input=in.nextLine();
		char[] chars=input.toCharArray();
		int len=input.length();
		for(int i=0;i<len;i++)
		{
			char Char=chars[i];
			for(int j=i+1;j<len;j++)
			{
				if(Char==chars[j])
					chars[j]=' ';
				
				
			}
			
		}
		String string= new String(chars);
		string=string.replaceAll(" ", "");
		System.out.println(string);
				
	}
	
}
