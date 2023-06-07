interface First
{
	default void dispFirst()
	{
		System.out.println("disp of first");
	}
}
interface Second
{
	default void dispSecond()
	{
		System.out.println("disp of second");
	}
}
class User implements First,Second
{
	void dispUser()
	{
		System.out.println("disp of user");
	}
}
class Prog149
{
	public static void main(String[] args) 
	{
		User u=new User();
		u.dispFirst();
		u.dispSecond();
		u.dispUser();
	}
}