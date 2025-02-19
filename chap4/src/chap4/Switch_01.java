package chap4;

import java.util.Scanner;

/*
 * switch ( 조건값 ) {
case 값1 :문장1 break;
case 값2: 문장2 break;
default : 문장 break;
}

 */
public class Switch_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i <5; i++) {
			System.out.print("점수입력 : ");
			int score = scan.nextInt();
			
			switch (score/10) {
			case 10: // 10에는 break; 문도 없으므로 밑으로 한칸 내려감
			case 9: 
				System.out.println("A학점");break;
			case 8: 
				System.out.println("B");break;
			case 7:
				System.out.println("C");break;

			case 6:
				System.out.println("D");break;
			default: //모두 아니면 실행
				System.out.println("F");
			}

			switch (score/10) {
			case 10:
			case 9:
			case 8:
			case 7:
			case 6:System.out.println("PASS");
			break;

			default:System.out.println("FAIL");
			break;
			}
			System.out.println("============");
		}
	}
}

