abstract class Num
{
	protected int x,y;
	void setNum(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	abstract void manip();
}
class Prog133
{
	public static void main(String[] args) 
	{
		Num ob=new Num(){
			
			void manip()
			{
				System.out.println("Sum:"+(x+y));
			}
		};

		ob.setNum(4,5);
		ob.manip();
	}
}