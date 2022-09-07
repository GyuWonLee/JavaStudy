package com.gyuone.exam01;

public class kakao {
	public static void main(String[] args) {
		int map1[] = { 46, 33, 33, 22, 31, 50 };
		int map2[] = { 27, 56, 19, 14, 14, 10 };

		char resultMap[][] = new char[6][6];
		int comMap = 0;
		for (int i = 0; i < 6; i++)
		  for (int k = 0; k < 6; k++)
		    resultMap[i][k] = ' ';

		for (int i = 0; i < 6; i++)
		{
		  comMap = map1[i] | map2[i];
		  for (int k = 0; comMap > 0; k++) {
		    if (comMap % 2 != 0)
		      resultMap[i][5 - k] = '#';
		    comMap /= 2;
		  }
		}
        
		printMap(resultMap);
	}
		
		//1. 10 진수 ==> 2진수 변환
		//2. 자바의 bit 연산자
		
	        
		

	public static void printMap(char[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int k = 0; k < map.length; k++) {
				System.out.printf("%c ", map[i][k]);
			}
			System.out.println();
		}
	}
}
