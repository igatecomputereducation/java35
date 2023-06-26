import java.util.*;
class Prog201 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any string:");
		String str=sc.nextLine();
		String res="";
		for(int i=0;i<str.length();i++)
		{
			String ch=String.valueOf(str.charAt(i));
			if(!res.contains(ch))
				res=res+ch;
		}
		System.out.println(res);
	}
}
