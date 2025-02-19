package ex5_constructor;
/*
 * 생성자란 
 * 객체화 시 호출되는 메서드
 * 생성자없는 객체생성은 불가능
 * newNumber1() 객체의 경우 : 기본생성자가 제공이 된다.
 * 생성자의 주요기능 : 인스턴스변수의 초기화 담당
 * 생성자 오버로딩가능(매개변수만 다르게)
 * 
 * 
 */
public class ConstructorEx1 {
	public static void main(String[] args) {
		Number1 n1 = new Number1();
		/*
		 * new 예약어 기능
		 * 1. 메모리할당 힙영역에할당
		 * 2.멤버필드들의 값을 기본값으로 초기화  , 
		 * 명시적으로 초기화된경우 초기화값으로 초기화
		 * 3.생성자 호출 ex) new Number1(); 이건 기본생성자임
		 * 
		 * 생성자를 구현한 경우
		 *  new Number2();는 불가능 --> 하고싶다면 기본생성자를 추가로 작성
		 *   new Number2(int a)로만 호출 가능 
		 *   
		 *   
		 */////////'///////"""""'
		Number2 n2 = new Number2(4); 
		//생성자의매개변수에 int num존재 --> 필수로 int값을 전달해 생성해야함
		System.out.println("n1Num : "+n1.num);
		System.out.println("n2Num : "+n2.num);

	}
}
