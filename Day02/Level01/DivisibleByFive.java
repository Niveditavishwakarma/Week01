// Create DivisibleBy5 Class to compute the whether a number is divisible or not
import java.util.Scanner;

class DivisibleByFive{

   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value for number
      int origNumber = input.nextInt();
	  
	  //create a variable to store result 
	  boolean res = false;
     //Check if origNumber is divisible by 5
	 if(origNumber%5 == 0)
	 { 	
		res = true;
		System.out.println( " Is the number " + origNumber + " divisible by 5? " + res);

	 }
	 //Closing the Scanner object
      input.close();
   }
}

