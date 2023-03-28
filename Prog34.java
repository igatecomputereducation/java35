import java.util.*;
class Prog34 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("How many elements:");
		int n=sc.nextInt();
		
		int[] x=new int[n];
		
		System.out.println("Enter elements..");
		for(int i=0;i<x.length;i++)
			x[i]=sc.nextInt();
		
		System.out.print("Find what:");
		int f=sc.nextInt();

		boolean s=false;
		for(int t:x)
		{
			if(t==f)
			{
				s=true;
				break;
			}
		}
		
		if(s)
			System.out.println("Existed");
		else
			System.out.println("Not existed");
	}
}
