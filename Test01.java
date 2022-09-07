package com.gyuone.exam01;

public class Test01 {
	public static void main(String[] args) {
		double[][] findAvgInput = { { 5, 4.5, 6.8 }, { 6, 0, 3.4 }, { 7, 8.4, 2.3 } };
		printArray(findAvgInput);
		findAverage(findAvgInput);
		System.out.println("=======================");
		printArray(findAvgInput);
	}

	public static void findAverage(double[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array.length; column++) {
				if (array[row][column] == 0) {
					array[row][column] = Math.max(getRowTotal(array, row) / array[row].length,
							getColumnTotal(array, column) / array.length);
				}
			}
		}
	}

	public static void printArray(double[][] arr) {
		for (double[] row : arr) {
			for (double column : row) {
				System.out.printf("%2.1f ", column);
			}
			System.out.println();
		}
	}
	
	public static double getRowTotal(double[][] array, int row) {
		double sum = 0.0;
		for (int column = 0; column < array[row].length; column++) {
			sum += array[row][column];
		}
		return sum;
	}
	
	public static double getColumnTotal(double[][] array, int column) {
		double sum = 0.0;
		for (int row = 0; row < array.length; row++) {
			sum += array[row][column];
		}
		return sum;
	}

}
