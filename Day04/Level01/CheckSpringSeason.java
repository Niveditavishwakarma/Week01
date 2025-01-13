public class CheckSpringSeason {

    // Method to check if the given month and day fall in the Spring season
    public boolean isSpringSeason(int month, int day) {
        if (month == 3 && day >= 20 && day <= 31) { 
            return true;
        } else if (month == 4 && day >= 1 && day <= 30) { 
            return true;
        } else if (month == 5 && day >= 1 && day <= 31) { 
            return true;
        } else if (month == 6 && day >= 1 && day <= 20) { 
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
       
        // taking the input from command line
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        CheckSpringSeason seasonChecker = new CheckSpringSeason();

        // Check if it's Spring season
        boolean isSpring = seasonChecker.isSpringSeason(month, day);

        // Display the result
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}

