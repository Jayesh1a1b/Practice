package logicInterview;

public class KthLargestNumberInArray {

	public static void main(String[] args) {
		int a[]= {20,35,12,67,35};
		int k=3;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				
				if(a[j]>a[i])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
				
			}
			if(i==k-1)
			{
				System.out.println(k+" Largest element is "+a[i]);
			}
		}
	}

}
