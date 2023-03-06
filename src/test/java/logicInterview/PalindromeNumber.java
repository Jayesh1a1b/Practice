package logicInterview;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// Ex-121,16261;
		int rev=0;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter any number ");
		num=sc.nextInt();
		int org_num=num;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
if(org_num==rev)
{
	System.out.println("enter number is Palindromr ");
}
else
{
	System.out.println("enter number is not Palindromr ");
}
		
		
		
		
		
		
		
		
		
}
}