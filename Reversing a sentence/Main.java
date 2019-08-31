#include<stdio.h>
#include<string.h>
int main()
{ 
  int index=-1,l,l1,l2;
 char s1[100];
   scanf("%[^\n]s",s1);
  l1=strlen(s1);
  for(int i=l1-1;i>=0;i--)
  {
    if(s1[i]==' ')
    {
        printf("%s ",&s1[i+1]);
        s1[i]='\0';
    }
  }
  printf("%s",s1);
  return 0;
}