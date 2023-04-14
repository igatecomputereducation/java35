import java.util.*;
class Num
{
	int singleDig(int n)
	{
		if(n%9==0)
			return 9;
		else
			return n%9;
	}
}
class Prog52 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		Num n=new Num();

		System.out.print("Enter your number:");
		int x=sc.nextInt();

		System.out.println("Single digit:"+n.singleDig(x));
		switch(n.singleDig(x))
		{
			case 1,7,9->
				System.out.println("Lucky");
			case 3,5->
				System.out.println("Moderate");
			default->
				System.out.println("Better change number");
				
		}
	}
}
