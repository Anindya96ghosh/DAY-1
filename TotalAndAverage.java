import java.util.*;
class TotalAndAverage 
{
	public static void main(String args[])
	{
int arr[][]=new int[3][3];
Scanner in=new Scanner(System.in);
System.out.println("Enter the marks of Arun in English");
arr[0][0]=in.nextInt();
System.out.println("Enter the marks of Bob in English");
arr[0][1]=in.nextInt();
System.out.println("Enter the marks of Coup in English");
arr[0][2]=in.nextInt();
System.out.println("Enter the marks of Arun in Maths");
arr[1][0]=in.nextInt();
System.out.println("Enter the marks of Bob in Maths");
arr[1][1]=in.nextInt();
System.out.println("Enter the marks of Coup in Maths");
arr[1][2]=in.nextInt();
System.out.println("Enter the marks of Arun in Hindi");
arr[2][0]=in.nextInt();
System.out.println("Enter the marks of Bob in Hindi");
arr[2][1]=in.nextInt();
System.out.println("Enter the marks of Coup in Hindi");
arr[2][2]=in.nextInt();
int total=0,i;
for(i=0;i<3;i++)
{
	total=total+arr[i][0];
}
System.out.println("The total of Arun is " + total);
System.out.println("The average of Arun is " + total/3);

total=0;
for(i=0;i<3;i++)
{
	total=total+arr[i][1];
}
System.out.println("The total of Bob is " + total);
System.out.println("The average of Bob is " + total/3);
total=0;
for(i=0;i<3;i++)
{
	total=total+arr[i][2];
}
System.out.println("The total of Coup is " + total);
System.out.println("The average of Coup is " + total/3);
total=0;
for(i=0;i<3;i++)
{
	total=total+arr[0][i];
}
System.out.println("The total of English is " + total);
System.out.println("The average of English is " + total/3);
total=0;
for(i=0;i<3;i++)
{
	total=total+arr[1][i];
}
System.out.println("The total of Maths is " + total);
System.out.println("The average of Maths is " + total/3);

total=0;
for(i=0;i<3;i++)
{
	total=total+arr[2][i];
}
System.out.println("The total of Hindi is " + total);
System.out.println("The average of Hindi is " + total/3);
	}
}
