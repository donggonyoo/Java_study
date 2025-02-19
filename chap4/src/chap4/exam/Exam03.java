package chap4.exam;

import java.util.Random;
import java.util.Scanner;

/*
 * 1,2,3 중 한개의임의의값을 생성해
 * 1.가위
 * 2.바위
 * 3.보자기
 * 출력
 * 
 * 시스템 사용자
 * 1      1      비김
 * 1       2     사용자 이김
 * 1       3     시스템 승
 */

public class Exam03 {
	public static void main(String[] args) {
		//가위바위보 문자열 저장변수
		
		for (int i = 0; i < 5; i++) {
			String a=null,b=null;
			int sNum = new Random().nextInt(3) + 1 ;
			//1~3의 랜덤한수
			switch (sNum) {
			case 1-> a="가위";
			case 2-> a="바위";
			default-> a="보자기";}

			//사용자입력부분
			Scanner scan = new Scanner(System.in);
			System.out.print("가위(1),바위(2),보(3) 입력 : ");
			int my = scan.nextInt();
			switch (my) {
			case 1-> b="가위";
			case 2-> b="바위";
			default-> b="보자기";}

			//출력화면 "\t"==tab
			System.out.println("시스템\t사용자");
			System.out.println("("+a+")"+"\t"+"("+b+")");
			if(	sNum==1 && my==2 
					|| sNum==2 && my==3 
					||sNum==3 && my==1) {
				System.out.println("나 승리");}
			else if(sNum==my){
				System.out.println("동점");}
			else {
				System.out.println("시스템 승리");
			}
			System.out.println("=======");
		}
	}
}


