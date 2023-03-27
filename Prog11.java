import java.util.*;
class Prog11 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 integers..");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==b)
			System.out.println("Equals");
		if(a>b)
			System.out.println("Biggest number:"+a);
		if(b>a)
			System.out.println("Biggest number:"+b);
	}
}
