import java.util.Scanner;
import java.util.Arrays;
public class StringCharacterComparison{
	
//method to get characters
public static char[] getCharacters(String input)
{
	char[] characters = new char[input.length()];
	for(int i=0;i<input.length(); i++){
		characters[i] = input.charAt(i);
	}
	return characters;
}	
//method to compare two arrays
public static boolean compareArrays(char[] array1,char[] array2) {
	if(array1.length != array2.length)
	{
		return false;
	}
	for(int i=0;i<array1.length;i++)
	{
		if(array1[i] != array2[i])
		{
			return false;
		}
	}
	return true;
}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.next();
		//method to return user defined characters
		char[] userDefinedCharacters = getCharacters(input);
		//method to return built-in characters
		char[] builtinCharacters = input.toCharArray();
		
		System.out.println("Characters using user defined function: " + Arrays.toString(userDefinedCharacters));
		System.out.println("Characters using built in function: " + Arrays.toString(builtinCharacters));
		//comparing the two characters array
		boolean result = compareArrays(userDefinedCharacters,builtinCharacters);
		System.out.println("both arrays are equal: " + result);
	}
}