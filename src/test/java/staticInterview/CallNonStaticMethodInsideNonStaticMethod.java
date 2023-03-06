package staticInterview;

public class CallNonStaticMethodInsideNonStaticMethod 
 {
	public void m1()
	{
		System.out.println(" Non static method ->m1");
	}
	public void m2()
	{
		//in non static method calling non static method with two types
		
		//Type 1 by creating object
		/*CallNonStaticMethodInsideNonStaticMethod xyz1=new CallNonStaticMethodInsideNonStaticMethod();
	    xyz1.m1();*/
		
		//type 2 by direct calling
		
		m1();
		System.out.println(" non statoc method ->m2");
	}
	public static void main(String[] args) {
		CallNonStaticMethodInsideNonStaticMethod xyz=new CallNonStaticMethodInsideNonStaticMethod();
xyz.m1();
xyz.m2();
	}

}
