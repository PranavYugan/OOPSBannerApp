/**
* OOPSBannerApp UC2 - OOPS Banner Display Application (Use Case 3)
*
* This class extends the functionality of the Use Case 2 by improving the way "OOPS" banner
* is constructed and displayed. It focuses on enhancing code readability and efficiency
* by utilizing the String.join() method to create each line of the banner. This approach
* overcomes the drawbacks of using the + operator for String concatanation, which can lead
* to code inefficiency due to creation of multiple intermediate String objects in memory.
*
* @author Developer
* @version 3.0 
*/

// Extend the use case of UC2 to use String.join() method to create each line of the "OOPS" banner
// instead of concatenating strings with the + operator. This is essentially to overcome the
// drawbacks of using the + operator for string concatanation which essentially creates
// mulitple intermediate String objects in memory leading to inefficiency.



class OOPSBannerApp{
    // Main method to run the banner display
    // Use System.out.println() to print each line of the OOPS banner to create 
    // the visual effect for the message "OOPS". Construct each line using
    // String.join() method for better readablity and efficiency
    // Each line corresponds to a row in the banner for the letter O, O, P, S.

    public static void main(String args[]){
        System.out.println(String.join("","   ***    " + "   ***    " + "******** " + "******** "));
        System.out.println(String.join(""," **   **  " + " **   **  " + "**    ** " + "*        "));
        System.out.println(String.join("","**     ** " + "**     ** " + "**    ** " + "*        "));
        System.out.println(String.join("","**     ** " + "**     ** " + "******** " + "******** "));
        System.out.println(String.join("","**     ** " + "**     ** " + "**       " + "       * "));
        System.out.println(String.join(""," **   **  " + " **   **  " + "**       " + "       * "));
        System.out.println(String.join("","   ***    " + "   ***    " + "**       " + "******** "));
    }
}
