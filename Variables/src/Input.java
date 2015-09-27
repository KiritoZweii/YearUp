import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		double gpa;
		
		
		
		
		System.out.print("Enter student's name : ");
		name = input.nextLine();
		System.out.print("Enter student's gpa : ");
		gpa = input.nextDouble();
		System.out.print("Enter student's age : ");
		age = input.nextInt();
		
		System.out.printf("%s is %d years old. %s has a %4.1f gpa.\n", 
				name, age, name, gpa);
	}

}
