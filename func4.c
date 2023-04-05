#include<stdio.h>
int x=45;
void first()
{
	printf("%d\n",x);
	x=x+5;
}
void second()
{
	printf("%d\n",x);
	x=x+5;	
}
int main()
{
	first();
	second();
	printf("%d\n",x);
	return 0;
}
