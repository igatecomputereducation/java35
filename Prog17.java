import java.util.*;
class Prog17 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks in math, Phy and che..");
		int mat=sc.nextInt();
		int phy=sc.nextInt();
		int che=sc.nextInt();
		float avg=(mat+phy+che)/3.0f;
		if(mat>=50 && phy>=50 && che>=50 && avg>=65)
			System.out.println("Certified");
		else
		{
			if(mat<50)
				System.out.println("failed in maths");
			if(phy<50)
				System.out.println("failed in physics");
			if(che<50)
				System.out.println("failed in Chemistry");
			if(avg<65)	
				System.out.println("No agregate");
		}
	}
}