package com.gyuone.exam01;

public class MagicMain {
	public static void main(String[] args) {
		int[][] a = new int[5][5];
		MagicSquare2 square = new MagicSquare2(a);
		printSquare(square.getSquare());
	}
	
	
	
	public static void printSquare(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int k = 0; k < arr[i].length; k++) {
				System.out.printf("%2d ", arr[i][k]);
			}
			System.out.println();
		}
	}
}
