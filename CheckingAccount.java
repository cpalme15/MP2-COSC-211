
public class CheckingAccount extends Account
{	
	private double overDraftLimit=-250.00;
	private static double balance;
	private String err404="You're Overdraft you can not withdraw any more money";
	
	
	
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
			setBalance(getBalance() + amt);
		}
		
		else
		{
			System.out.println("You can not add a negative amount!");
		}
	
		
	}
@Override
	public void withdraw(double amt)
	{	if(balance<=overDraftLimit)
		{
		if(amt>0.0)
		{
			setBalance(getBalance() - amt);
		}
		else
		{
			System.out.println("Please put in a postive number");
		}
		}
	else
		System.out.println(err404);
	


}
@Override
public String toString() {
	if(balance<=overDraftLimit){
	return "Account Type : Checking Account \n" +"balance=" + getBalance() +"\n"+ " acctNum=" + this.getAccountNumber();

	}
	return "Account Type : Checking Account \n" +"balance=" + getBalance() +"\n"+ " acctNum=" + this.getAccountNumber();
	}

}
