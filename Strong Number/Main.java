#include <stdio.h>
int main()
{
  int n,i,num,count=0,sum=0,temp,reminder,fact;
  scanf("%d",&n);
  temp=n;
  while(n>0)
  {
  fact=1;
   reminder=n%10;
   for(i=1;i<=reminder;i++)
  {
   fact=fact*i; 
  }
       sum=sum+fact;
  n=n/10;
   }

if(sum==temp)
  printf("Yes");
  else
      printf("No");

	return 0;
}