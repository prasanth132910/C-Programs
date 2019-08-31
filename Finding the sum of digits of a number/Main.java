#include <stdio.h>
int main()
{
  int N,sum=0,R;
  scanf("%d",&N);
  while(N>0)
  {
    R=N%10;
    sum=sum+R;
    N=N/10;
  }
  printf("%d",sum);

 return 0;
}