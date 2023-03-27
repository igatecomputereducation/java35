import java.util.*;
class Prog9 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		//Accepting input
		System.out.print("Length:");
		int len=sc.nextInt();
		System.out.print("Breadth:");
		int bre=sc.nextInt();

		//logic
		int area=len*bre;
		int peri=2*(len+bre);
		
		//output
		System.out.println("Area "+area);
		System.out.println("Perimeter "+peri);
		
		/*
		System.out.println("Area "+len*bre);
		System.out.println("Perimeter "+2*(len+bre));
		*/
	}
}
