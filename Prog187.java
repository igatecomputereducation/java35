import java.util.*;
class Prog187 
{
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<Integer>();

		list.add(12);
		list.add(45);
		list.add(55);
		//list.add("igate");

		int sum=0;
		for(int t:list)
			sum=sum+t;

		System.out.println("Sum:"+sum);
	}
}
