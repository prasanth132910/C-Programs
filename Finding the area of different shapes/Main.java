import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int op=sc.nextInt();
      
      switch(op)
      {
        case 1:
             int side=sc.nextInt();
             int areasq=side*side;
             System.out.println(areasq);
             break;
       case 2:
             int length=sc.nextInt();
             int breadth=sc.nextInt();
             int arearect=length*breadth;
             System.out.println(arearect);
             break;
       case 3:
             int base=sc.nextInt();
             int height=sc.nextInt();
             double areatri=0.5*base*height;
             System.out.println(areatri);
             break;
      case 4:
            int rad=sc.nextInt();
            double areacir=3.14*rad*rad;
             System.out.println(areacir);
            break;
          
      }
       
    }
}