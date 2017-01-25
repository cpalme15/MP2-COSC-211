public class SavingsAccount extends  Account  
{

	private static double interest;
	
	public SavingsAccount(int num) {
		super(num);
		interest = 0.05;

	}
	public void Interest()
	{	 
		this.deposit(this.getBalance() + (this.getBalance()*interest));
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
	return "Account Type : Savings Account  \n" +"Balance = " + defaultFormat.format(this.getBalance()) +"\n"+ " Account Number = " + this.getAccountNumber();
	}
}