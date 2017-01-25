public class CheckingAccount extends Account
{	
	private double overDraftLimit=-250.00;
	private static double balance;
	private static int errcode;
	private String errcodemes="";
	
	
	
	
	public CheckingAccount(int num) {
		super(num);
		balance=this.getBalance();
	}

	public boolean checkingOverdraft()
	{	boolean overdraftStatus;
		if(this.balance==overDraftLimit)
			return false;
		else
			return true;
	}
@Override
	public void deposit(double amt)
	{	
		if(amt>0.0)
		{
			setBalance(this.getBalance()+amt);
		}
		
		else
		{
		
			errcodemes="You can not add a negative amount!";
		}
	
		
	}
@Override
	public void withdraw(double amt)
	{	
	if(balance<=overDraftLimit)
		{
		if(amt>0.0)
			setBalance(this.getBalance() - amt);
		else 	
			errcodemes="Please put in a postive number";
				
		}
	else
		errcodemes="You're Overdraft you can not withdraw any more money";


}
		
		
		
 
@Override
public String toString() {
	
	return "Account Type: Checking Account \n" +"Balance = " +defaultFormat.format(this.getBalance()) +"\n"+ " Account Number =" + this.getAccountNumber()+"\n"+errcodemes;



	}
}
