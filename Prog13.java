import java.util.*;
class Prog13 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any integer:");
		int n=sc.nextInt();
		if(n%2==0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
	}
}