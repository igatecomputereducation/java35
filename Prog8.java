import java.util.*;
class Prog8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b,temp;

		System.out.printf("Enter value into a:");
		a=sc.nextInt();
		System.out.printf("Enter value into b:");
		b=sc.nextInt();

		/*
		temp=a;
		a=b;
		b=temp;
		*/

		/*
		a=a+b;
		b=a-b;
		a=a-b;
		*/

		/*
		a=a*b;
		b=a/b;
		a=a/b;
		*/
		
		/*
		a=a^b;
		b=a^b;
		a=a^b;
		*/

		b=(a+b)-(a=b);

		System.out.printf("Value of a %d\n",a);
		System.out.printf("Value of b %d\n",b);

	}
}
