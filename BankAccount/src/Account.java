
public class Account 
{
	public int m_accountId = -1;
	public String m_accountName;
	public int m_customerId = -1;
	private double m_amount = 0.0;

	public double GetAmount()
	{
		return m_amount;
	}

	private void SetAmount(double amountToSet)
	{
		m_amount = amountToSet;
	}

	public Account(int accountId, String accountName, int customerId)
	{
		m_accountId = accountId;
		m_accountName = accountName;
		m_customerId = customerId;
	}

	private void UpdateAmount(double newAmount)
	{
		SetAmount(newAmount);
	}

	public void UpdateAmountSecurely(double newAmount, String password)
	{
		if (password != null) //always do a null check
		{
			if (password.equals("admin"))
			{
				UpdateAmount(newAmount);
				System.out.println("Updated amount in account id " + m_accountId + " to " + m_amount);
			}
			else
			{
				System.out.println("Call the police! Unsecure access!!");
			}
		}
		else
		{
			System.out.println("Password is null, cannot update account.");
		}
	}
}
