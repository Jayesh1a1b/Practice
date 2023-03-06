package staticInterview;

public class CallStaticMethodInNonStaticMethod {
	public static void m1()
	{
		System.out.println(" m1 static method ");
	}
	
	public  void m2()
	{
		m1();
		System.out.println(" m2  non static method ");
	}

	public static void main(String[] args) {
		CallStaticMethodInNonStaticMethod xyz=new CallStaticMethodInNonStaticMethod();
		m1();
		xyz.m2();
	}

}
