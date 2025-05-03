package com.proj;

import java.awt.SystemTray;
import java.util.Arrays;

public class SortMatrixWithoutArrayList {

	public static void sortMatrix(int mat[][]) {

		int row = 0, col = 0;

		// finding how element in matrix

		int size = 0;

		for (int i = 0; i < mat.length; i++) {
			size += mat[i].length;
		}

		System.out.println("No Of element  Present in Matrix  :: " + size);

		int arr[] = new int[size];

		int k = 0;

		for (int i = row; i < mat.length; i++) {
			for (int j = col; j < mat[i].length; j++) {
				arr[k] = mat[i][j];
				k++;
			}
		}

		// row ++;
		System.out.println("Unsorted Array ::");

		for (int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();

		Arrays.sort(arr);

		System.out.println("Sorted Array ::");
		for (int element : arr) {

			System.out.print(element + " ");
		}
		System.out.println();
		// after sorting insert into old array

		int p = 0;
		for (int i = row; i < mat.length; i++) {
			for (int j = col; j < mat[i].length; j++) {
				mat[i][j] = arr[p];
				p++;
			}

		}

		printArray(mat);

	}

	public static void printArray(int mat[][]) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "  ");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		// int m = 3 , n=3;

		int mat[][] = { { 4, 3, 1, 12 }, { 2, 6, 7, 24 }, { 8, 9, 5, 45 } };

		sortMatrix(mat);

	}

}
