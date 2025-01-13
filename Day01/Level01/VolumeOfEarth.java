//create a class to calculate volume of earth
class VolumeOfEarth{
	public static void main(String args[]){
		//create a variable to store radius in kilometers
		int radius = 6378;
		//calculate the volume in kilometers
		double volumeInKilometers = 4/3*3.14*radius*radius*radius;
		//calculating the volume in miles
		double volumeInMiles = volumeInKilometers*1.6*1.6*1.6;
		//Printing the volume in cubic Kilometers and cubic miles
		System.out.print("The volume of earth in cubic kilometers is " + volumeInKilometers + " and cubic miles is " + volumeInMiles);
	}
}