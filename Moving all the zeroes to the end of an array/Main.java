#include<stdio.h>
int main()
{
int n,count=0;
  scanf("%d",&n);
  int list[n];
  for(int i=0;i<n;i++)
  {
      scanf("%d",&list[i]);
  }
  for(int i=0;i<n;i++)
  {
    if(list[i]>0)
    {
      list[count]=list[i];
      count++;
    }
  }
  while(count<n)
  {
  list[count]=0;
    count++;
  }
    for(int i=0;i<n;i++)
  {
      printf("%d ",list[i]);
  }
}