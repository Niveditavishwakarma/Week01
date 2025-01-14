public class NullpointerexceptionDemo {
	//method to generate null pointer exception
	public static void generate()
	{
		String text = null;
		System.out.println("text length: " + text.length());
	}
	//method to handle null pointer exception
	public static void handle(){
		String text = null;
		try{
			System.out.println("Length of text: " + text.length());
		}
		catch(NullPointerException e){
			System.out.println("Caught null pointer exception:Attempted to access null object.");
		}
	}
	public static void main(String args[])
	{
		System.out.println("Demonstrating null pointer exception: ");
		try{
			generate();
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception generated: " + e.getMessage());
		}
		//call the method to handle exception
		System.out.print("handling null pointer exception: ");
		handle();
	}
}