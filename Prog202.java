import java.util.*;
class Prog202 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("First String:");
		String x=sc.nextLine();
		System.out.print("Second string:");
		String y=sc.nextLine();
		if(x.length()==y.length())
		{
			boolean flag=true;
			for(int i=0;i<x.length();i++)
			{
				String ch=String.valueOf(x.charAt(i));
				if(!y.contains(ch))
				{
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.println("Anagrams");
			else
				System.out.println("Not anagrams");
		}
		else
			System.out.println("Not anagrams");
	}
}