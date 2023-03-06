package staticInterview;

public class CallingStaticMethodWithObject 
 {
	
public static void m1()
{
	System.out.println("static method running");
}
public static void m2()
{
	System.out.println(" non static method running");
}
	public static void main(String[] args)
	{
		CallingStaticMethodWithObject xyz=new CallingStaticMethodWithObject();
	xyz.m1();
	xyz.m2();// It is possible to call static method with the help of reference variable

	}

}
