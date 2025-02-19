package chap05.exam;


import java.util.Scanner;

public class Exam08 {
	/*     
	 *      1열  
	 * 	1행	55
  			54  53
  			52  51  50
  			49  48  47  46
  			45  44  43  42  41
  			40  39  38  37  36  35
  			34  33  32  31  30  29  28
  			27  26  25  24  23  22  21  20
  			19  18  17  16  15  14  13  12  11
  			10   9   8   7   6   5   4   3   2   1

	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("높이를 입력하세요 : ");
		int hang = scan.nextInt();
		int sum=0;
		//1. 가변배열생성
		int[][] a = new int[hang][];
		
		for (int c = 1; c <= hang; c++) {
			sum+=c;
		}
		//2 각 행의 1차원 배열의 객체생성
		for (int i = 0; i < a.length; i++) {
			a[i] = new int[i+1];
		
			for (int j = 0; j < i+1; j++) {
				//3.arr배열에 숫자 넣기
				a[i][j] = sum--;	
			}
		}
		
		for (int[] is : a) {
			for(int b : is) {
				System.out.printf("%4d",b);
			}System.out.println();
		}
		
		
	}

}
