package logicInterview;

import java.util.Scanner;

public class CheckNumberIsPositiveOrNegOrNorBothConditionSatisfy {

	public static void main(String[] args) {
		//if n>0 number is  positive
		//if n<0 number is negative
		//if n=0 number is zero;
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" please enter any number ");
		int number = sc.nextInt();
		
		if(number>0)
		{
			System.out.println("number is positive ");
		}
		else if(number<0)
		{
			System.out.println(" number is negative");
		}
			else
			{
				System.out.println(" number is zero ");
			}
		
		
		
		

	}

}
