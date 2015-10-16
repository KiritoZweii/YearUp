import java.util.Scanner;

public class ChineseYear 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		int inputYear = sc.nextInt();
		EvaluateChineseYear(inputYear);
		sc.close();
		

	}

	private static void EvaluateChineseYear(int inputYear) 
	{
		int yearDifference = inputYear - 1900;
		int remainder = yearDifference % 12;
		
		switch(remainder)
		{
		case 0:
			System.out.println(inputYear + " is the year of the rat");
			break;
		case 1:
			System.out.println(inputYear + " is the year of the ox");
			break;
		case 2:
			System.out.println(inputYear + " is the year of the tigar");
			break;
		case 3:
			System.out.println(inputYear + " is the year of the rabbit");
			break;
		case 4:
			System.out.println(inputYear + " is the year of the dragon");
			break;
		case 5:
			System.out.println(inputYear + " is the year of the snake");
			break;
		case 6:
			System.out.println(inputYear + " is the year of the horse");
			break;
		case 7:
			System.out.println(inputYear + " is the year of the sheep");
			break;
		case 8:
			System.out.println(inputYear + " is the year of the monkey");
			break;
		case 9:
			System.out.println(inputYear + " is the year of the rooster");
			break;
		case 10:
			System.out.println(inputYear + " is the year of the dog");
			break;
		case 11:
			System.out.println(inputYear + " is the year of the pig");
			break;	
		default:
			System.out.println("I cannot figure out Chinese year for" + inputYear);
			
		}
		
	}

}
