#include<stdio.h>
int main()
{
  int Num,Result,a,b;
  scanf("%d",&Num);
  a=Num/100;
  b=Num%10;
  Result=a+b;
  printf("%d",Result);
  return 0;
}