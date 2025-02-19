package chap05;

import java.util.Scanner;

/*
 * 10진수입력받아 2진수로변경
 */
public class ArrayEx04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 ");
		int num = scan.nextInt();
		int divNum=num; //입력받은 num을 담아놓음
		
		int [] two = new int[32];
		int index = 0; 
		//인덱스는 0번부터시작하므로 값을 저장하기위한 인덱스번호
		
		while(divNum>0) {
			two[index++] = divNum % 2;
			//연산 후에 index값이 하나올라감
			divNum /= 2;
		}
		
		System.out.print(num+"의 2진수 : ");
		for (int i =index-1; i >=0; i--) {
			System.out.print(two[i]);
		}
		System.out.println();
		
		/////간단한 방법도있음
		System.out.println(Integer.toBinaryString(num));
	}

}
