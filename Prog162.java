interface IgateMath
{
	double squareRoot(double x);
}
class Prog162 
{
	public static void main(String[] args) 
	{
		IgateMath ob=Math::sqrt;
		System.out.println(ob.squareRoot(81));
	}
}