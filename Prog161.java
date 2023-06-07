interface Igate
{
	void details();
}
class Prog161 
{
	public static void main(String[] args) 
	{
		/*
		Igate ob=new Igate(){
			public void details()
			{
				System.out.println("igate solutions");
				System.out.println("Near manasa theatre");
				System.out.println("Kavali");
			}
		};
		*/

		/*
		Igate ob=()->{
			System.out.println("igate solutions");
			System.out.println("Near manasa theatre");
			System.out.println("Kavali");
		};
		*/

		Igate ob=new Publish()::address;
		ob.details();
	}
}
