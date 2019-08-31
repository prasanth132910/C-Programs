
import java.util.*;

class Faculty
{
	
	public int basesalary;	
	public void print()
	{
		System.out.println("Base Salary: "+basesalary);
	}

}


class Cse extends Faculty
{
	public void printsal()
	{
		System.out.println("CSE Faculty: "+(basesalary+3000));
	}
}

class IT extends Faculty
{
	public void printsal()
	{
		System.out.println("IT Faculty: "+(basesalary+5000));
	}
}
class Ece extends Faculty
{
	public void printsal()
	{
		System.out.println("ECE Faculty: "+(basesalary+4500));
	}
}


public class Main
{
public static void main(String[] arg)
{
	//System.out.println("enter sal");
	Faculty fa=new Faculty();

	Scanner sc=new Scanner(System.in);
	fa.basesalary=sc.nextInt();	
//	System.out.println(fa.basesalary);
	
	Cse cs=new Cse();
	cs.basesalary=fa.basesalary;
	
	
	IT it=new IT();
	Ece ec=new Ece();
	it.basesalary=fa.basesalary;
	ec.basesalary=fa.basesalary;
	
	  cs.print();
	 cs.printsal();	
	 it.printsal();	
	 ec.printsal();	
}
}