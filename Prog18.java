import java.util.*;
class Prog18 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("1.Personal\n2.Commercial\n
				3.Gold\n4.Crop\nEnter your choice [1..4]");
		int type=sc.nextInt();
		
		if(type<1 || type>4)
			System.out.println("Invalid choice");
		else
		{
			System.out.print("Amount:");
			int amt=sc.nextInt();
			
			System.out.print("Time in months:");
			int mon=sc.nextInt();

			float si=0;

			if(type==1)
				si=amt*mon*1.75f/100;
			else if(type==2)
				si=amt*mon*2.00f/100;
			else if(type==3)
				si=amt*mon*0.75f/100;
			else if(type==4)
				si=amt*mon*0.50f/100;

			float tot=amt+si;
			System.out.println("Amount:"+amt+
				"\nInterest:"+si+"\ntotal:"+tot);
		}
	}
}