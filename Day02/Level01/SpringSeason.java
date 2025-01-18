//create a class to know the spring season 
public class SpringSeason {

    public static void main(String[] args) {
        // Get month and day from command line arguments
        int month = Integer.parseInt(args[0]);  // Month as an integer 
        int day = Integer.parseInt(args[1]);    // Day as an integer 

        // Check if the given date falls within the Spring season
        if (month == 3 && day >= 20 || month == 4 || month == 5 || (month == 6 && day <= 20)) {
            System.out.println("It's a spring season");
        } else {
            System.out.println("Not a spring season");
        }
    }
}
