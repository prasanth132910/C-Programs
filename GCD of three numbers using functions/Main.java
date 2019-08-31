#include<stdio.h>
void gcdno(int,int,int);
int main()
{
  int n1,n2,n3;
  scanf("%d",&n1);
  scanf("%d",&n2);
  scanf("%d",&n3);
  gcdno(n1,n2,n3);
  return 0;
}
void gcdno(int n1,int n2,int n3)
{
  int  min,gcd;
  if(n1>n2)
    min=n2;
  else
    min=n1;
  if(min>n3)
    min=n3;
  while(min>=1)
  {
    if((n1%min==0) && (n2%min==0) && (n3%min==0))
    {
      gcd=min;
      break;
    }
      min--;
  }
  printf("%d",gcd);
}
