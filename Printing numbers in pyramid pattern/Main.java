#include <stdio.h>
int main()
{
int i,j,n,count=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(int space=1;space<=n-i;space++)
    {
       printf(" ");
    }
  for(j=1;j<=i;j++)
  {
     printf("%d ",count);
    count++;
  }
  printf("\n");
  }

   return 0;
}