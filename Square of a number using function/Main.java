#include<stdio.h>
int square(int);
int main()
{
 int a,op;
  scanf("%d",&a);
   op=square(a);
  printf("%d",op);
   return 0;
}
int square(int a)
{
  int sq;
  sq=a*a;
  return sq;
}
