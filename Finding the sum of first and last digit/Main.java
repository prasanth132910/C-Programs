#include <stdio.h>
int main()
{
  int N,Last_digit,Temp,Sum,First_digit;
  scanf("%d",&N);
  Temp=N;
  while(Temp>=10)
  {
    Temp=Temp/10;
  }
  Last_digit=N%10;
  First_digit=Temp;
  Sum=Last_digit+First_digit;
  printf("%d",Sum);

 return 0;
}