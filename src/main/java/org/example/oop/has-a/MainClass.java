import java.util.*;
class Branch
{
	int branch_code = 121;
	String city = "Blr";
    static int counter = 1000;
    static Account a1 = null;//def.val of ref = null

	public static void addAccount()
	{
      a1 = new Account(counter);
      counter++;
	}
}

class Account
{
	int acn_no;
	double bal;

	public Account(int acn_no)
	{
       this.acn_no = acn_no;
	}
    
    public void showAcntDetails()
    {
    	System.out.println("Accn No : "+acn_no);
    	System.out.println("Bal     : "+bal);
    }
}

class Mainclass
{
	public static void main(String[] args) 
	{
	   System.out.println("Program starts...");

	   Branch.addAccount();

	   Branch.a1.showAcntDetails();

	   System.out.println("Program ends...");	
	}
}