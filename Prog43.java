class Num
{
	int x,y;
}
class Prog43 
{
	public static void main(String[] args) 
	{
		Num n1=new Num();
		n1.x=10;
		n1.y=20;

		Num n2=n1;

		n2.x+=5;
		n2.y+=5;

		System.out.println(n1.x+"\n"+n1.y);
	}
}
