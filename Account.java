
public class Account {
private double balance;
private int acctNum;


public  Account(int num)
	{
	setBalance(0.0);
	acctNum=num;
	}
	
	public void deposit(double amt)
	{
		if(amt>0)
		{
			setBalance(getBalance() + amt);
		}
		else
		{
			System.out.println("You can not add a negative amount!");
		}
	}
	public void withdraw(double amt)
	{
		if(amt>0)
		{
			setBalance(getBalance() - amt);
		}
		else
		{
			System.out.println("Please put in a postive number");
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
	public int getAccountNumber()
	{
		return acctNum;
	}
	@Override
	public String toString() {
		return "Account [balance=" + getBalance() + ", acctNum=" + acctNum + "]";
	}
	public final void print()
	{
		System.out.println(toString());
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
