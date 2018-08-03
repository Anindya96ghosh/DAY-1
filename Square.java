import java.util.*;
public class Square {

	public static void main(String args[])
	{
		int square;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input value:");
		int input = scanner.nextInt();
		System.out.println("The square of " + input + " is: " + square(input) );
	}	
		public static int square(int input)
		{
		   return input*input;
		}	
	
}
