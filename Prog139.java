interface IntRate
{
	double B=1.80;
	double P=2.00;
	double G=1.50;
	double A=0.50;
}
class Prog139 
{
	public static void main(String[] args) 
	{
		int amt=100000;
		int time=6;
		double si=amt*time*IntRate.P/100;
		double tot=amt+si;
		System.out.println("Amount:"+amt);
		System.out.println("Interest:"+si);
		System.out.println("Total:"+tot);
	}
}
