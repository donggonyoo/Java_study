package chap4.hardEx;
/*
   시스템과 주사위 숫자 비교하기
   시스템의 주사위 값을 저장하고,
   사용자의 주사위 값도 임의의값으로  시스템의 값과 비교하여, 
   시스템의 주사위 값이 크면 시스템 승리
   사용자의 주사위 값이 크면 사용자 승리
   시스템과 사용자의 주사위값이 같으면 동점입니다.
   [결과]
   시스템 주사위값 :3,사용자 주사위값:5=>사용자 승리.   
 */

public class Test04 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			int sys = (int)(Math.random()*6)+1;
			int user = (int)(Math.random()*6)+1;
			System.out.println("=="+i+"번쨰 판===");
			System.out.println("시스템 : "+sys);
			System.out.println("유저 : "+user);

			if(sys>user) {
				System.out.println("시스템 승리");
			}
			else if(sys==user) {
				System.out.println("동점");
			}
			else {
				System.out.println("유저 승리");
			}
			
		}
	}
}
