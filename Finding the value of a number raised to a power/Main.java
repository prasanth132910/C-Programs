import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      int result=1;
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int pow=sc.nextInt();
      while(pow >0)
      {
        result *=base;
        pow--;
      }
      System.out.println(result);
      
    }
}