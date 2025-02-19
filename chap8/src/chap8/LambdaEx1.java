package chap8;

/*
 * 람다식 예제
 * 함수적 인터페이스(FunctionalInterface) : 인터페이스의 추상메서드가 한개인 인터페이스
 * 함수적 인터페이스만 람다방식으로사용가능
 * 
 * 추상메서드가 매개변수 , 리턴타입이 없는경우의 예제
 * fi = () ->{...};
 * 내부의 문장이 하나인경우는 {} 생략가능
 * fi = ()->...
 */

@FunctionalInterface    //함수적 인터페이스로 설정하므로 추상메서드가 1개여야함을 표시
interface LambdaInterface1{
	void method(); //매개변수 없고 리턴타입도 없는경우
//	void method2();
}
//-------------------------------------------------------------------
public class LambdaEx1 {
	
	public static void main(String[] args) {
		LambdaInterface1 f1;
		
//-------------------------------------------------------------------
		// 0. 익명클래스 이용
		
		f1=new LambdaInterface1() {
			
			@Override
			public void method() {
				System.out.println("기존의 내부객체로 생성함");
			}
		};f1.method();
	
//-------------------------------------------------------------------	-------	
		//1.람다식으로 변경
		
		f1 = ()->{
			String str = "람다방식 1 ";
			System.out.println(str);
		};f1.method();
		
//-------------------------------------------------------------------	-------			
		
		//2.람다방식 : 내부 문장이 한개인경우 {} 생략가능
		
		f1 = ()-> System.out.println("람다방식 2 ");
		f1.method();
		
//-------------------------------------------------------------------	-------	
		//3. LambdaInterface1 인터페이스를 매개변수로받는 static메서드로 람다방식이용
		
		execute(()->System.out.println("excute메서드에서 호출함"));
		
		//execute 함수 이용해 1~100까지의 합 출력
		execute(()->{
			System.out.print("1에서100까지의 합 : ");
			int num =100;
			int sum=0;
			for (int i = 1; i <= num; i++) {
				sum+=i;
			}
			System.out.println(sum);
		});
		
		//excute 함수를 이용해 1~100까지의 짝수합 출력해보기
		execute(()->{
			System.out.print("1에서100까지의 짝수 합 : ");
			int num =100;
			int sum=0;
			for (int i = 1; i <= num; i++) {
				if(i%2==0) {
					sum+=i;
				}
			}
			System.out.println(sum);
			
			
		});
		
	}
	
	public static void execute(LambdaInterface1 l) {
		System.out.println("excute 시작");
		l.method();
		System.out.println("excute 종료");
	}

}
