import java.util.*;
class Prog32 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("How many elements?");
		int n=sc.nextInt();
		int[] x=new int[n];
		System.out.println("Enter elements..");
		for(int i=0;i<x.length;i++)
			x[i]=sc.nextInt();
		int sum=0;
		for(int i=0;i<x.length;i++)
			sum=sum+x[i];
		System.out.println("Sum:"+sum);
	}
}
