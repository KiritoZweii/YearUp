
public class Scientist implements ITaxPayer
{
	private double m_income = -1;
	private boolean m_donePayingTaxes = false;
	
	Scientist(double income)
	{
		SetIncome(income);
		
	}
	
	public double GetIncome()
	{
		return m_income;
		
	}
	
	private void SetIncome(double income)
	{
		m_income = income;
		
	}
	
	


	public void PayTaxes(double taxRate) 
	{
		if(m_donePayingTaxes == false){
			double taxAmount = GetIncome() * taxRate;
			double discountedTaxAmount = taxAmount * .1;
			System.out.println("Scientist is paying the following as tax: " + discountedTaxAmount);
			SetIncome(GetIncome() - discountedTaxAmount);
			System.out.println("My income after paying taxes is: " + GetIncome());
			m_donePayingTaxes = true;
		}
		
	}

	
	public void FileTaxReturn() 
	{
		if(m_donePayingTaxes)
		{
			System.out.println("Scientist is filing his tax return");
		}
		
	}

}
