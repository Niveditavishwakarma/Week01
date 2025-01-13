import java.util.Scanner;

public class EuclideanDistance {

    // Method to find the Euclidean distance between two points (x1, y1) and (x2, y2)
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Method to find the equation of the line given two points (x1, y1) and (x2, y2)
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] equation = new double[2];  
        
        // Calculate slope m = (y2 - y1) / (x2 - x1)
        double m = (y2 - y1) / (x2 - x1);
        
        // Calculate y-intercept b = y1 - m * x1
        double b = y1 - m * x1;

        // Store the slope and y-intercept in the array
        equation[0] = m;
        equation[1] = b;
        
        return equation;
    }

    public static void main(String[] args) {
        // Input for two points (x1, y1) and (x2, y2)
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the coordinates of the first point (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        
        System.out.print("Enter the coordinates of the second point (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        // Calculate the Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("The Euclidean distance between the two points is: " + distance);
        
        // Find the equation of the line
        double[] equation = findLineEquation(x1, y1, x2, y2);
        System.out.println("The equation of the line is: y = " + equation[0] + " * x + " + equation[1]);
        
        scanner.close();
    }
}

