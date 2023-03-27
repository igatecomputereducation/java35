import java.util.*;
class Prog26 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Random r=new Random();

		int count=0;
		int sch,uch;
		int i=1;
		while(i<=10)
		{
			System.out.print("Your choice 1..6:");
			uch=sc.nextInt();

			sch=r.nextInt(6);
			sch=sch+1;
			System.out.println("System choice:"+sch);

			if(sch==uch)
			{
				System.out.println("Thumbs up");
				count++;
			}
			else
				System.out.println("Thumbs down");

			i=i+1;
		}

		if(count>=3)
			System.out.println("You won..");
		else
			System.out.println("Computer won..");

	}
}
