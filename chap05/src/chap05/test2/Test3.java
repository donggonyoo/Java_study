package chap05.test2;

import java.util.Arrays;

/*
 * int[][] score = {
				{90,80,70},
				{95,85,75},
				{70,80,75},
				{75,70,85},
				{70,75,80}
		}; 
 * score 배열보다 가로 세로가 1씩 더큰 배열 result 배열 생성하기.
 * score 배열의 내용을 result에 저장하고,
 * 각 추가된 행과 열에는 각 행과 열의 합을 저장하고, result 배열의 내용 출력하기
 * 
 * [결과]
   90   80   70  240           [5][0] === 00 10 20 30 40 (총 5개)
   95   85   75  255
   70   80   75  225
   75   70   85  230
   70   75   80  225
  400  390  385 1175
 */

public class Test3 {

	public static void main(String[] args) {
		int[][] score = {
				{90,80,70},
				{95,85,75},
				{70,80,75},
				{75,70,85},
				{70,75,80}
		}; 
		int a =  score.length; //행
		int b= score[0].length; //열
		int[][] result = new int[a+1][b+1];
		//result배열의크기 : score배열의 행 , 열 1씩 큰 배열
		
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				result[i][j] = score[i][j];
				result[i][b] += score[i][j];// 하나의 행의 열 합을 저장  (가로의 합)
				result[a][j] += score[i][j]; // 하나의 열의 행 합을 저장( 세로의 합)
				//result[a][0] += score[0][0] + score[1][0] +....score[score.length][0]
				//result[a][1] += score[0][1] + score[1][1] +....score[score.length][1]
				
				
			}
			result[a][b] += result[i][b]; // 마지막 열의 합을 모두 더한값 저장 (세로의 합)
		}
		
		for (int[] is : result) {
			System.out.println(Arrays.toString(is));
		}System.out.println();
		
		
	}

}
