#include<stdio.h>
int main()
{
  int FirstNO,SecondNo,Result,Num;
  scanf("%d",&Num);
  FirstNO=Num/10;
  SecondNo=Num%10;
  Result=FirstNO+SecondNo;
  printf("%d",Result);
  return 0;
}