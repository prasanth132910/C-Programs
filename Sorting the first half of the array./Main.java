
#include<stdio.h>
int main()
{
   int n,temp;
   scanf("%d", &n);
   int list[n];
   for(int i = 0;i < n; i++)
   {
      scanf("%d", &list[i]);  
   }
   int low=0;
   int high=(0+n/2);
   
  for(int i=1;i<high;i++)
  {
      for(int j=0;j<high;j++)
      {
          if(list[j]>list[i])
          {
         temp=list[i];
         list[i]=list[j];
         list[j]=temp;
          }
      }
  }
   for(int i = 0;i < n; i++)
   {
      printf("%d ", list[i]);  
   }
   return 0;
}