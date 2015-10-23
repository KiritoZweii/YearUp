
public class LargestNumber 
{

	public static void main(String[] args) 
	{
		int[] numbersArray = new int[] {-1, 65, 32, 54, 24, 87, 92};
		FindLargestNumberUsingWhileLoop(numbersArray);
		LargestNumberUsingForLoop(numbersArray);
		

	}
	
	public static void FindLargestNumberUsingWhileLoop(int[] numbers)
	{
		if (numbers != null)
		{
			if (numbers.length > 0)
			{
				//initialize index
				int i = 1;
				int largestNumber = numbers[0];
				
				// check condition
				while (i < numbers.length)
				{
					if (largestNumber < numbers[i])
					{
						largestNumber = numbers[i];
					}
					//increment index
					i++;
				}
				
				System.out.println("Largest number using while loop is " + largestNumber);
			}
		}
	}
	
	public static void LargestNumberUsingForLoop(int[] numbers) 
	{
		if (numbers != null)
		{
			if (numbers.length > 0)
			{				
				int largestNumber = numbers[0];
				
				//initialize index , check condition, increment index
				for (int i = 1; i < numbers.length; i++)
				{
					if (largestNumber < numbers[i])
					{
						largestNumber = numbers[i];
					}
					
				}
				
				System.out.println("Largest number using for loop is " + largestNumber);
			}
		}
	}

}
