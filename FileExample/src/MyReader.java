
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class MyReader {

	public static void main(String[] args) throws Exception {
		System.out.println("I want cookies.");

		try {
			FileReader fileReader = new FileReader ("C://Users/Koyuki/Desktop/OOP_week15.txt");
			//you need 2 slashes for the program to know that it is to 
			String fileContents ="";
			int i;
			while((i = fileReader.read()) != -1) {
				//-1 is not the array and will stop the loop
				char ch = (char)i;

				fileContents = fileContents + ch;
			}

			fileReader.close();
			System.out.println(fileContents);
			String tmpStr = replaceMyString(fileContents);
			writeItBack(tmpStr);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	private static void writeItBack(String tmpStr) throws IOException {
		FileWriter fileWriter = new FileWriter ("C://Users/Koyuki/Desktop/OOP_week15.txt");
		fileWriter.write(tmpStr);
		fileWriter.close();
	}

	private static String replaceMyString(String fileContents) {
		String tmp = fileContents.replace("dolor","hedon");
		System.out.println(tmp);
		return tmp;
	}

}



