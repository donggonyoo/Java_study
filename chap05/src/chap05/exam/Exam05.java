package chap05.exam;

import java.util.Arrays;

/*
 * 2차원배열 행의합과 열의 합을 출력
 */
public class Exam05 {
	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		arr[0][0] = 10;arr[0][1] = 20;
		arr[1][0] = 30;arr[1][1] = 40;
		arr[2][0] = 50;arr[2][1] = 60;
	

		
		arr[1] = new int[] {100,200,300};
		
		for (int[] is : arr) {
			System.out.println(Arrays.toString(is));
		}
		for (int i = 0; i < arr.length; i++) {
			int sum1=0;

			for (int j = 0; j <arr[i].length; j++) {
				sum1+=arr[i][j];
			}System.out.println(i+"행의 합 "+sum1);
		}

		System.out.println("열의합 =====");
		int maxlen = 0;
		
		//열의 최댓값추출
		for (int i = 0; i < arr.length; i++) {
			if(maxlen < arr[i].length) {
				maxlen = arr[i].length;
			}
		}
		
		//여기서는 maxlen이 3이므로 크기 3의 배열이만들어짐
		int col[] =new int[maxlen];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <arr[i].length; j++) {
				col[j]+=arr[i][j];
				//col[0] = arr[0][0] + arr[1][0]
				//col[1] = arr[0][1] + arr[1][1]
				//col[2] = arr[0][2] + arr[1][2]
			}
			
			
		}
		for (int i = 0; i < col.length; i++) {
			System.out.println(i+"열의 합 : "+col[i]);
		}
	}
}
