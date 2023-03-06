package staticInterview;

public class StaticclassStudy {
//we can not create class as static
	static class E{ //but we create inner class as static
		public static void  m1()
		{
			System.out.println("Outer class non static->inner class static->mi method");
		}
		
	}
	public static void main(String[] args) {
		//m1();showing error because m1 method contains in inner class 
		//StaticclassStudy.m1();showing error because m1 method contains in inner class 
		//how to call m1 ()->??
		StaticclassStudy.E xyz=new StaticclassStudy.E();
		//here E is static class so first write main class then call inner class by providing.
		//main class.inner class reference variable=new main class.inner class();for call inner class method
		xyz.m1();
		
	}

}
