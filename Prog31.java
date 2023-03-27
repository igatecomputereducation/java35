import java.util.*;
class Prog31 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Opening balance:");
		int bal=sc.nextInt();
		if(bal<500)
			System.out.println("Minimum balance required");
		else
		{
			abc:while(true)
			{
				int amt;
				System.out.print("1.Deposite\n2.Withdraw\n3.Display Balance\n4.Exit\nEnter your choice [1..4]");
				int ch=sc.nextInt();
				switch(ch)
				{
					case 1:
						System.out.print("Amount:");
						amt=sc.nextInt();
						bal=bal+amt;
						break;
					case 2:
						System.out.print("Amount:");
						amt=sc.nextInt();
						if(bal-amt<1000)
							System.out.println("Not enough balance");
						else
							bal=bal-amt;
						break;
					case 3:
						System.out.println("Balance:"+bal);
						break;
					case 4:
						break abc;
					default:
						System.out.println("Invalid choice");
				}//end of switch
			}//end of while
		}//end of else
	}//end of main
}//end of class