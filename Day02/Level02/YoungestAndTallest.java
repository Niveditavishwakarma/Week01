import java.util.Scanner;
import java.lang.Math;
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		//Enter the age of Amar
        System.out.print("Enter Amar's age: ");
        int amarAge = scanner.nextInt();
		//Enter the height of Amar
        System.out.print("Enter Amar's height in cm: ");
        int amarHeight = scanner.nextInt();
		//Enter the age of Akbar
        System.out.print("Enter Akbar's age: ");
        int akbarAge = scanner.nextInt();
		//Enter the height of Akbar
        System.out.print("Enter Akbar's height in cm: ");
        int akbarHeight = scanner.nextInt();
		//Enter the age of Anthony 
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();
		//Enter the height of Anthony
        System.out.print("Enter Anthony's height in cm: ");
        int anthonyHeight = scanner.nextInt();

        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngestFriend = "";
        //calculate the youngest
        if (youngestAge == amarAge) {
            youngestFriend = "Amar";
        } else if (youngestAge == akbarAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }
		//calculate the tallest
        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallestFriend = "";
        
        if (tallestHeight == amarHeight) {
            tallestFriend = "Amar";
        } else if (tallestHeight == akbarHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);
		//closing the scanner object
		scanner.close();
    }
}