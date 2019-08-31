#include<stdio.h>
int main()
{
 int n,i;
 int a[n];
 scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  int maximum=a[0];
   for(i=0;i<n;i++)
  {
     if(a[i]>maximum)
     {
    maximum=a[i];
     }       
   }
  printf("%d",maximum);
return 0;
}