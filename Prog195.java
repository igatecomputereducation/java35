import java.util.*;
class Prog195
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("First string");
		String s1=sc.nextLine();
		System.out.print("Second string");
		String s2=sc.nextLine();
		//if(s1==s2)
		if(s1.equals(s2))
			System.out.println("Equals");
		else
			System.out.println("Not equals");

	}
}