import java.util.*;
class Prog198 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any string:");
		String str=sc.nextLine();
		boolean x=true;
		for(int i=0,j=str.length()-1;i<j;i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				x=false;
				break;
			}
		}

		if(x)
			System.out.println("Palindrome string");
		else
			System.out.println("Not a palindrome string");

	}
}
