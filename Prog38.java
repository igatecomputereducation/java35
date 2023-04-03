class Prog38 
{
	public static void main(String[] args) 
	{
		//declaration
		int[][] x=new int[3][];

		//assigning
		x[0]=new int[]{12,15,18};
		x[1]=new int[]{80,60};
		x[2]=new int[]{78};

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<x[i].length;j++)
				System.out.print(x[i][j]+"\t");
			System.out.println("\n");
		}

		/*
		for(int[] y:x)
		{
			for(int t:y)
				System.out.print(t+"\t");
			System.out.println("\n");
		}
		*/
	}
}
