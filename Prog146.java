@FunctionalInterface
interface Num
{
	void printBiggest(int x,int y);
}
class Prog146 
{
	public static void main(String[] args) 
	{
		/*
		Num ob=new Num(){
			public void printBiggest(int x,int y)
			{
				if(x==y)
					System.out.println("Equals");
				else if(x>y)
					System.out.println("Biggest:"+x);
				else
					System.out.println("Biggest:"+y);
			}
		};
		*/

		Num ob=(x,y)->{
			if(x==y)
					System.out.println("Equals");
			else if(x>y)
				System.out.println("Biggest:"+x);
			else
				System.out.println("Biggest:"+y);
		};
		ob.printBiggest(34,56);
	}
}