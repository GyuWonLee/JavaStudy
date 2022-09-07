package com.gyuone.exam01;

public class MagicSquare {
	private int[][] arr;

	public MagicSquare(int[][] arr) {
		this.arr = arr;
	}

	public int[][] getSquare() {
		int row = arr.length - 1; // 1
		int col = arr.length / 2; // 3
		int max = arr.length - 1;

		arr[row][col] = 1;

		for (int i = 2; i <= arr.length * arr.length; i++) {
			if ((col + 1) > max && (row + 1) > max) {
				row--;
			} else if ((col + 1) > max) {
				col = 0;
				row++;

			} else if ((row + 1) > max) {
				row = 0;
				col++;
			} else {
				row++;
				col++;
			}
			if(arr[row][col] != 0) {
				row -= 2;
				col--;
			}
			arr[row][col] = i;
		}
		return arr;
	}
}
