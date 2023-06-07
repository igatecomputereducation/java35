import java.util.*;
class Prog167 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=0,b=0,c=0;
		try{
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
					System.out.println(ae.getMessage());
					System.out.print("Enter a non-zero Den:");
					b=sc.nextInt();
					c=a/b;
					System.out.println("Division:"+c);
				}
		}
		catch(ArithmeticException ie)
		{
			System.out.println("Goto hell");
		}
		System.out.println("End of main");
	}
}