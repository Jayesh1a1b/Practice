package logicInterview;

import java.util.Scanner;

public class SumOfEvenAndOddNumber {

	public static void main(String[] args) {
		int sum=0;
     Scanner sc=new Scanner(System.in);
     System.out.println(" enter any number ");
     int num = sc.nextInt();
     if(num%2==0)
     {
    	 for(int i=0;i<=num;i=i+2)
    	 {
    		 sum=sum+i;
    		 
    	 }
    	 System.out.println("Even number sum is "+sum);
     }
     else
     {
    	 for(int i=1;i<=num;i=i+2)
     
    	 {
    		 sum=sum+i;
    	 }
     System.out.println("Odd number sum is "+sum); 
     }
	}

}
