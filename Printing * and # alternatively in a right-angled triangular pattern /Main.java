#include<stdio.h>
int main()
{
  int n,num=0,i,j,flag=0;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      if(flag==0)
      {
        printf("*");
        flag=1;
      }
      else
         {
        printf("#");
        flag=0;
      }
    }
 printf("\n");
    
  }
  return 0;
}