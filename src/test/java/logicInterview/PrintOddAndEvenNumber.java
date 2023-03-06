package logicInterview;

import java.util.Scanner;

public class PrintOddAndEvenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter number");
		int num = sc.nextInt();
		if(num%2==0)
		{
			System.out.println("number is even number");
		}
		else
		{
			System.out.println("number is odd number");
		}
	}

}
