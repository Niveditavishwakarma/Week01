import java.util.Scanner;

//create substring by charAt()
public class Substring{
public static String createSubstring(String str,int start,int end)
{	StringBuilder substr = new StringBuilder();
	for(int i = start; i<end;i++)
	{
		substr.append(str.charAt(i));
	}
	return substr.toString();
}
//compare two strings 
public static boolean compare(String str1,String str2)
{
	if(str1.length() != str2.length())
			{
				return false;
			}
			for(int i=0; i<str1.length(); i++)
			{
				if(str1.charAt(i) != str2.charAt(i))
				{
					return false;
				}
			}
			return true;
}
public static void main(String a[])
{
	Scanner sc = new Scanner(System.in);
	//Enter string 
	System.out.println("Enter string: ");
	String str = sc.next();
	//Enter start index
	System.out.println("Enter start index: ");
	int start = sc.nextInt();
	//Enter end index
	System.out.println("Enter end index: ");
	int end = sc.nextInt();
	//create substring using charAt() method
	String CharAtsubstring = createSubstring(str,start,end);
	//create substring using built-in method
	String BuiltInsubstring = str.substring(start,end);
	//compare both strings are same 
	boolean comapareResult = compare(CharAtsubstring,BuiltInsubstring);
	
	//Display result
	System.out.println("Substring using charAt(): " + CharAtsubstring);
	System.out.println("Substring using built-in(): " + BuiltInsubstring);
	System.out.println("Are both Substrings equal? " + comapareResult);
}
	
}