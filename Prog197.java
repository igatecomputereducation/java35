import java.util.*;
class Prog197
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any string:");
		String str=sc.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
			rev=rev+str.charAt(i);
		System.out.println("Reverse string:"+rev);

	}
}