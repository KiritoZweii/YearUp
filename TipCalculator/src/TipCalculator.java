import java.util.Scanner;
public class TipCalculator {
	
	static double chek;

	public static void main(String[] args) {
		System.out.println("What is your bill amount? ");
		Scanner Amount = new Scanner(System.in);
		chek = Amount.nextFloat();

		System.out.println("Your tip with 10 percent is: " + TipTen());
		System.out.println("Your tip with 15 percent is: " + TipFifteen());
		System.out.println("Your tip with 20 percent is: " + TipTwenty());
		System.out.println("Your tip with 25 percent is: " + TipTwentyFive());
		
		
		double tip10;
		tip10 = TipTen();
		double tip15;
		tip15 = TipFifteen();
		double tip20;
		tip20 = TipTwenty();
		double tip25;
		tip25 = TipTwentyFive();

	}
	
	public static double TipTen()
	{
		double TipTen = chek * 10 / 100;
		return TipTen;
	}
	
	public static double TipFifteen()
	{
		double TipFifthteen = chek * 15 / 100;
		return TipFifthteen;
	}
	
	public static double TipTwenty()
	{
		double TipTwenty = chek * 20 / 100;
		return TipTwenty;
	}
	
	public static double TipTwentyFive()
	{
		double TipTwentyFive = chek * 25 / 100;
		return TipTwentyFive;
	}
	

}
