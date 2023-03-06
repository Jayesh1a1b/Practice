package logicInterview;

public class FindMinValueInArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int min =a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
System.out.println(min);
	}

}
