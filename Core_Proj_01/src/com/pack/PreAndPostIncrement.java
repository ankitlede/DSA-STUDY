package com.pack;

public class PreAndPostIncrement {

	public static void prePostIncrement(int arr[]) {

		System.out.println("This is Pre - Increament  .. .. .. ..");

		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("This is Post - Increament ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

		System.out.println();

		int a = 10;

		System.out.println("This is Pre Increment  ++ a  :: " + (++a));

		System.out.println("This is Pre Increment  a ++  :: " + (a++));

	}

	public static void main(String[] args) {

		int arr[] = { 10, 23, 44, 21, 34 };
		prePostIncrement(arr);

	}
}
