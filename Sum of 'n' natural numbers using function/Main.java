#include<stdio.h>
int sum(int);
int main()
{
 int a,op;
  scanf("%d",&a);
   op=sum(a);
  printf("%d",op);
   return 0;
}
int sum(int a)
{
  int result=0,i;
  for(i=0;i<=a;i++)
  {
  result=result+i;
  }
 
  return result;
}
