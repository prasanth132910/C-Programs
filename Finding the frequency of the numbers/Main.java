#include<stdio.h>
int main()
{
int n,i,j,k;
scanf("%d",&n);
scanf("%d",&k);
  int a[n];
  for(i=0;i<n;i++)
  {
  scanf("%d",&a[i]);
  }
  for(i=1;i<=k;i++)
  {
     int count=0;
    for(j=0;j<n;j++)
    {
     
        if(a[j]==i)
        {
       count++; 
        }
    } 
    printf("%d %d\n",i,count);
    
  }

 
  
       
  

  
return 0;
}