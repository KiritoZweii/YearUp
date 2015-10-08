
public class Person 
{

	private String m_name = null;
	private int m_age = -1;
	private String m_phoneNumber = null;
	private String m_address = null;
	
	Person(String name, int age, String phoneNumber, String address)
	{
		SetName(name);
		SetAge(age);
		SetPhoneNumber(phoneNumber);
		SetAddress(address);
		
	}
	
	String GetName()
	{
		return m_name;
	}
	
	int GetAge()
	{
		return m_age;
	}
	
	String GetPhoneNumber()
	{
		return m_phoneNumber;
	}
	
	String GetAddress()
	{
		return m_address;
	}
	
	private void SetName(String name)
	{
		m_name = name;
	}
	
	private void SetAge(int age)
	{
		m_age = age;
	}
	
	private void SetPhoneNumber(String phoneNumber)
	{
		m_phoneNumber = phoneNumber;
	}
	
	private void SetAddress(String address)
	{
		m_address = address;
		
	}
	

	void GrowsOlder()
	{
		int currentAge = GetAge();
		SetAge(currentAge + 1);
		// m_age++; is another way of doing the same thing.
	}
	
	
}
