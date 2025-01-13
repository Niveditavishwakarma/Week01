import java.util.Scanner;

public class DigitsFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking the input for the number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        
        // Finding the count of digits in the number
        int count = 0;
        long tempNumber = number;
        while (tempNumber != 0) {
            count++;
            tempNumber /= 10;
        }
        
        // Creating an array to store the digits
        int[] digits = new int[count];
        tempNumber = number;
        
        // Storing the digits in the digits array
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int) (tempNumber % 10);
            tempNumber /= 10;
        }
        
        // Creating a frequency array of size 10 (for digits 0-9)
        int[] frequency = new int[10];
        
        // Looping through the digits array and updating the frequency array
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }
        
        // Displaying the frequency of each digit
        System.out.println("Frequency of each digit in the number:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " : " + frequency[i]);
            }
        }
        
        sc.close();
    }
}
