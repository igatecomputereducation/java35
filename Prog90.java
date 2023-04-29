class Num
{
	static int x;
	int y;
}
class Prog90 
{
	public static void main(String[] args) 
	{
		System.out.println(Num.x);
		Num ob1=new Num();
		ob1.x+=5;
		ob1.y+=5;
		Num ob2=new Num();
		ob2.x+=8;
		ob2.y+=8;
		System.out.println(Num.x);
		System.out.println(ob1.y);
		System.out.println(ob2.y);
	}
}
