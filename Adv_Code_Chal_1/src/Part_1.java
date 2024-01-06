import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Part_1 {
	
	public static void main(String[] args) {
		int totalvalue = 0;
		ArrayList<String> numbers = new ArrayList<String>();
		try {
		      File myObj = new File("C:\\Users\\Lucas\\OneDrive\\Personliga Kodnings Projekt\\AdventofCodeChallenge\\Adv_Code_Chal_1\\src\\Day_1.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        for(int i = 0; i < data.length(); i++) {
			        if(Character.isDigit(data.charAt(i))) {
			        	numbers.add(String.valueOf(data.charAt(i)));
			        }
		        }
		        if(numbers.size() == 1) {
		        	String value = numbers.get(0) + numbers.get(0);
		        	int v1 = Integer.parseInt(value);
		        	totalvalue = totalvalue + v1;
		        	numbers.clear();
		        } else if(numbers.size() > 1) {
		        	String value = numbers.get(0) + numbers.get(numbers.size() - 1);
		        	int v1 = Integer.parseInt(value);
		        	totalvalue = totalvalue + v1;
		        	numbers.clear();
		        }
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		System.out.println(totalvalue);
	}
}
