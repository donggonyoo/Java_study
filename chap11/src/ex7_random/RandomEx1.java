package ex7_random;

import java.util.Random;

/*
 * Random 클래스 : 난수 발생 클래스
 * 1.seed 값 설정 기능
 * 2. 자료형 별로 난수 발생
 *    nextInt() : 정수형 난수
 *    nextInt(n) : 정수형 난수(0 <= x < n )
 *    nextDouble() : 실수형 난수  0 <= x < 1.0
 *    nextBoolean() : true / false 
 *    
 */
public class RandomEx1 {
	public static void main(String[] args) {
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		/*
		 * System.currentTimeMillis() :
		 * 1970년부터 지금까지의시간을 밀리초로 리턴
		 * 
		 */
		
		for(int i = 0 ; i<5 ; i++) {
			System.out.println(i+" : "+random.nextInt(100));
		}
		System.out.println("=================");
		
		Random random2 = new Random();
//		random2.setSeed(2);
		//시드 고정(다시실행해도 바뀌지않는다)
		for(int i = 0 ; i<5 ; i++) {
			System.out.println(i+" : "+random2.nextInt(100));
		}
		
		//true/false 난수 발생시키기
		for (int i = 0; i <5 ; i++) {
			System.out.println(i+":"+random2.nextBoolean());
			
		}
		
		
	}

}
