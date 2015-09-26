

public class CalculateArea 
{

	public static void main(String[] args) 
	{
		double circleAreaInMainMethod = CalculateCircleArea(10);
		double secondCircleArea = CalculateCircleArea(5);
		System.out.println("Area of the circle is " + circleAreaInMainMethod);
		System.out.println("Area of the second circle is " + secondCircleArea);
		
	}
	
	public static double CalculateCircleArea(int radius)
	{
		
		//This method calculates the area of a circle
		//Input: integer radius value
		//Output: double area
		
		double area = 3.14 * radius * radius;
		return area;
		
	}
}