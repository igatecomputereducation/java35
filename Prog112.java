class First
{
	class Second
	{
		class Third
		{
			void display(){
				System.out.println("hello i am here!!");
			}
		}
	}
}
class Prog112 
{
	public static void main(String[] args) 
	{
		First f=new First();
		First.Second s=f.new Second();
		First.Second.Third t=s.new Third();
		t.display();
	}
}