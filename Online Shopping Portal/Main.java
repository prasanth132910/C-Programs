
public class Main 
{

	public static void main(String[] args)
	{
		Customers cust1=new Customers(1001,"Saakshi",9000000000l,"Bangalore","16-Jul-1990","F","Lakme Kajal,Salwar");
		Customers cust2=new Customers(1008,"Rahul",9000000001l,"Chennai","27-Jan-1992","M","T-Shirt, Jeans");
	  
		Supplier supp1=new Supplier(7901,"ABC Traders",8000000000l,"Mumbai",10,"Paid",4.75f);
		Supplier supp2=new Supplier(7972,"XYZ Enterprises",8000000900l,"Kolkata",7, "Unpaid",4.35f);
		
		cust1.dispalyProfileDetails();
		cust2.dispalyProfileDetails();
		supp1.dispalyProfileDetails();
		supp2.dispalyProfileDetails();
		
		cust1.editAddress("Saakshi","Coimbatore");
		supp1.editAddress("ABC Traders","Delhi");
		
		cust1.placeOrder();
		
		supp1.increaseStockLevel(5);
		supp2.increaseStockLevel(10);
		
	}

}

class Users
{
	int id;
	String name;
	long mobileNumber;
	String address;

}
class Customers extends Users
{
	
	String dob,order;
	String gender;
	public Customers(int custID,String name,long mobileno,String shippngadd,String dob,String gender,String order)
	{
		this.id=custID;
		this.name=name;
		this.mobileNumber=mobileno;
		this.address=shippngadd;
		this.dob=dob;
		this.gender=gender;
		this.order=order;
	}
	
	public void dispalyProfileDetails()
	{
		System.out.println(name+","+" "+mobileNumber);
	}	
	
	public void editAddress(String name,String address)
	{
	 System.out.println(this.name +","+" "+  this.address);	
	 this.name=name;
	 this.address=address;
	 System.out.println(this.name +","+" "+ this.address);	
	 
	}
	public void placeOrder()
	{
		System.out.println("Order placed successfully!");
	}
}


class Supplier extends Users
{
	int stock;
	String paystatus;
	float feedback;
	public Supplier(int id,String name,long mobileno,String billingadd,int stock,String paystatus,float feedback)
	{
	this.id=id;
	this.name=name;
	this.mobileNumber=mobileno;
	this.address=billingadd;
	this.stock=stock; 
	this.paystatus=paystatus;
	this.feedback=feedback;
	
	}
	public void dispalyProfileDetails()
	{
		System.out.println(name+","+" "+mobileNumber);
	}
	public void editAddress(String name,String address)
	{
	 System.out.println(this.name +","+" "+ this.address);	
	 this.name=name;
	 this.address=address;
	 System.out.println(this.name +","+" "+this.address);	
	 
	}
	
  public void increaseStockLevel(int no)
	{
		this.stock=this.stock+no;
		System.out.println(this.name+","+" "+this.stock);
	}
	
}