package com.gyuone.exam01;

import java.util.Scanner;

public class Mine {
	public static void main(String[] args) {
		int mine[][] = { { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
						 { 0, 1, 0, 0, 1, 0, 0, 0, 0 },
						 { 0, 0, 0, 1, 0, 0, 0, 0, 0 },
						 { 0, 1, 0, 0, 0, 0, 1, 1, 0 }, 
						 { 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
						 { 0, 0, 0, 1, 0, 1, 1, 0, 0 },
						 { 0, 0, 1, 0, 0, 0, 0, 0, 1 },
						 { 0, 1, 0, 0, 1, 0, 1, 0, 0 },
						 { 0, 0, 0, 0, 0, 0, 0, 0, 0 } };


		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("row, col 입력 : ");
			int row = scan.nextInt();
			int column = scan.nextInt();
			int max = mine.length;
			int sum = 0;

			if (mine[row][column] == 1) {
				System.out.println("BOOM!");
				break;
			} else {
				for (int i = row - 1; i < row + 1; i++) {
					for (int k = column - 1; k < column + 1; k++) {
						if (i < 0 || i > max - 1 || k < 0 || k > max) {
							continue;
						}
						sum += mine[i][k];
					}
				}
				System.out.println("=======> " + sum);
			}
		}
	}
}
