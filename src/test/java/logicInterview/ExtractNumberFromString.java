package logicInterview;

public class ExtractNumberFromString {

	public static void main(String[] args) {
		//[abc]
		//[^0-9]-> Extract Number only
		//[^a-z]-> Extract Lower case Alphabets
		//[^A-Z]-> Extract Upper Case letter
	String s="****%12Gh3r4";
	String s1 = s.replaceAll("[^0-9]", "");
	System.out.println(s1);

	String s2 = s.replaceAll("[^a-z]", "");
	System.out.println(s2);
	
	String s3 = s.replaceAll("[^A-Z]", "");
	System.out.println(s3);
	
	
	}

}
