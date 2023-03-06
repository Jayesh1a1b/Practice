package logicInterview;

import java.util.Scanner;

public class FindFactorOfNumber {

	public static void main(String[] args) {
		//input->10->1,2,5,10
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any number ");
		int number = sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				System.out.println(i);
			}
				
		}
		

	}

}
