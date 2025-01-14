import java.util.Scanner;

public class FindStringLength{
	//create a method to find the lenth of the string
	public static int getlength(String input)
	{
		int count = 0;
		int i=0;
		try{
			while(true)
			{
				input.charAt(i);
				count++;
				i++;
			}
		}
		catch(StringIndexOutOfBoundsException e)
		{}
		return count++;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String input = sc.next();
		
		//calling method to find the length of String
		int lengthByMethod = getlength(input);
		//find length by in built method
		int lengthByBuiltInMethod = input.length();
		
		System.out.println("Length by user defined function: " + lengthByMethod);
		System.out.println("Length by built in method: " + lengthByBuiltInMethod);
		if(lengthByMethod == lengthByBuiltInMethod)
		{
			System.out.println("Lengths are equal");
		}
		else{
			System.out.println("Lengths are not equal");
		}
		
	}
}