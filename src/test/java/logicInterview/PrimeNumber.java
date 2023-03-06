package logicInterview;

public class PrimeNumber {

	public static void main(String[] args) {
		// A number which is divisible by own and 1 is called as prime number
		int num=12;int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("number is not prime number");
		}
		else
		{
			System.out.println("number is prime number");
		}

	}

}
