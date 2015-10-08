
public class Main {

	public static void main(String[] args) 
	{
		
		Person Kira = new Person("Corey Lindsey", 22, "4782571521", "730 Peachtree Street Atlanta, Ga 30308");
		System.out.println("Kira's name is " + Kira.GetName());
		System.out.println("Kira's age is " + Kira.GetAge());
		System.out.println("Kira's number is " + Kira.GetPhoneNumber());
		System.out.println("Kira's address is " + Kira.GetAddress());
		System.out.println("It is June 18, 2015 today...");
		Kira.GrowsOlder();
		System.out.println("Kira's age is now " + Kira.GetAge());

	}

}
