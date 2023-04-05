#include<stdio.h>
void manip(int p,int q)
{
	printf("Sum %d\n",p+q);
	printf("Subtraction %d\n",p-q);
	printf("Product %d\n",p*q);
	printf("Division %f\n",(float)p/q);
}
int main()
{
	int a,b;
	a=30;
	b=70;
	manip(a,b);
	return 0;
}
