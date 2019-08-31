#include<stdio.h>
void largest(int,int,int);
int main()
{
  int x,y,z,temp=0;
  scanf("%d",&x); 
  scanf("%d",&y); 
  scanf("%d",&z); 
  largest(x,y,z);

  return 0;
}
void largest(int x,int y,int z)
{
  int temp;
   if(x>y)
       temp=x;
  else
       temp=y;
  if(temp>z)
  {
    printf("%d",temp);
  }
  else
    printf("%d",z);
}