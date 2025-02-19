package chap3.test;

import java.util.Scanner;

public class Ex4 {

	/*
	 * 가로세로값을 입력받아 직사각형의 넓이와둘레,정사각형여부판단
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.print("가로를 입력(0누르면종료) : ");
		int width = scan.nextInt();
		if(width!=0) {
		System.out.print("세로를 입력 : ");
		int height = scan.nextInt();
		
		
		System.out.println("넓이 : "+width*height);
		System.out.println("둘레 : "+ 2*(width+height));
		System.out.println((width==height)?"정사각형":"직사각형");
		}
		else {
			break;
		}
		}
		
	}
}
