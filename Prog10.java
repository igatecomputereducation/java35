import java.util.*;
class Prog10 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any integer:");
		int n=sc.nextInt();
		if(n==0)
			System.out.println("Zero");
		if(n>0)
			System.out.println("+ve");
		if(n<0)
			System.out.println("-ve");

	}
}
