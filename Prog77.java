class Message
{
	Message first()
	{
		System.out.println("In first method");
		return this;
	}
	Message second()
	{
		System.out.println("In second method");
		return this;
	}
	Message third()
	{
		System.out.println("In third method");
		return this;
	}
}
class Prog77 
{
	public static void main(String[] args) 
	{
		new Message().first().second().third();
	}
}
