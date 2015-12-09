import java.util.ArrayList;
import java.util.Scanner;
public class LCRoster {

	static ArrayList<LCRoster> student = new ArrayList<LCRoster>();
	static Scanner s = new Scanner(System.in);
	static Scanner s1 = new Scanner(System.in);
	private static String[] m_studentList;
	private static String m_studentName = null;
	private static String m_lcName = null;
	private int m_lcID;

	public static void main(String[] args) 
	{
		initializeStudentArray();
		StudentRoster();
	}

	private static void StudentRoster() 
	{
		for (int i = 0; i < student.size(); i++) {
			LCRoster current = student.get(i);
			System.out.println("This students name is " + current.getM_studentName()
			+ ". They are student number " + (i + 1)
			+ " and their ID is " + current.getM_lcID()
			+ " and their LC Name is " + current.getM_lcName() + ".");
		}
		System.out.println("\n");

	}

	private static void initializeStudentArray() 
	{
		String resp = null;

		System.out.println("Would you like you like to enter a name y/n?: ");
		resp = s.nextLine();

		while (!resp.equalsIgnoreCase("N")) 
		{

			if (m_studentList == null) 
			{
				System.out.println(
						"Welcome to the Roster Program. Please input the name of a student: ");
				String Name = s.nextLine();

				System.out.println("Enter the ID of the Student: ");
				int id = s.nextInt();
				System.out.println("Enter the student's LC name: ");
				String LC = s1.nextLine();
				
				s.nextLine();
				
				LCRoster students = new LCRoster(Name, id, LC);
				student.add(students);
				System.out.println("Add another student Y/N:");
				resp = s.next();
				s.nextLine();
				} 
			    else if (m_studentList != null) 
				{
				System.out.println("The Roster has some names would you like to continue to add names y/n:");
				resp = s.nextLine();
				s.nextLine();
				
				if (!resp.equalsIgnoreCase("N")) 
				{

				}

			}
			System.out.println("\nThank You");
		}
	}
	public LCRoster(String name, int id, String LC) 
	{
		m_studentName = name;
		m_lcID = id;
		m_lcName = LC;
	}
	
	public LCRoster(String name, String LC) 
	{
		m_studentName = name;
		m_lcName = LC;
	}
	
	public LCRoster(int id) 
	{
		m_lcID = id;
	}
	
	
	
	public String[] getM_students() 
	{
		return m_studentList;
	}
	
	public String getM_studentName() 
	{
		return m_studentName;
	}
	
	public int getM_lcID() 
	{
		return m_lcID;
	}
	
	public void setM_students(String[] students) 
	{
		LCRoster.m_studentList = students;
	}
	

	public String getM_lcName()
	{
		return m_lcName;
	}

	private void setM_lcName(String LC) 
	{
		m_lcName = LC;
	}
}
