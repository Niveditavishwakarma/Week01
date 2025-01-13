import java.util.Scanner;

public class AverageWithRemark{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Chemistry marks ");
        double chemistry = sc.nextDouble();
		System.out.print("Enter a physics marks ");
        double physics = sc.nextDouble();
		System.out.print("Enter a maths marks ");
         double maths = sc.nextDouble();
		 double marks=((maths + physics + chemistry)/300)*100;
        if (marks >= 80) 
            System.out.println("marks : " +marks + " Grade A " + "Remark : " + "Level 4, above agency-normalized standards");
		else  if (marks >= 70 && marks <=79) 
            System.out.println("marks : " +marks + " Grade B " + "Remark : " + "Level 3, at agency-normalized standards");
		else  if (marks >= 60 && marks <=69) 
            System.out.println("marks : " +marks + " Grade C "  + "Remark : " + "Level 2, below, but approaching agency-normalized standards");
		else if (marks >= 50 && marks <=59) 
            System.out.println("marks : " +marks + " Grade D " + "Remark : " + "Level 1, well below agency-normalized standards");
		else  if (marks >= 40 && marks <=49) 
            System.out.println("marks : " +marks + " Grade E " + "Remark : " + "Level 1-, too below agency-normalized standards");
		else 
            System.out.println("marks : " +marks + " Grade R " + "Remark : " + "Remedial standards");
			sc.close();
    }
}