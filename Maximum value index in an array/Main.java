
#include <stdio.h>

int main()
{
int n,i,max,Position;
scanf("%d",&n);
  int list[n];
  for(i=0;i<n;i++)
  {
  scanf("%d",&list[i]);
  }
  max=list[0];
  for(i=0;i<n;i++)
  {
  if(list[i]>max)
  {
    max=list[i];
    Position = i;

  }
  }
      printf("%d",Position);
   return 0;
}