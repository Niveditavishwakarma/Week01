public class stringIndexOutOfBoundsExceptionDemo {
	//method to generate StringIndexOutOfBounds exception
	public static void generate()
	{
		String text = "hello";
		System.out.println("Character at index 10: " + text.charAt(10));
	}
	//method to handle StringIndexOutOfBounds exception
	public static void handle(){
		String text = "hello";
		try{
			System.out.println("Character at index 10: " + text.charAt(10));
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("Caught StringIndexOutOfBounds exception:Attempted to access out of bound index .");
		}
	}
	public static void main(String args[])
	{
		System.out.println("Demonstrating String out of bounds exception: ");
		try{
			generate();
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Exception generated: " + e.getMessage());
		}
		//call the method to handle exception
		System.out.print("handling StringIndexOutOfBounds exception: ");
		handle();
	}
}