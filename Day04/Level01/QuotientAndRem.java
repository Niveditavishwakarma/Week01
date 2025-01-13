import java.util.Scanner;

public class QuotientAndRem {
   
    public  int[] findQuotientReminder(int number1,  int number2) {
        return new int[] {number1/number2, number1%number2};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

       
		QuotientAndRemReminder obj = new QuotientAndRem();

        int[] result = obj.findQuotientReminder(number1, number2);

        // Print the results
        System.out.println("The quotient  is: " + result[0]);
        System.out.println("The reminder  is: " + result[1]);
		//close the scanner
        scanner.close();
    }

  
}

