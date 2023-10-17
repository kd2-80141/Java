package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class TesterStudent {

	public static void main(String[] args) {

		Student[] arr = new Student[5];

		arr[0] = new Student(1001, "ZShrilekh", "Nagpur", 45);
		arr[1] = new Student(1004, "Nishant", "Nagpur", 45);
		arr[2] = new Student(1008, "Ashish", "Manmad", 55);
		arr[3] = new Student(1016, "Rushikesh", "Aurangabad", 05);
		arr[4] = new Student(1024, "Nirmal", "Chandrapur", 14);

		System.out.println("Before sort: ");
		for (Student e1 : arr)
			System.out.println(e1);

		class CityMarksName implements Comparator<Student> {

			@Override
			public int compare(Student s1, Student s2) {

				int diff = -s1.getCity().compareTo(s2.getCity());
				if (diff == 0)
					diff = -Double.compare(s1.getMarks(), s2.getMarks());
				if (diff == 0)
					diff = s1.getName().compareTo(s2.getName());
				return diff;
			}
		}

		System.out.println();

		CityMarksName cc = new CityMarksName();

		System.out.println("After sort");
		
		Arrays.sort(arr, cc);
		
		for (Student e1 : arr)
			System.out.println(e1);

	}

}
