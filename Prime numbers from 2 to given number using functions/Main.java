#include<stdio.h>
void prime(int);
int main()
{
  int n;
  scanf("%d",&n); 
   prime(n);
  return 0;
}
void prime(int n)
{
  for(int i=2;i<=n;i++)
  {
   int count=0;
    for(int j=1;j<=n;j++)
    {   
      if(i%j==0)
      {
        count++;
      }
    }
    if(count==2)
    {
      printf("%d\n",i);
    }
  }
}