import java.util.*;
class Prog14 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Gender [m/f]:");
		char gender=sc.nextLine().charAt(0);
		System.out.print("Age:");
		int age=sc.nextInt();
		System.out.print("Percentage:");
		float per=sc.nextFloat();
		/*
		if(gender=='m')
		{
			if(age>=25)
			{
				if(age<=35)
				{
					if(per>=75)
						System.out.println("You are selected");
					else
						System.out.println("We will call you again");
				}
				else
					System.out.println("too old to work");
			}
			else
				System.out.println("too young to work");
		}
		else
			System.out.println("Need male");
		*/
		if(gender=='m' && age>=25 && age<=35 && per>=75)
			System.out.println("Selected");
		else
			System.out.println("Not selected");
	}
}