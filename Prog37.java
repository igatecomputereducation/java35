class Prog37 
{
	public static void main(String[] args) 
	{
		int[][] x=new int[][]{{10,20,30,40,50},
							  {11,22,33,44,55},
							  {10,11,12,13,14}};

		/*
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
				System.out.print(x[i][j]+"\t");
			System.out.println("\n");
		}
		*/

		for(int[] t:x)
		{
			for(int y:t)
				System.out.print(y+"\t");
			System.out.println("\n");
			
		}
	}
}
