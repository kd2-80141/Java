package com.sunbeam;

public class MinimumNumber {
	static <T extends Number> T findMin(T[]arr) {
		T min = arr[0] ;
		for(int i = 1 ; i < arr.length ; i++)
		{
		if(arr[i].doubleValue()< min.doubleValue())
		{
		min  = arr[i];

		}
		}
		return min;

		 }
	



public static  void main(String[] args) {
	Integer[] arr1 = {22,55,73,14,07,58};
	System.out.println("Minimum element is array is. "+ findMin(arr1));
	Double[] arr2= {2.2,5.5,8.1,1.4,5.5};

	Double min2=   findMin(arr2);
	System.out.println("Minimum element is array is. "+ findMin(arr2));
}
}
