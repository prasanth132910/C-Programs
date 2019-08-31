
import java.util.Scanner;

public class Main
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Bill bil=new Bill();


	   bil.pdctname=sc.next();
       bil.price=sc.nextInt();
       bil.quantity=sc.nextInt();
       

     System.out.println("Total Price is : "+bil.totalAmount());

	}
}


class Item
{
	int price;
}
class Customer extends Item
{
	String pdctname;
	int quantity;
	
}
class Bill extends Customer
{
	public int totalAmount()
	{ 
		int c = price * quantity;
		return c;
	}
}
