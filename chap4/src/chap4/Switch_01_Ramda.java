package chap4;

import java.util.Scanner;

/*
 * switch ( 조건값 ) {
case 값1 :문장1 break;
case 값2: 문장2 break;
default : 문장 break;
}
/ case값 : 대신에 
/ case값 -> 을 쓰면 break;사용하지않아도 됨(한줄이상은 {}필요)

 */
public class Switch_01_Ramda {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i <5; i++) {
			System.out.print("점수입력 : ");
			int score = scan.nextInt();
		
			switch (score/10) {
			case 10,9-> {
				System.out.println("A학점");
				System.out.println("우수");}
			case 8-> {
				System.out.println("B");}
			case 7->{
				System.out.println("C");
				System.out.println("분발");}
			case 6->{ 
				System.out.println("D");
				System.out.println("재수강(선택)");}
			default->{
				System.out.println("F");
				System.out.println("재수강(필수)");}
			}
			System.out.println("============");
		}
	}
}

