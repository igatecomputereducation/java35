import java.util.*;
class Prog29 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("How many terms:");
		int n=sc.nextInt();
		int i,a=0,b=1,c=0;
		for(i=1;i<=n;i++)
		{
			System.out.print(c+"\t");
			a=b;
			b=c;
			c=a+b;
		}
		System.out.println();
	}
}