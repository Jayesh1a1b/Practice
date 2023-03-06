package logicInterview;

public class WhiteSpace {

	public static void main(String[] args) {
		String s="I love";
		int Count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char Blank = s.charAt(i);
			if(Blank==' ')
			{
			Count++;	
			}
		}
System.out.println(Count);
	}

}
