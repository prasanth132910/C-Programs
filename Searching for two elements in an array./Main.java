#include<stdio.h>
int main()
{
  int n,i,j,search_elem1,search_elem2,flag=0;
  int a[n];
  scanf("%d",&n);
   for(i=0;i<n;i++)
  {
      scanf("%d",&a[i]);
   }
     scanf("%d",&search_elem1);
    scanf("%d",&search_elem2);
  for(i=0;i<n;i++)
  {
  if(search_elem1==a[i])
  {
    flag=1;
    break;
  }
  }
  if(flag==1)
    printf("%d\n",i);
  else
   printf("-1");
   flag=0;
  
   for(j=0;j<n;j++)
  {
  if(search_elem2==a[j])
  {
    flag=1;
    break;
  }
  }
  if(flag==1)
    printf("%d",j);
  else
   printf("-1");
  return 0;
}