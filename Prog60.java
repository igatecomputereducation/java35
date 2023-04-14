class MyBank
{
	private int bal;
	void deposite(int amt)
	{
		bal=bal+amt;
	}
	void withdraw(int amt)
	{
		if(bal-amt<=500)
			System.out.println("Can't withdraw");
		else
			bal=bal-amt;
	}
	void dispBalance()
	{
		System.out.println("Balance:"+bal);
	}
}
class Prog60 
{
	public static void main(String[] args) 
	{
		MyBank ob=new MyBank();
		ob.deposite(5000);
		ob.dispBalance();
		//ob.withdraw(4700);
		ob.withdraw(2000);
		ob.dispBalance();
	}
}
