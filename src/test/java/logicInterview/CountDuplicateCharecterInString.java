package logicInterview;

public class CountDuplicateCharecterInString {

	public static void main(String[] args) {
		String s="I Love India";
		int WithIStringLength = s.length();
		//count character I in String
		String s1 = s.replace("I", "");
		int WithoutIStringLength = s1.length();
		 int IRepitation = WithIStringLength -WithoutIStringLength;
		 System.out.println(IRepitation);

	}

}
