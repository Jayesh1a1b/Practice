package logicInterview;

public class Trial1 {

	public static void main(String[] args) {
		// Regular Expression
		String s="****you#tube%&*GHJ*1234";
		String s1 = s.replaceAll("[^]", " ");
        System.out.println(s1);
        
        String s2="ABC123%BB";
		String s3 = s2.replaceAll("[^0-9]", "");
		System.out.println(s3);
	}

}
