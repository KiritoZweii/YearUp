
public class ExceptionExample {

	public static void main(String[] args) {
		try
		{
		//int[] numbers = {1,3,5,7};
		int[] numbers = null;
		AddArray(numbers);
		}
		catch (Exception ex)
		{
			System.out.println("I tried to access a location in an array that did not exist.");
			ex.printStackTrace();
		}
	}
	
	private static void AddArray(int[] numbers)
	{
		int sum = 0;
		
		if(numbers == null)
		{
		System.out.println("The input to add array was a null array.");
		throw new NullPointerException();
		}
		
		for(int i = 0; i <= numbers.length; i++)
		{
			sum = sum + numbers[i];
			
		}
		
		System.out.println("Sum is: " + sum);

	}

}
