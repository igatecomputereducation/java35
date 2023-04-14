import java.util.*;
class SimpleInterest
{
	double getSI(int amt,int time,double rate)
	{
		return amt*time*rate/100;
	}
}
class Prog50 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		SimpleInterest si=new SimpleInterest();

		System.out.print("Amount:");
		int a=sc.nextInt();
		System.out.print("Time:");
		int t=sc.nextInt();
		System.out.print("Rate of interest:");
		double r=sc.nextDouble();

		System.out.println("Simple Interest:"+si.getSI(a,t,r));
		System.out.println("Total:"+(a+si.getSI(a,t,r)));
	}
}
