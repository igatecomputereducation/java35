import java.util.*;
class Prog25 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		int age;
		do{
			System.out.print("Enter the age:");
			age=sc.nextInt();
			if(age>=18)
				System.out.println("Right to vote");
			else
				System.out.println("Not right to vote");
			System.out.print("Wanna continue [y/n]:");
			ch=sc.next().toLowerCase().charAt(0);
		}while(ch=='y');
	}
}
