package staticInterview;

public class CallNonStaticMethodInStaticMethod {
	public void m1()
	{
		int a=10;int b=20;
		System.out.println(a+b);
	}
	public static void m2()
	{
		
		//m1();Here show error because  in non static method we can not call directly  static method
		
		//for calling static method we create object and that reference variable call static method
		CallNonStaticMethodInStaticMethod xyz=new CallNonStaticMethodInStaticMethod();
		xyz.m1();
		int c=20;int d=20;
		System.out.println(c+d);
	}

	public static void main(String[] args) {
		m2();
	}

}
