import java.util.*;
class Prog200 
{
	static String reverse(String x)
	{
		String rev="";
		for(int i=x.length()-1;i>=0;i--)
			rev=rev+x.charAt(i);
		return rev;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a line of text..");
		String str=sc.nextLine();
		String s[]=str.split(" ");
		String res="";
		for(String t:s)
			res=res+reverse(t)+" ";
		System.out.println(res);
	}
}