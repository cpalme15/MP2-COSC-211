
public class SavingsAccount extends  Account  
{

	private static double interest;
	private static double balance;
	
	public SavingsAccount(int num) {
		super(num);
		balance=this.getBalance();

	}
	public static void Interest()
	{	 
		interest=balance*0.05;
		balance=balance+interest;
	}
	@Override
	public void deposit(double amt)
	{
		if(amt>0.0)
		{
			setBalance(this.getBalance() + amt);
		}
		else
		{
			System.out.println("You can not add a negative amount!");
		}
	}
	@Override
	public void withdraw(double amt)
{ 		if(this.getBalance()>0.0)
		{
			if(amt>0)
			{ if(amt<this.getBalance())
				{
					
				}
				else
					System.out.println("You can't withdraw more than you have");
			}	
			else
				System.out.println("Please put in a positive number");
			
		}
}
	@Override
	public String toString(){
	return "Account Type : Savings Account  \n" +"balance=" + getBalance() +"\n"+ " acctNum=" + this.getAccountNumber();
	}
}
