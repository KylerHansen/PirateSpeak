import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class PirateDictionary {
	//parallel arrays
	private ArrayList<String> english = new ArrayList<>();
	private ArrayList<String> pirate = new ArrayList<>();
	private String fileName = "pirate.txt";

	public PirateDictionary() {
	File fileIn = new File(fileName);
	
	
	try {
		Scanner fileScan = new Scanner (fileIn)	;
		while(fileScan.hasNext()) {
			english.add(fileScan.nextLine());
			pirate.add(fileScan.nextLine());
	
		}
		
		
		
		
	
		
		
		
		fileScan.close();
	
	}//end try
	catch(Exception e) {
		System.out.println("Error Opening File: "+ e.getMessage());
		e.printStackTrace();
		
	}//ends catch
	
		
	}//ends constructor
	
	//takes a string return the pirate version. 
	public String toPirate(String word) {
		for(int i = 0; i< english.size(); i++) {
			if(english.get(i).equalsIgnoreCase(word)) {
				return pirate.get(i);
			}//ends if
		}//endfor
		return word;
	} //endtopirate
	
	public String toPirateSentence(String sentence) {
		Scanner scanSentence = new Scanner(sentence);
		String pirateSentence = "";
		while(scanSentence.hasNext()) {
			String word = scanSentence.next();
			pirateSentence += toPirate(word) + " ";
		}
		scanSentence.close();
		return pirateSentence;
	}

}
