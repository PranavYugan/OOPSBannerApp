/**
* OOPSBannerApp- Use Map for Character Patterns and Render via Function
*
* This use case extends UC7 by utilizig advanced Object-Oriented Programming concepts
* such as the Collection Framework to manage character patter in a more flexible
* and efficient manner. The application retrieves and displays the "OOPS" banner
* using a HashMap there by enhancing code organization and modularity
*
* @author Developer
* @version 8.0 
*/

// Extend the user story 7 to utilize advanced Object-Oriented Programming concepts
// such as Collections Framework to manage character patterns in a more flexible
// and efficient manner. The application retrieves and displays the "OOPS" banner
// using these mappings.

import java.util.*;

class OOPSBannerApp{
	/**
	 * Creates a HashMap containing ASCII art patterns for supported characters.
	 * 
	 * <p>Each character is mapped to an array of strings where each string represents
	 * one line of the character's ASCII art pattern. All patterns are assumed to have 
	 * the same height
	 * 
	 * @return a HashMap where keys are characters (char) and values are String arrays
	 * 		   representing the ASCII art pattern lines for each character
	 */
	public static HashMap<Character,String[]> createmap(){
		String[] first_letter={
				"   ***    ",
				" **   **  ",
				"**     ** ",
				"**     ** ",
				"**     ** ",
				" **   **  ",
				"   ***    "
		};
		String[] second_letter={
				"******** ",
				"**    ** ",
				"**    ** ",
				"******** ",
				"**       ",
				"**       ",
				"**       "
		};
		String[] last_letter={
				"******** ",
				"*        ",
				"*        ",
				"******** ",
				"       * ",
				"       * ",
				"******** "
		};

		HashMap<Character,String[]> charmap=new HashMap<>();

		charmap.put('O',first_letter);
		charmap.put('P',second_letter);
		charmap.put('S',last_letter);

		return charmap;
	}

	/**
	 * Displays a banner message using the provided character map.
	 * 
	 * <p>This method renders the input message as a large ASCII art banner by iterating
	 * through each line of the character patterns and horizontally concatenating the
	 * corresponding line from each character message
	 * 
	 * @param message the String message to display as a banner. Each character must
	 * 					exist as a key in the charMap
	 * @param charMap charMap a HashMap containing character patterns, where each character
	 * 					maps to a String array of pattern lines
	 */

	// Static method to display the banner message using the character map

	public static void display(String message,HashMap<Character,String[]> mapp){
		for(int i=0;i<7;i++){
			StringBuilder str=new StringBuilder();
			for(int j=0;j<message.length();j++){
				String[] temp= mapp.get(message.charAt(j));
				str.append(temp[i]);
			}
			System.out.println(str);
		}
	}

	/**
	 * Main method - Entry point for the banner display application
	 * 
	 * Intiliazes the character pattern maps and displays "OOPS" as an ASCII art banner
	 * to the console
	 * 
	 * @param args command line arguments (not used)
	 */

    public static void main(String args[]){

		HashMap<Character,String[]> mapp=  createmap();
		String message="OOPS";
		display(message,mapp);
		
    }
}
