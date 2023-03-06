package logicInterview;

public class PalindromeString {

	public static void main(String[] args) {
		// ex=mam;
		String s="java";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println(" String is palindrome string");
		}
		else
		{
			System.out.println("String is not  palindrome string");
		}

	}

}
