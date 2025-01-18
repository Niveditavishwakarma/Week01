import java.util.Scanner;

public class LeapYearLogical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input from user
        System.out.print("Enter a year (greater than 1582): ");
        int year = sc.nextInt();

        //according to gregorian calendar
        if (year <= 1582) {
            System.out.println("Please enter a year greater than 1582.");
        } else {
            //condition using logical AND
			if(year % 4==0 && year%100!=0 ){
                System.out.println(year + " is a leap year.");
			}
			else if( year%4==0 && year%100==0 && year% 400==0)
			{
                System.out.println(year + " is a leap year.");
          
			}
			else
                System.out.println(year + " is not a leap year.");
		}

        sc.close();
    }
}