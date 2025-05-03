package com.proj;

public class PrintSnakePattern {

	public static void print(int m, int c, int mat[][]) {
		
		
	//	System.out.println(mat.length+ "  " + mat[0].length);

		
		boolean leftRight = true;

		int row = 0, col = 0;

		while (row < m) {
			if (leftRight == true) {

				for (int i = col; i < c; i++) {

					System.out.print(mat[row][i] + "  ");

				}
				System.out.println();
				row++;
				leftRight = false;

			} else {

				for (int i = c - 1; i >= col; i--) {

					System.out.print(mat[row][i] + "  ");

				}
				System.out.println();
				row++;
				leftRight = true;

			}
		}

	}

	public static void main(String[] args) {

		int m = 4, n = 4;

		int mat[][] = new int[][] { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };

		print(m, n, mat);

	}

}
