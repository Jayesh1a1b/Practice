package logicInterview;

public class SumOfDigitOfNumber {

	public static void main(String[] args) {
		// number =1234;
		int rem;int n=12345;
		int sum=0;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			sum=sum+rem;
		}
		System.out.println("sum of digit in number is "+sum);

	}

}
