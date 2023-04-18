class Num
{
	int x=5;
	void display()
	{
		int x=80;
		System.out.println(x);
		System.out.println(this.x);
	}
}
class Prog75 
{
	public static void main(String[] args) 
	{
		new Num().display();
	}
}