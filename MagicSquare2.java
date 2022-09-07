package com.gyuone.exam01;

public class MagicSquare2 {
	private int[][] arr;

	public MagicSquare2(int[][] arr) {
		this.arr = arr;
	}

	public int[][] getSquare() {
		int row = arr.length - 1; // 1
		int col = arr.length / 2; // 3
		int value = 0;

		arr[row][col] = ++value;
		while(value < Math.pow(arr.length, 2)) {
			if(arr[(row+1) % arr.length][(col +1) % arr.length] == 0) {
				row++;
				col++;
			} else {
				row--;
			}
			arr[row % arr.length][col % arr.length] = ++value;
		}
		
		return arr;
	}
}
