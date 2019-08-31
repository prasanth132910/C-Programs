#include <stdio.h>
int main()
{
  int N,second_digit;
  scanf("%d",&N);
  while(N>100)
  {
    N=N/10;
  }
  second_digit=N%10;
  printf("%d",second_digit);

 return 0;
}