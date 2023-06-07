@FunctionalInterface
interface Message
{
	void printMsg();
}
class Prog145 
{
	public static void main(String[] args) 
	{
		/*
		Message m=new Message(){
			public void printMsg()
			{
				System.out.println("Hello world");
			}
		};*/
		Message m=()->{
			System.out.println("Hello world");
		};
		m.printMsg();
	}
}