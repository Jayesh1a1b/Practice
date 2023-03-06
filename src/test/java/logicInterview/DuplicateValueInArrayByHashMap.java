package logicInterview;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateValueInArrayByHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,10,20};
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<=a.length-1;i++)
		{
			if(hs.add(a[i])==false)
			{
				System.out.println(a[i]);
			}
		}

	}

}
