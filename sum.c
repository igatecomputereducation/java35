#include<stdio.h>
void sum(int x,int y)
{
	printf("Addition:%d",x+y);
}
void sum(int x,int y,int z)
{
	printf("Addition:%d",x+y);
}
int main()
{
	sum(10,20);
	sum(4,5,6);
	return 0;
}
