package ex7_random;

import java.util.Random;

/*
 * true / false 값 난수발생해 시스템과 사용자중 3번연속 true가 나오는 쪽이 승리
 */
public class Exam1 {
	public static void main(String[] args) {
		Random sy = new Random();
		Random us = new Random();
		sy.setSeed(System.currentTimeMillis());
		int sCount = 0;
		int uCount = 0;
		
		System.out.println("시스템\t\t사용자");
		while(true) {
			boolean sNum = sy.nextBoolean();
			boolean uNum = us.nextBoolean();
			System.out.printf("시스템'%5b' 사용자'%5b'",sNum,uNum);
			System.out.println();

			sCount= (sNum==true? sCount+1 : 0);
			uCount= (uNum==true? uCount+1 : 0);
//			sCount= (sNum ? sCount+1 : 0);
//			uCount= (uNum ? uCount+1 : 0);
//sNUm은 boolean형이므로 true 아니면 false만 나옴
			
			if(sCount==3 && uCount==3) {
				System.out.println("비김");
				break;
			}
			else if(sCount==3) {
				System.out.println("@@시스템승리@@");
				break;
			}
			else if(uCount==3) {
				System.out.println("@@사용자승리@@");
				break;
				
			}
		}
		
	}

}
