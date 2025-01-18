import java.util.Scanner;
//create a class for voting eligibility
class PersonCanVote{
	public static void main(String args[]){
		 // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get input value for age
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        // Check if the person can vote 
        if (age >= 18) {
            // If age is 18 or older
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // If age is less than 18
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Close the scanner
        input.close();
	}
}