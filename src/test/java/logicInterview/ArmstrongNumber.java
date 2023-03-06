package logicInterview;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// 153=1*1*1+5*5*5+3*3*3=1+125+27=153;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter any number");
		int n = sc.nextInt();
		int orgNum=n;int rem;int arm=0;
		while(n>0)
		{
			rem=n%10;
			arm=arm+(rem*rem*rem);
			n=n/10;
		}
    if(orgNum==arm)
    {
    	System.out.println("armstrong number");
    }
    else
    {
    	System.out.println("Not armstrong number" );
    }
	}

}
