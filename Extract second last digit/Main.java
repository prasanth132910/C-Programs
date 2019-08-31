#include<stdio.h>
int main()
{
  int Num,Second_lastNo,N;
  scanf("%d",&Num);
  N=Num/10;
  Second_lastNo=N%10;
  printf("%d",Second_lastNo);
  return 0;
}