import java.util.*;
class Prog168
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=0,b=0,c=0;
		try
		{
			System.out.print("Num:");
			a=sc.nextInt();
			System.out.print("Den:");
			b=sc.nextInt();
			c=a/b;
			System.out.println("Division:"+c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Can't divide by zero");
		}
		catch(InputMismatchException ie)
		{
			System.out.println("Input must be non-zero integers");
		}
		System.out.println("End of main");
	}
}
