public class ExceptionExample {

	public static void main(String[] args) {
		
		
		try{
			
		total();
		
		/*try
		{
		//int[] numbers = {1,3,5,7};
		int[] numbers = null;
		AddArray(numbers);
		}
		catch (NullPointerException ex)
		{
			System.out.println("I tried to access a location in an array that did not exist.");
			ex.printStackTrace();
		}*/
		}
		catch(ArithmeticException ae){
			System.out.println("dude really?");
			
			ae.printStackTrace();
		}
			
		//}
		//finally{ 
			
		//}
	
	}
	
/*	private static void AddArray(int[] numbers)
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

	}*/
	
	static void total()
	{
		int x = 3;
		int y = 0;
		int total = x/y;
		System.out.println(total);
		if(total == 0){
		System.out.println("dude really?");
		throw new ArithmeticException();
		}
	}

}
