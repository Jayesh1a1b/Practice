package logicInterview;

public class SwapNumber {

	public static void main(String[] args) {
		int a=10;int b=20;int temp;
		//method1
	/*System.out.println("Before swapping values "+a+" and "+b);
		temp=a;//10
		a=b;//20
		b=temp;//10
		System.out.println("after swapping values "+a+" and "+b);*/
		
		//method2
		System.out.println("Before swapping values "+a+" and "+b);
		a=a+b;//30
		b=a-b;//30-20=10
		a =a-b;//30-10=20
		System.out.println("after swapping values "+a+" and "+b);
	}

}
