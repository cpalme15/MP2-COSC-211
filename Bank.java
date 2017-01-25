import java.util.ArrayList;

public class Bank 
{


	
	
	public static void main(String[] args) 
	{ ArrayList<Account> bankAccounts=new ArrayList<Account>(4);
		bankAccounts.add(new CheckingAccount(0));
		bankAccounts.add(new SavingsAccount(1));
		bankAccounts.add(new CheckingAccount(2));
		bankAccounts.add(new SavingsAccount(3));
		
		bankAccounts.get(0).setBalance(-250);
		bankAccounts.get(1).setBalance(50.00);
		bankAccounts.get(2).setBalance(100.00);
		bankAccounts.get(3).setBalance(50.00);
		
//		printArray(bankAccounts);
		bankAccounts.get(0).withdraw(200.00);
		bankAccounts.get(1).deposit(300.00);
		bankAccounts.get(2).deposit(50.00);
		bankAccounts.get(3).withdraw(100.00);
		update(bankAccounts);
		printArray(bankAccounts);
	
		

	}
	public static void update(ArrayList <Account> b)
	{
		for(Account acc:b)
		{
			if(acc instanceof SavingsAccount)
			{
				((SavingsAccount) acc).Interest();
			}
			else if(acc.getClass()==CheckingAccount.class)
			{
				if(((CheckingAccount) acc).checkingOverdraft()==false)
				{
					System.out.println("You're already overdraft");
				}
			}
			
		}
		
	}
	public static void printArray(ArrayList<Account> a)
	{
		for(Account acz:a)
		{
			System.out.println(acz);
		}
	}
	
	
}
