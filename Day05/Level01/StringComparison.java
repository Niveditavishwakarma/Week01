import java.util.Scanner;
public class StringComparison{
	//compare strings using charAt()
		public static boolean compare(String str1, String str2)
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
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str1 = sc.next();
		System.out.println("Enter String 2: ");
		String str2 = sc.next();
		boolean compareResult = compare(str1,str2);
		//compare using equals method
		boolean equalsMethod = str1.equals(str2);
		System.out.println("compare using charAt(): " + compareResult);
		System.out.println("compare using equals method: " + equalsMethod);
		//check if both the results are same
		if(compareResult == equalsMethod)
		{
			System.out.println("Both results are equal");
		}
		else{
			System.out.println("Both results are different");
		}
		sc.close();
	}
}