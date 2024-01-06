import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Part_2 {
	
	public static void main(String[] args) {
		/* 
		 *  
		 * Determend the minimum ammounth of cubes of each color that would be needed for every game
		 * Take the minimum numbers of all the games and multiply them with each other
		 * Add all the multiplied numbers for each game togheter to get the sum
		 * 
		 */
		String colorword = "";
		int sum = 0;
		int numberofredcubes = 0;
		int numberofbluecubes = 0;
		int numberofgreencubes = 0;
		int highred = 0;
		int highblue = 0;
		int highgreen = 0;
		boolean statsbegin = false;
		
		try {
			File myObj = new File("C:\\Users\\Lucas\\OneDrive\\Personliga Kodnings Projekt\\AdventofCodeChallenge\\Adv_Code_Chal_2\\src\\Day_2.txt");
		    Scanner myReader = new Scanner(myObj);
		    while(myReader.hasNextLine()) {
		    	String data = myReader.nextLine();
		    	String strnumber = "";
		    	
		    	for(int i = 0; i < data.length(); i++) {
		    		if(data.charAt(i) == ':' || statsbegin == true) {
		    			statsbegin = true;
		    			if(data.charAt(i) == ';') {
		    				strnumber = "";
		    				if(numberofredcubes > highred) {
		    					highred = numberofredcubes;
		    				}
		    				if(numberofbluecubes > highblue) {
		    					highblue = numberofbluecubes;
		    				}
		    				if(numberofgreencubes > highgreen) {
		    					highgreen = numberofgreencubes;
		    				}
		    				numberofredcubes = 0;
		    				numberofbluecubes = 0;
		    				numberofgreencubes = 0;
		    				colorword = "";
		    			}
		    			
		    			if(data.charAt(i) == ',') {
		    				strnumber = "";
		    				colorword = "";
		    			}
		    			
		    			//Identifierar nummer
		    			if(Character.isDigit(data.charAt(i))) {
			    			strnumber = strnumber + data.charAt(i);
		    			}
		    			
		    			//Identifierar färgen
		    			if(Character.isLetter(data.charAt(i))) {
		    				colorword = colorword + data.charAt(i);
		    			}
		    			
		    			//Kollar vilken färg det är
		    			if(colorword.equals("red")) {
		    				int number = Integer.parseInt(strnumber);
		    				numberofredcubes = numberofredcubes + number;
		    			} else if(colorword.equals("blue")) {
		    				int number = Integer.parseInt(strnumber);
		    				numberofbluecubes = numberofbluecubes + number;
		    			} else if(colorword.equals("green")) {
		    				int number = Integer.parseInt(strnumber);
		    				numberofgreencubes = numberofgreencubes + number;
		    			}
		    		}
		    	}
		    	if(numberofredcubes > highred) {
					highred = numberofredcubes;
				}
				if(numberofbluecubes > highblue) {
					highblue = numberofbluecubes;
				}
				if(numberofgreencubes > highgreen) {
					highgreen = numberofgreencubes;
				}
			    
		    	sum = sum + (highred * highblue * highgreen);
		    	
				strnumber = "";
				colorword = "";
				numberofredcubes = 0;
				numberofbluecubes = 0;
				numberofgreencubes = 0;
				highred = 0;
				highblue = 0;
				highgreen = 0;
			    statsbegin = false;
		    }
		    System.out.println(sum);
		    myReader.close();
		} catch(FileNotFoundException e) {
			
		}

	}
}
