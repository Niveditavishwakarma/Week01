//create a class PenDistribution to calculate equal distribution 
class PenDistribution{
	public static void main(String args[]){
		//create a variable to store totl pens
		int totalPens = 14;
		//create a variable to store total students
		int totalStudents = 3;
		//create a variable to fine pen per students
		int penPerStudent = totalPens/totalStudents;
		//create a variable to find remaining pens
		int remainingPens = totalPens%totalStudents;
		//Printing the distribution of pen per student and remaining pens
		System.out.print("The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " + remainingPens);

	}
}