

public class CalculateArea 
{

	public static void main(String[] args) 
	{
		double circleAreaInMainMethod = CalculateCircleArea(10);
		double secondCircleArea = CalculateCircleArea(5);
		System.out.println("Area of the circle is " + circleAreaInMainMethod);
		System.out.println("Area of the second circle is " + secondCircleArea);
		System.out.println();
		double rectangleArea = CalculateRectangleArea(4, 5);
		System.out.println("The area of the rectangle is " + rectangleArea);
	}
	
	private static double CalculateRectangleArea(int breadth, int length) {
		
		double area = length * breadth;
		return area;
		
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