import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Part_1 {
	
	public static void main(String[] args) {
			
			/*
			 * Determine which games would have been possible if the bag had been loaded with only
			 * 12 red cubes, 13 green cubes, and 14 blue cubes. 
			 * What is the sum of the IDs of those games?
			 * 
			 * Example: "Game 23". 23 is the ID
			 */
			
			String colorword = "";
			int Id = 0;
			int sumofId = 0;
			int numberofredcubes = 0;
			int numberofbluecubes = 0;
			int numberofgreencubes = 0;
	    	int tempsumofId = 0;
			boolean roundplayable = true;
			boolean statsbegin = false;
			boolean gameplayable = true;
			
			try {
				File myObj = new File("C:\\Users\\Lucas\\OneDrive\\Personliga Kodnings Projekt\\AdventofCodeChallenge\\Adv_Code_Chal_2\\src\\Day_2.txt");
			    Scanner myReader = new Scanner(myObj);
			    while(myReader.hasNextLine()) {
			    	String data = myReader.nextLine();
			    	Id++;
			    	String strnumber = "";
			    	
			    	for(int i = 0; i < data.length(); i++) {
			    		if(data.charAt(i) == ':' || statsbegin == true) {
			    			statsbegin = true;
			    			if(data.charAt(i) == ';') {
			    				strnumber = "";
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
			    		
			    		//Kollar om cuberna är fler än vad som finns
			    		if(numberofredcubes > 12) {
			    			roundplayable = false;
			    		}
			    		
			    		if(numberofbluecubes > 14) {
			    			roundplayable = false;
			    		}
			    		if(numberofgreencubes > 13) {
			    			roundplayable = false;
			    		}
			    		
			    	}
	
				    if(roundplayable) {
				    	tempsumofId = tempsumofId + Id;
				    } else {
				    	gameplayable = false;
				    }
				    
				    if(('e' == data.charAt(data.length() - 1) || 'n' == data.charAt(data.length() - 1) || 'd' == data.charAt(data.length() - 1)) && gameplayable) {
				    	sumofId = sumofId + tempsumofId;
				    }
					strnumber = "";
					colorword = "";
					numberofredcubes = 0;
					numberofbluecubes = 0;
					numberofgreencubes = 0;
					tempsumofId = 0;
				    statsbegin = false;
				    gameplayable = true;
				    roundplayable = true;
			    }
			    System.out.println(sumofId);
			    myReader.close();
			} catch(FileNotFoundException e) {
				
			}
	}
}
