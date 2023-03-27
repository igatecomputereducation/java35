import java.util.*;
class Prog7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,fi,se,th,fo,sm;
		System.out.printf("Enter any 4 digit natural number:");
		n=sc.nextInt();
		fo=n%10;
		n=n/10;
		th=n%10;
		n=n/10;
		se=n%10;
		n=n/10;
		fi=n%10;
		sm=fi+se+th+fo;
		System.out.printf("Sum of all the digits %d\n",sm);
	}
}