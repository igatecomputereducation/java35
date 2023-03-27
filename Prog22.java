import java.util.*;
class Prog22 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Type of connection [a/d/c/i]:");
		char ch=sc.nextLine().toLowerCase().charAt(0);
		if(ch=='a' || ch=='d' || ch=='c' || ch=='i')
		{
			System.out.print("CMR:");
			int cmr=sc.nextInt();
			System.out.print("PMR:");
			int pmr=sc.nextInt();
			int nu=cmr-pmr;
			float bill=switch(ch)
			{
				case 'a'->nu*0.50f;
				case 'd'->nu*5.75f;
				case 'c'->nu*12.25f;
				case 'i'->nu*10.50f;
				default->0;
			};
			System.out.println("Number of units:"+nu);
			System.out.println("Bill:"+bill);
		}
		else
			System.out.println("Invalid connection type");
	}
}
