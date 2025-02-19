package chap4.exam;


import java.util.Scanner;

/*
 * 삼각형의 높이를 입력받아 *로 삼각형출력
 */
public class Exam07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("삼각형의 높이 입력 : ");
		int nextInt = scan.nextInt();
		Exam07_Triangle print = new Exam07_Triangle();
		print.basic(nextInt);
		print.reverse(nextInt);
		print.emptyPrint(nextInt);
		print.emptyReverse(nextInt);
		}
	}


