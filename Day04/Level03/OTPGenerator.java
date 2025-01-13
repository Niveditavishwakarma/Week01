
public class OTPGenerator {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Generate a random 6-digit OTP between 100000 and 999999
        return 100000 + (int) (Math.random() * 900000);
    }

    // Method to ensure the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    // If any OTP is repeated, return false
                    return false;
                }
            }
        }
        // If no repeated OTPs, return true
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];  // Array to store 10 OTPs

        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otps[i]);
        }

        // Check if all the OTPs are unique
        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are not unique.");
        }
    }
}

