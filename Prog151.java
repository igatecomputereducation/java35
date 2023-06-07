interface Details
{
	private void address()
	{
		System.out.println("Pulabazar\nKavali");
	}
	default void header()
	{
		System.out.println("Cloud99 Labs");
		address();
	}
}
class Prog151 
{
	public static void main(String[] args) 
	{
		/*
		Details ob=new Details(){
		};
		ob.header();
		*/

		new Details(){}.header();
	}
}