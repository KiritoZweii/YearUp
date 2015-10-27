
public class LoopsLab2 {

	public static void main(String[] args) 
	{
		int[] array1 = new int[] {8, 7, 34, 55, 3, 9};
		int[] array2 = new int[] {9, 34, 39, 54, 3, 9};
		int[] array3 = new int[] {9, 34, 39, 54, 3, 9};
		System.out.println("Searching in array 1....");
		FindANumberinArray(array1, 34);
		System.out.println("Searching in array 2....");
		FindANumberinArray(array2, 3);
		System.out.println("Finding all occurences in array 2....");
		FindOccurencesinArray(array2, 9);
		System.out.println("Finding all occurences in array 3....");
		FindOccurencesinArray(array3, 9);
		
		
		
		

	}
	
	public static void FindANumberinArray(int[] numbers, int searchNumber)
	{
		if (numbers != null)
		{
			int foundAtLocation = -1;
			
			for (int i = 0; i < numbers.length; i++)
			{
				if (numbers[i] == searchNumber)
				{
					foundAtLocation = i;
					break;
				}
			}
			
			if (foundAtLocation >= 0)
			{
				System.out.println("The number was found at location " + foundAtLocation);
			}
			else
			{
				System.out.println("The number was not found in the array");
			}
		}
	}
	public static void FindOccurencesinArray(int[] numbers, int searchNumber)
	{
		if (numbers != null)
		{
			int countOfOccurences = 0;
			
			for (int i = 0; i < numbers.length; i++)
			{
				if (numbers[i] == searchNumber)
				{
					countOfOccurences++;
				}
			}
			
			System.out.println(searchNumber + " was found " + countOfOccurences + " times in the array.");
		}
	}

}
