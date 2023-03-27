import java.util.*;
class Prog30 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int dis,fuel;
		char ch='y';
		while(ch=='y')
		{
			System.out.print("Fuel consumed:");
			fuel=sc.nextInt();
			System.out.print("Distance travelled:");
			dis=sc.nextInt();
			if(fuel<=0 || dis<=0)
			{
				System.out.println("Invalid input..");
				continue;
			}
			System.out.println("Millage "+(float)dis/fuel+
														" kmpl");
			System.out.print("Wanna continue [y/n]:");
			ch=sc.next().toLowerCase().charAt(0);
		}
	}
}