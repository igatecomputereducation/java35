abstract class Igate
{
	void mernFullStack()
	{
		System.out.println("150Hrs");
	}
	abstract void javaSE();
	abstract void javaFullStack();
	static Igate create()
	{
		Igate i=new Igate(){
			void javaSE()
			{
				System.out.println("200Hrs");
			}
			void javaFullStack()
			{
				System.out.println("600Hrs");
			}
		};
		return i;
	}

}
class Prog134 
{
	public static void main(String[] args) 
	{
		Igate ob=Igate.create();
		ob.mernFullStack();
		ob.javaSE();
		ob.javaFullStack();
	}
}
