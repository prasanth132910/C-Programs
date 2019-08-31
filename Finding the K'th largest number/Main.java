#include<stdio.h>
int main()
{
int n,i,j,k,val,temp;
scanf("%d",&n);

  int a[n];
  for(i=0;i<n;i++)
  {
  scanf("%d",&a[i]);
  }

    scanf("%d",&val);
  for(i=0;i<n;i++)
  {
    for(k=i+1;k<n;k++)
    {
      if(a[i]>a[k])
      {
        temp=a[i];
        a[i]=a[k];
        a[k]=temp;
      }
    }
  }
 
printf("%d\n",a[n-val]);
  

  
return 0;
}