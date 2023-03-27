import java.util.*;
class Prog27 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Random r=new Random();

		int scount=0,ucount=0;
		int uch,sch;
		int i=1;
		while(i<=10)
		{
			do{
				System.out.print("0.Rock\n1.Paper\n2.Scissors\nYour choice [0..2]");
				uch=sc.nextInt();
				if(uch<0 || uch>2)
					System.out.println("Your choice must be 0 to 2..");
			}while(uch<0 || uch>2);


			sch=r.nextInt(3);
			System.out.println("System choice:"+sch);

			if(uch==0 && sch==2)
			{
				System.out.println("you won");
				ucount++;
			}
			else if(sch==0 && uch==2)
			{
				System.out.println("System won");
				scount++;
			}
			else if(uch>sch)
			{
				System.out.println("You won");
				ucount++;
			}
			else if(sch>uch)
			{
				System.out.println("system won");
				scount++;
			}
			else if(sch==uch)
			{
				System.out.println("Draw");
			}

			System.out.println("------------------");

			i++;
		}

		if(ucount==scount)
			System.out.println("Play another time");
		else if(ucount>scount)
			System.out.println("You are the winner");
		else
			System.out.println("system won the game");
	}
}
