import java.util.Scanner;

public class CoffeeApplication
{
	//Type "printTimeStamp()" to time stamp tastings/edits and reports
   //The hour is not printing correctly. Anyone see the mistake? I don't. Java book pg 52-53
public static void printTimeStamp () 
   {
      long totalMilliseconds = System.currentTimeMillis();
      long totalSeconds = totalMilliseconds / 1000;
      long currentSecond = totalSeconds % 60;
      long totalMinutes = totalSeconds / 60;
      long currentMinute = totalMinutes % 60;
      long totalHours = totalMinutes / 60;
      long currentHour = totalHours % 24; 
      System.out.println(currentHour + ":" + currentMinute + ":" + currentSecond); 
   }

	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		
/*Use if/else statement to prompt user to 
		1. Create a new tasting entry 
		2. Edit an existing tasting
		3. Generate a report from existing tastings.  
		4. Else - exit program	
	We may choose to turn these into methods.
*/
      System.out.print("Do you want to create a new tasting report? Enter Y or N: ");
      String start = input.next();
      if (start.equalsIgnoreCase("Y"))
      {
      // code for tasting report
      }
      else
      {
         System.out.print("Do you want to edit an old tasting report? Enter Y or N: ");
         start = input.next();
         if (start.equalsIgnoreCase("Y"))
            {
            // code to edit report
            }
            else
            {
               System.out.print("Do you want to generate a report? Enter Y or N: ");
               start = input.next();
               if (start.equalsIgnoreCase("Y"))
               {
                  // code for reports
               }
               else
               {
                  System.out.println("Good Bye.");
                  System.exit(1);
               }
             }
      }
      
// All sections below will need to be cut/paste into the if/else stmts above.

// Assignments are suggestive just to get started. 
      //Take away the ? mark to accept the task      
      //Delete your name if you don't want the task
      
// New Tasting
	/* MICHELLE? - Prompt/Enter Name
	
	               Prompt/Enter Date (unless this can be autogenerated; Date class (java.util.Date))
	
	               Prompt/Enter Coffee Shop location
         				1. Name
         				2. City
         				3. State
         				4. Country
	*/
	
	/*	ARE WE DOING THIS?   While loop - to allow multiple cups in one sitting?
                           - We can always add this in later.
			                  - Prompt for number of cups
			                  - Initialize count to 1, count to <=number of cups and increment by 1
		                  	- Are there unforeseen consequences to looping this?
	*/
	
	/* MICHELLE? - Prompt/Enter Bean type - String
                  Prompt for brewing method - or use if else to ask if drip/pour over/french press/cold brew/ iced
	
	               Prompt/Enter price (double) & currency 
	               Currency class - convert to U.S. dollar
	*/
	
	/*	ANDREA - If it is a hot coffee (see brewing method) run the following : 
      			If/Else to enter Fahrenheit or Celsius
      			Prompt temperature
      			Convert to Fahrenheit in necessary
      			Provide suggestion to rebrew if not ideal temperature
      			Else skip
	*/
	
	/*MICHELLE?- 1. Prompt for int ratings w/option to skip a category
			             1. Bitterness 2. Acidity 3. Fragrance 4. Flavor 
			             5. Aftertaste 6. Body 7. Sweetness 8. 'Clean Cup'
		          2. Sum scores and divide by the number of not skipped categories
	*/
	
	// Tasting notes
   System.out.print("Enter Tasting Notes (press Enter to submit notes): ");
   //The next line of code was necessary in order to make nextLine() work after using next() above. 
   input.nextLine();
   String tastingNotes = input.nextLine();
   
	//ANDREA timestamp
   printTimeStamp();
   
   /*ANDREA -  Save text file
         1. User specifies directory - use prommpts 
			2. User specified file name

      - create a File object (pg 473)
             java.io.File nameFileHere = new java.io.File("enter directory here");
      - write text to a file (pg 476)
             PrintWriter class to create and write data to a text file
             PrintWriter output = new PrintWriter(filename);
      - invoke the print, println and printf methods on the PrintWriter object to write data to a file
		       output.println("");
      - close the file  output.close();      	
	*/
	
/* MELVIN? - Edit Tasting
                  See page pg478 java.io.file
         	 Prompt to select/load a txt file to edit
         	 All features print out one by one
         	 User is prompted to change or accept old data
    */
	//save over old file


// PIERCE? (This is a large section. Could you start it and we'll help as we finish our sections)
// Generate Reports
	// If/else to determine which report type they wish to generate
	// Prompt for time period
	/*     1. where drank most coffee
			      by coffee shop
			      by geographical location*/
	//     2. How many cups of coffee has user consumed
	//     3. How much user spent on coffee
	//     4. Coffee ratings (highest & lowest)
			
	
			
	
	}
}