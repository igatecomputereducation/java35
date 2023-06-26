import java.util.*;
class Prog199 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a line of text..");
		String str=sc.nextLine();
		String x[]=str.split(" ");
		String res="";
		for(int i=x.length-1;i>=0;i--)
			res=res+x[i]+" ";
		System.out.println(res);
	}
}