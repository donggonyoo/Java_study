package chap05.exam;

import java.util.Scanner;

/*
 * 10진수를 입력받아 8진수로 변경해보자
 */
public class Exam02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("10 진수 --> 8 진수");
		System.out.print("정수를 입력하세요 ");
		int num = scan.nextInt();
		int divNum=num; 
		//입력받은 num을 담아놓음

		int [] octal = new int[32];
		int index = 0; 
		//인덱스는 0번부터시작하므로 값을 저장하기위한 인덱스번호

		while(divNum>0) {
			octal[index++] = divNum % 8;
			//2진수는 2의나머지를 저장하지만
			//8진수는 8로나눈 나머지를 저장함
			//연산 후에 index값이 하나올라감
			divNum /= 8;
		}

		System.out.print(num+" 의 8진수 : ");
		for (int i =index-1; i >=0; i--) {
			System.out.print(octal[i]);
		}
		System.out.println();
		
		System.out.println(Integer.toOctalString(num));
	}

}
