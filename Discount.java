import java.util.*;
public class Discount {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the price of new item");
		
		double newItem=scanner.nextDouble();
		
		double discount = 0.35* newItem;
		double newItemPrice=newItem-discount;
		 
		System.out.println("The revised price is "+newItemPrice);
		
	}

	
	
			
}
