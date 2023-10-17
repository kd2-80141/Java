package Com.Sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class GenricSort {
	
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
		if(c.compare(arr[i], arr[j]) > 0) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
		}
		}
		}
	
	public static void main(String[]args) {
		Double[] arr = new Double[5];
		arr[0]= 11.11;
		arr[1]= 15.28;
		arr[2]= 28.85;
		arr[3]= 35.42;
		arr[4]= 7.45;
		
		System.out.println("Before Sort: ");
		for(Double d1 : arr)
		System.out.println(d1); 
		
		
		DoubleSortComparator SortComparator = new DoubleSortComparator();
		
		selectionSort(arr,SortComparator);
		
		
		System.out.println("After Sort by Name: ");
		for(Double d:arr)
			System.out.println(d);
	}
	
	
	
	
	

}
