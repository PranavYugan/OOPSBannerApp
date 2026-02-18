/**
* OOPSBannerApp UC4 - Render OOPS as Banner using String Array and loop
*
* This use case improves upon UC3 by using a String array to store banner lines
* and interating through them with a for-each loop, eliminating hardcoded print
* statements and improving modularity and reusability.
*
* @author Developer
* @version 4.0 
*/

// Extend the user story 3 to further develop the OOPS Banner Application
// by using String arrays to hold banner lines and printing them in a loop
// This use case improves upon UC3 by using a String array to store banner lines
// and iterating through them with a for-each loop, elimintating hardcoded print
// statements and improving modularity and reusability.


import java.util.*;

class UC4_OOPSBannerApp{
	// Main method to run the banner display
    public static void main(String args[]){
		String row[]=new String[7];
		row[0]=String.join("","   ***    " + "   ***    " + "******** " + "******** ");
		row[1]=String.join(""," **   **  " + " **   **  " + "**    ** " + "*        ");
		row[2]=String.join("","**     ** " + "**     ** " + "**    ** " + "*        ");
		row[3]=String.join("","**     ** " + "**     ** " + "******** " + "******** ");
		row[4]=String.join("","**     ** " + "**     ** " + "**       " + "       * ");
		row[5]=String.join(""," **   **  " + " **   **  " + "**       " + "       * ");
		row[6]=String.join("","   ***    " + "   ***    " + "**       " + "******** ");
		for(String i:row){
			System.out.println(i);
		}
		
    }
}
