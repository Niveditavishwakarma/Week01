public class CollinearPoints {

    // Method to check collinearity using the slope formula
    public static boolean isCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate slopes
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);

        // Check if all slopes are equal
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using the area of the triangle formula
    public static boolean isCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate the area of the triangle
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        // Sample points A(2, 4), B(4, 6), C(6, 8)
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;

        // Check collinearity using slope formula
        boolean collinearBySlope = isCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using Slope Formula: " + collinearBySlope);

        // Check collinearity using area of the triangle formula
        boolean collinearByArea = isCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using Area Formula: " + collinearByArea);

        // Conclusion
        if (collinearBySlope && collinearByArea) {
            System.out.println("The points A(" + x1 + ", " + y1 + "), B(" + x2 + ", " + y2 + "), and C(" + x3 + ", " + y3 + ") are collinear.");
        } else {
            System.out.println("The points A(" + x1 + ", " + y1 + "), B(" + x2 + ", " + y2 + "), and C(" + x3 + ", " + y3 + ") are not collinear.");
        }
    }
}

