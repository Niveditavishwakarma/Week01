import java.util.Scanner;
import java.util.Arrays;
public class SplitString{
	//method to find length of string by user defined function
	public static int findLength(String text)
	{
		int count = 0;
		try{
			while(true)
			{
				text.charAt(count);
				count++;
			}
		}
		catch(StringIndexOutOfBoundsException e)
		{}
		return count;
	}
	
	//user defined method to split the Strings
	public static String[] splitWithoutSplitMethod(String text){
		int length = findLength(text);
		int spaceCount = 0;
		for(int i=0; i<length; i++)
		{
			if(text.charAt(i) == ' ')
			{
				spaceCount++;
			}
		}
		//create arrays to store the index of spaces and words of the given String
		int spaceIndexes[] = new int[spaceCount+1];
		String words[] = new String[spaceCount+1];
		//to store space index
		int spaceIndex = 0;
		for(int i=0; i<length; i++)
		{
			if(text.charAt(i) == ' ')
			{
				spaceIndexes[spaceIndex++] = i;
			}
		}
		//mark the last index
		spaceIndexes[spaceCount] = length;
		//Extract words using spaceIndex
		int start = 0; 
		for(int i=0; i<spaceIndexes.length;i++)
		{
			int end = spaceIndexes[i];
			words[i] = text.substring(start,end);
			start = end+1;
		}
		return words;
	}
	
	//method to compare two arrays
	public static boolean compareStringArrays(String[] array1, String[] array2)
	{
		if(array1.length!= array2.length)
		{
			return false;
		}
		for(int i=0; i<array1.length; i++)
		{
			if(!array1[i].equals(array2[i]))
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//take string as input
		System.out.println("Enter String: ");
		String text = sc.nextLine();
		
		//split by using custom method
		String[] customSplit = splitWithoutSplitMethod(text);
		
		//split using in built method 
		String[] builtInSplit = text.split(" ");
		
		//compareing the results
		boolean areEqual = compareStringArrays(customSplit,builtInSplit);
		
		//Display the results
		System.out.println("Words from custom split method: " + Arrays.toString(customSplit));
		System.out.println("Words from built in method: " + Arrays.toString(builtInSplit));
		System.out.println("Are both producing the same results: " + areEqual);
		
	}
}