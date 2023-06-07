@FunctionalInterface
interface Box
{
	int getVolume(int x,int y,int z);
}
class Prog147 
{
	public static void main(String[] args) 
	{
		/*
		Box ob=new Box(){
			public int getVolume(int x,int y,int z)
			{
				return x*y*z;
			}
		};*/


		/*
		Box ob=(x,y,z)->{
			int v=x*y*z;
			return v;
		};
		*/

		Box ob=(x,y,z)->x*y*z;
		System.out.println("Volume:"+ob.getVolume(3,4,5));
	}
}