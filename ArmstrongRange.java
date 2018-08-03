
public class ArmstrongRange {

	public static void main(String[] args) {
		
	
		
		
		int i = 100;
		for(i=100;i<=999;i++)
		{
			int no = i;
			int rem=0;
			int sum=0;
			while(no>0)
			{
			
			rem=no%10;
			sum = sum+rem*rem*rem;
			no=no/10;
			}
			if(sum==i)
			{
				System.out.println(i);
			}
			
			
		}
			

	}

}
