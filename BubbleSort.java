//bubble sort algorithm
class BubbleSort 
{
	public static void main(String args[])
	{
		int i,j,temp=0;
		int arr[]=new int[]{5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int len=arr.length;
		for(i=0;i<=len-2;i++)
		{
			for(j=0;j<=len-2;j++)
			{
				if (arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//printing the array
			for(j=0;j<15;j++)
			{
				System.out.println(arr[j]);
			}
		
	}
	
}
