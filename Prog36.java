import java.util.*;
class Prog36 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		System.out.print("How many of you are partying:");
		int n=sc.nextInt();
		String[] x=new String[n];
		System.out.println("Enter names..");
		for(int i=0;i<n;i++)
			x[i]=sc.next();
		int rn=r.nextInt(x.length);
		System.out.println(x[rn]+" is feeling lucky");
	}
}
