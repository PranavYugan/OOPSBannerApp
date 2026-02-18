/**
* OOPSBannerApp UC6 - OOPS Banner Application
*
* This use case extends  UC5 by implementing a modular approach to generate each
* letter's pattern through dedicated methods. This enhances code reusability and
* maintainability by seperating pattern generation logic from the main display logic.
*
* @author Developer
* @version 6.0 
*/

// Extend the user story 5 to display the OOPS banner using modular approach



import java.util.*;

class OOPSBannerApp{
	//Method to generate the pattern for the letter 'O'
	public static String[] forO(){
			String[] first_letter={
				"   ***    ",
				" **   **  ",
				"**     ** ",
				"**     ** ",
				"**     ** ",
				" **   **  ",
				"   ***    "
			};
			return first_letter;
			
	}
	//Method to generate the pattern for the letter 'P'
	public static String[] forP(){
			String[] second_letter={
				"******** ",
				"**    ** ",
				"**    ** ",
				"******** ",
				"**       ",
				"**       ",
				"**       "
			};
			return second_letter;
			
	}
	//Method to generate the pattern for the letter 'S'
	public static String[] forS(){
			String[] last_letter={
				"******** ",
				"*        ",
				"*        ",
				"******** ",
				"       * ",
				"       * ",
				"******** "
			};
			return last_letter;
			
	}

	
	//Main method to run the banner display
    public static void main(String args[]){
        //Declare String Arrays to hold patterns for each letter
		String[] one= forO();
		String[] two=forP();
		String[] three=forS();

		//Use the loop to Assemble each line of the banner to create the
        //visual effect for the message "OOPS"
		for(int i=0;i<7;i++){
			System.out.println(String.join("",one[i],one[i],two[i],three[i]));
		}

        

		
		
    }
}
