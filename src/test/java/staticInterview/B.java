package staticInterview;

public class B extends A {
	public static void m1() {
		System.out.println(" B CLASS m1 method");
	}

	public static void main(String[] args) {
		A a = new A();// create object of class A(super class)
		a.m1();// call with reference variable
		A.m1();// call with class name
		m1();// call without class name
		B.m1();// call with class name
		a.m2();// call non static method of other class with reference variable
		A a1 = new B();// create object of class B(sub class)
		a1.m1();// call super class method
	}

	public void m2() {
		System.out.println(" B CLASS m2 method");
	}

}
