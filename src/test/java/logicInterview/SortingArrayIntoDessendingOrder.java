package logicInterview;

import java.util.Arrays;
import java.util.Collections;

public class SortingArrayIntoDessendingOrder {

	public static void main(String[] args) {
		Integer a[]= {10,30,2,16,25};
		Arrays.sort(a,Collections.reverseOrder());//sorting an array in dessending order and  show sort error so user wrapper Integer
		System.out.println(Arrays.toString(a));//convert

	}

}
