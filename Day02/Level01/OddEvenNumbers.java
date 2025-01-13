import java.util.Scanner;

public class OddEvenNumbers {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to input a number
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        
            // Loop from 1 to the number entered by the user
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    // If the number is divisible by 2, it is even
                    System.out.println(i + " is even.");
                } else {
                    // If the number is not divisible by 2, it is odd
                    System.out.println(i + " is odd.");
                }
            }
        

        // Close the scanner object
        sc.close();
    }
}
