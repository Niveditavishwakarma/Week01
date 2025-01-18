import java.util.Scanner;
class DayOfWeek {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // ask the user to enter the date details
        System.out.print("Enter the month: ");
        int month = scanner.nextInt();

        System.out.print("Enter the day: ");
        int day = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt(); 

        // Formula to calculate day of the week
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;
		
		switch(d0){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6: 
                System.out.println("Saturday");
                break;
			default:
                System.out.println("Please enter the valid date");
                break;
		}
		//closing the scanner object
		scanner.close();
	}
}

