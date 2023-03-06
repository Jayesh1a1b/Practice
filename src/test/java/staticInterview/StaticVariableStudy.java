package staticInterview;

public class StaticVariableStudy {
	//can we call static variable and method by creating object-> Answer->yes
static int a=10;
public static void m1()
{
	final int a=20;int b=10;//we can not create static variable in local method but final can
	System.out.println(a);//print local variable
	System.out.println(a+b);
	
}
	public static void main(String[] args) {
		
System.out.println(a);//only global variable print local variable can not access

StaticVariableStudy v=new StaticVariableStudy();
System.out.println(v.a);// print global variable 
m1();

	}

}
