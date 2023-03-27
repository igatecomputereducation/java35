import java.util.*;
class Prog21 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any natural number:");
		int n=sc.nextInt();
		int gr=(n%9==0)?9:n%9;
		System.out.println("Your single digit number:"+gr);
		switch(gr)
		{
			case 1,9->
				System.out.println("Lucky number");
			case 5,7->
				System.out.println("Moderate number");
			default->
				System.out.println("Better change number");
		}
	}
}
