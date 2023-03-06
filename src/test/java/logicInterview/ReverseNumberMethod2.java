package logicInterview;

public class ReverseNumberMethod2 {

	public static void main(String[] args) {
		int num=1234;
		String orgnum=Integer.toString(num);//convert integer to String
		String Rev="";
		for(int i=orgnum.length()-1;i>=0;i--)
		{
			Rev=Rev+orgnum.charAt(i);
		}
		int Revnum = Integer.parseInt(Rev);//convert string to integer
		
		System.out.println(Revnum);
	}

}
