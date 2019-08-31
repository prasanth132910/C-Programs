import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String str1=sc.nextLine();
      String str2=sc.nextLine();
      int parts=sc.nextInt();
     String[] aa =str2.split(" ",parts);
    
      for(String a:aa)
        System.out.println(a);
    }
}