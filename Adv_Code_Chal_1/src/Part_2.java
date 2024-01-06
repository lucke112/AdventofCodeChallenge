import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Part_2 {
	
	public static void main(String[] args) {
		int totalvalue = 0;
		String word = "";
		String addcharbycharword = "";
		String firstnumber = "";
		String secoundnumber = "";
		boolean wordhasbeenfound = false;
		boolean charisdigit = false;
		try {
		      File myObj = new File("C:\\Users\\Lucas\\OneDrive\\Personliga Kodnings Projekt\\AdventofCodeChallenge\\Adv_Code_Chal_1\\src\\Day_1.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
			          
		        //Lägger till char by char i addcharbycharword och checkar varje gång om en siffra skriven med ord finns med
		        for(int i = 0; i < data.length(); i++) {
		        	if(wordhasbeenfound == false) {
			        	addcharbycharword = addcharbycharword + data.charAt(i);
		        	}
		        	
		        	if(Character.isDigit(data.charAt(i)) && wordhasbeenfound == false) {
		        		if(!charisdigit) {
			        		charisdigit = true;
			        		firstnumber = String.valueOf(data.charAt(i));	
		        		}
		        	}
		        	//Lägg också till om någon av dessa funktioner stämmer så är svaret den siffran som den funktionen som triggas
		        	if(addcharbycharword.contains("one") && charisdigit == false) {
		        		wordhasbeenfound = true;
		        		firstnumber = "1";
		        	} else if(addcharbycharword.contains("two") && charisdigit == false) {
		        		wordhasbeenfound = true;
		        		firstnumber = "2";
		        	} else if(addcharbycharword.contains("three") && charisdigit == false) {
		        		wordhasbeenfound = true;
		        		firstnumber = "3";
		        	} else if(addcharbycharword.contains("four") && charisdigit == false) {
		        		wordhasbeenfound = true;
		        		firstnumber = "4";
		        	} else if(addcharbycharword.contains("five") && charisdigit == false) {
		        		wordhasbeenfound = true;
		        		firstnumber = "5";
		        	} else if(addcharbycharword.contains("six") && charisdigit == false) {
		        		wordhasbeenfound = true;
		        		firstnumber = "6";
		        	} else if(addcharbycharword.contains("seven") && charisdigit == false) {
		        		wordhasbeenfound = true;
		        		firstnumber = "7";
		        	} else if(addcharbycharword.contains("eight") && charisdigit == false) {
		        		wordhasbeenfound = true;
		        		firstnumber = "8";
		        	} else if(addcharbycharword.contains("nine") && charisdigit == false) {
		        		wordhasbeenfound = true;
		        		firstnumber = "9";
		        	}
		        }
		        
		        wordhasbeenfound = false;
		        charisdigit = false;
		        for(int i = data.length() - 1; i >= 0; i--) {
		        	if(wordhasbeenfound == false) {
			        	word = String.valueOf(data.charAt(i)) + word;
		        	}
		        		if(word.contains("one") && charisdigit == false) {
			        		wordhasbeenfound = true;
			        		secoundnumber = "1";
			        	} else if(word.contains("two") && charisdigit == false) {
			        		wordhasbeenfound = true;
			        		secoundnumber = "2";
			        	} else if(word.contains("three") && charisdigit == false) {
			        		wordhasbeenfound = true;
			        		secoundnumber = "3";
			        	} else if(word.contains("four") && charisdigit == false) {
			        		wordhasbeenfound = true;
			        		secoundnumber = "4";
			        	} else if(word.contains("five") && charisdigit == false) {
			        		wordhasbeenfound = true;
			        		secoundnumber = "5";
			        	} else if(word.contains("six") && charisdigit == false) {
			        		wordhasbeenfound = true;
			        		secoundnumber = "6";
			        	} else if(word.contains("seven") && charisdigit == false) {
			        		wordhasbeenfound = true;
			        		secoundnumber = "7";
			        	} else if(word.contains("eight") && charisdigit == false) {
			        		wordhasbeenfound = true;
			        		secoundnumber = "8";
			        	} else if(word.contains("nine") && charisdigit == false) {
			        		wordhasbeenfound = true;
			        		secoundnumber = "9";
			        	}
		        		
			        	if(Character.isDigit(data.charAt(i)) && wordhasbeenfound == false) {
			        		if(!charisdigit) {
			        			charisdigit = true;
			        			wordhasbeenfound = true;
			        			secoundnumber = String.valueOf(data.charAt(i));
			        	}
		        	}
		        }
		        
		        //Lägger till värdet tillsammans i totalavärdet  
		        String combinednumbers = firstnumber + secoundnumber;
		        totalvalue = totalvalue + Integer.parseInt(combinednumbers);
		        
				word = "";
				addcharbycharword = "";
				firstnumber = "";
				secoundnumber = "";
				wordhasbeenfound = false;
				charisdigit = false;
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		System.out.println(totalvalue);
	}
}
