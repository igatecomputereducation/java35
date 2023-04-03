import java.util.*;
class Prog39 
{
	public static void main(String[] args) 
	{
		Random r=new Random();

		String[][] x=new String[4][];
		x[0]=new String[]{"Gobi Manchuria","Veg Manchuria","Baby Corn","Chi Lollypop"};
		x[1]=new String[]{"Veg Bir","Chi Bir","Mut Bir","Veg Rice","Dhum Bir","Bongu Bir"};
		x[2]=new String[]{"Ice Cream","Kheer","Cake"};
		x[3]=new String[]{"Thums Up","Sprite","Maaza"};

		System.out.println("Your dinner...");
		System.out.println("==============");
		System.out.println(x[0][r.nextInt(x[0].length)]);
		System.out.println(x[1][r.nextInt(x[1].length)]);
		System.out.println(x[2][r.nextInt(x[2].length)]);
		System.out.println(x[3][r.nextInt(x[3].length)]);
	}
}