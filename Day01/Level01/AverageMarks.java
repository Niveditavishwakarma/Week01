//create AverageMarks class to calculate the average marks
class AverageMarks{
	public static void main(String args[]){
		//create a variable to store marks in maths
		int mathsMarks = 94;
		//create a variable to store marks in physics 
		int physicsMarks = 95;
		//create a variable to store marks in chemistry
		int chemistryMarks = 96;
	    //create an average variable to calculate the average marks
		double average = mathsMarks + physicsMarks + chemistryMarks / 3;
		//Printing the average marks
		System.out.println("Sam’s average mark in PCM is "+ average);
	
	}
}