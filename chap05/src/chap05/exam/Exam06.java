package chap05.exam;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 배열의행의값을 입력받아 0으로초기화된 배열 출력
 * 
 * [결과]
 * 배열의행을 입력 : 3
 * 0
 * 00
 * 000
 */
public class Exam06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("배열의행을 입력 : ");
		int hang = scan.nextInt();
		int[][] arr = new int[hang][];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i+1];  
			//arr[0] = new int[1]
			//arr[1] =  new int[2] ........
			//만들기만 한다면 0값이 들어가게됨
		}
		
		for (int[] cs : arr) {
			System.out.println(Arrays.toString(cs));
		}
		
	}

}
