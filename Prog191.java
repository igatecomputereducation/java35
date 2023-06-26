class Display<K,V>
{
	K x;
	V y;
	void setData(K x,V y)
	{
		this.x=x;
		this.y=y;
	}
	void printX()
	{
		System.out.println(x);
	}
	void printY()
	{
		System.out.println(y);
	}
}
class Prog191 
{
	public static void main(String[] args) 
	{
		Display<String,Integer> d1=new Display<String,Integer>();
		d1.setData("Ramana",12000);
		d1.printX();
		d1.printY();

		Display<Integer,Boolean> d2=new Display<Integer,Boolean>();
		d2.setData(12,true);
		d2.printX();
		d2.printY();
	}
}
