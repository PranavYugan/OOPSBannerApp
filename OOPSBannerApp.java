/**
* OOPSBannerApp UC7 - Store Character Pattern in a class
*
* This use case extends upon UC6 by implementing a CharacterPatternMap class to encapsulate
* character-to-pattern mappings. The application retrieves and displays the "OOPS"
* banner using these mappings. This approach enhances code organization and modularity.
*
* @author Developer
* @version 7.0 
*/

// Extend the user story 6 to display the CharacterPatternMap class to encapsulate
// character-to-pattern mappings. The application retrieves and displays the "OOPS"
// banner using these mappings. Thereby addressing the drawback of not having
// centralized character pattern management system

import java.util.*;

class OOPSBannerApp{

	/**
	 * CharacterPatternMap - Inner class for storing character-to-pattern mappings
	 * 
	 * Encapsultes a single character and its corresponding ASCII art pattern.
	 * Provides immutable access to character and pattern data through getters.
	 */

	static class CharacterPatternMap{
		/** The character being represented */
		Character ch;
		/** The ASCII art pattern lines for the character */
		String[] pattern;

		/**
		 * Constructs a CharacterPatternMap with a character and its pattern
		 * 
		 * @param ch the character to be mapped
		 * @param pattern the ASCII art pattern representation as array of strings
		 */

		CharacterPatternMap(Character ch,String[] pattern){
			this.ch=ch;
			this.pattern=pattern;
		}
		/**
		 * Retrieves the mapped character
		 * 
		 * @return the character associated with the pattern map
		 */
		public Character getcharacter(){
			return this.ch;
		}
		/**
		 * Retrieves te ASCII art pattern
		 * 
		 * @return the pattern array representing the character
		 */
		public String[] getpattern(){
			return this.pattern;
		}
		
	}
	/**
	 * Static Method to Create and initialize CharacterPatternMap array for predefined characters
	 * 
	 * Populates pattern maps for the letter 'O', 'P', 'S' and space character
	 * Each character has a 7-line ASCII art representation.
	 * 
	 * @return array of CharacterPatternMap objects containing character patterns
	 */

	public static CharacterPatternMap[] createCharacterpatternMap(){
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
		String[] space={
				"         ",
				"         ",
				"         ",
				"         ",
				"         ",
				"         ",
				"         "
		};

		CharacterPatternMap a=new CharacterPatternMap('O',first_letter);
		CharacterPatternMap b=new CharacterPatternMap('P',second_letter);
		CharacterPatternMap c=new CharacterPatternMap('S',last_letter);
		CharacterPatternMap d=new CharacterPatternMap(' ',space);

		CharacterPatternMap[] charmap={a,b,c,d};

		return charmap;
	}

	/**
	 * Retrieves the ASCII pattern for a given character
	 * 
	 * Searches through the character pattern maps to find a matching character
	 * If the character is not found, recursively returns the pattern for the space character
	 * 
	 * @param ch the character to look up
	 * @param charmap the array of CharacterPatternMap to find a matching character
	 * @return the pattern array for the given character, or space pattern if not found
	 */

	public static String[] getcharpattern(Character ch,CharacterPatternMap[] charmap){
		for(CharacterPatternMap search:charmap){
			if(search.getcharacter()==ch){
				return search.getpattern();
			}
		}
		if(ch!=' '){
			return getcharpattern(' ',charmap);
		}
		return null;
	}

	/**
	 * Prints a message as a banner using ASCII art patterns
	 * 
	 * Renders the entire message horizontally by combining individual character
	 * patterns line by line. Characters are seperated by spacing for readability.
	 * 
	 * @param message the message string to be displayed by banner
	 * @param charmap the array of CharacterPatternMap objects containing available patterns
	 */

	public static void printMessage(String message,CharacterPatternMap[] charmap){
		String[][] ans=new String[message.length()][7];
		for(int i=0;i<message.length();i++){
			String[] pattern=getcharpattern(message.charAt(i),charmap);
			for(int j=0;j<pattern.length;j++){
				ans[i][j]=pattern[j];
			}
		}
		for (int i=0;i<7;i++){
			for(int j=0;j<message.length();j++){
				System.out.print(ans[j][i]);
			}
			System.out.println();
		}
	}

	/**
	 * Main method - Entry point for the banner display application
	 * 
	 * Intiliazes the character pattern maps and displays "OOPS" as an ASCII art banner
	 * 
	 * @param args command line arguments (not used)
	 */

    public static void main(String args[]){

		CharacterPatternMap[] mapp = createCharacterpatternMap();
		String message="OOPS";
		printMessage(message,mapp);


        

		
		
    }
}
