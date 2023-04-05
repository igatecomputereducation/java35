#include<stdio.h>
int adding(int x,int y,int z)
{
	int s;
	s=x+y+z;
	return s;
}
int main()
{
	int a,b,c,sm;
	a=10;
	b=20;
	c=30;
	sm=adding(a,b,c);
	printf("Sum %d\n",sm);
	return 0;
}
