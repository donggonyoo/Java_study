package chap05.exam;

import java.util.Arrays;
import java.util.Scanner;


public class Exam07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("배열의행을 입력 : ");
		int hang = scan.nextInt();
		int[][] arr = new int[hang][];
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i+1];  
			for (int j = 0; j < i+1; j++) {
				arr[i][j] = ++sum; 
			}
			
		}
		
		for (int[] cs : arr) {
			for(int a : cs) {
				System.out.printf("%3d",a);
			}System.out.println();
		}
		
	}

}
