package com.gyuone.exam01;

public class Graph {
	public static void main(String[] args) {
		int ar[] = { 50, 64, 39, 66, 93, 78, 0, 100 };
		char br[][] = new char[10][8];
		for (int i = 0; i < br.length; i++)
			for (int j = 0; j < br[0].length; j++)
				br[i][j] = '.';
		for (int i = 0; i < ar.length; i++) {
			for (int k = 0; k < ar[i] / 10; k++) {
				br[br.length - 1 - k][i] = 'O';
			}
		}
		printArr(br);
	}
	public static void printArr(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.printf("%c ", arr[i][j]);
			}
			System.out.println();
		}
	}
}
//. . . . . . . O
//. . . . O . . O
//. . . . O . . O
//. . . . O O . O
//. O . O O O . O
//O O . O O O . O
//O O . O O O . O
//O O O O O O . O
//O O O O O O . O
//O O O O O O . O