import java.util.*;
class Prog24 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integers and 0 to stop..");
		int x,sum=0;
		while(true)
		{
			x=sc.nextInt();
			if(x==0)
				break;
			sum=sum+x;
		}
		System.out.println("Sum of all integers:"+sum);
	}
}
