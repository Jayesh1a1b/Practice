package staticInterview;

public class CStatcblockStudy {
	
	//sequence of execution
	//static block->Instance block->constructor block
	//instance block always execute before the constructor
	
	{
		int a=10;int b=20;
		System.out.println(a+b);
		
	}

	static {
		System.out.println("Static block of class c");
	     }
	CStatcblockStudy()
	{
		int a=30;int b=40;
		System.out.println(a+b);
		
	}
	public static void main(String[] args) {
		CStatcblockStudy i=new CStatcblockStudy();

	}

}
