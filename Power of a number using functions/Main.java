#include<stdio.h>
int power(int,int);
int main()
{
 int base,exp,result;
  scanf("%d",&base);
  scanf("%d",&exp);
  result=power(base,exp);
  printf("%d",result);
  	return 0;
}
int power(int base,int exp)
{
  int result;
 result=pow(base,exp);
  return result;
}