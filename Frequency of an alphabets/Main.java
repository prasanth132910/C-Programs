#include<stdio.h>
#include<string.h>
int main()
{
    char str[100],alpha[26];
    scanf("%[^\n]s",str);
    int len=strlen(str);
    for(int i=0;i<26;i++)
     {
         alpha[i]=0;
     }
    for(int i=0;i<=len;i++)
    {
     if((str[i]>='a')&&(str[i])<='z')   
     {
         int offset=str[i]-'a';
         alpha[offset]++;
         
     }
        if((str[i]>='A')&&(str[i])<='Z')   
     {
         int offset=str[i]-'A';
         alpha[offset]++;
     }
       
    }
     for(int i=0;i<26;i++)
     {
             if(alpha[i] != 0)
         {
             printf("%c%d ", i + 'a', alpha[i]);
             alpha[i]=0;
         }
     }
    return 0;
}