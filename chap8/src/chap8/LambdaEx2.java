package chap8;

/*
 * 추상메서드의 매개변수가있고 리턴타입은 void인경우
 * (매개변수)->{...};
 * 매개변수가 1개인 경우 () 생략가능
 * 실행구문이 1개인경우 {} 생략가능
 */
interface Lambda2 {
	void method(int a);
}

public class LambdaEx2 {
	public static void main(String[] args) {

		Lambda2 l;
		
		l=x->{
			System.out.println(x+" * 3 : "+x*3);
			};
		l.method(4);
		
		
//		l=(x)->{
//			int sum=0;
//			for (int i = 0; i <= x; i++) {
//				sum+= i;
//				System.out.print(i+"+");
//			}
//			System.out.println(" : "+sum);
//			};
//		l.method(7);
		
		calc(l, 5);
	}
	
	private static void calc(Lambda2 f ,int num) {
		f.method(num);
	}
}
