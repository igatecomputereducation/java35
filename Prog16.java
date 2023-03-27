import java.util.*;
class Prog16 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("User Name:");
		String uid=sc.nextLine();
		if(uid.equalsIgnoreCase("Kavali"))
		{
			System.out.print("Password:");
			String pwd=sc.nextLine();
			if(pwd.equals("tiger"))
				System.out.println("You are welcome");
			else
				System.out.println("Invalid password");
		}
		else
			System.out.println("Who are you..");
	}
}
