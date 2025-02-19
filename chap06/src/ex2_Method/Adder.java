package ex2_Method;

/*
 * 멤버 메서드( 함수 )
 * 
 * 구성요소
 * [접근제어자][제어자] 리턴타입 메서드이름 (매개변수) : 선언부
 * { 	...	  return 값;	} :                  : 구현부(알고리즘 구성)
 * 
 * 리턴타입 : 메서드 종료 후 전달되는 값의 자료형
 * 			void : 리턴값X(전달값X)
 * 
 * 메서드이름 : 식별자
 * 
 * 매개변수목록 : 메서드호출 시 메서드에 전달될 값의 자료형과 변수명 설정
 * 			 전달값이 없는경우 ( ) 표현 
 * 
 * return : 메서드종료
 * 			return 타입 void의 경우 : 생략.
 * 								    메서드의마지막블록이 끝나면 메서드종료인식
 * 			
 * 			return타입 void가 아닌 경우 :  생략불가
 * 										return 리턴값;	
 * 										return값의 자료형은 리턴타입과 같거나 자동형변환 되어야함
 * 
 */
public class Adder {
	// int값 2개 입력받아 int값 return하는메서드
	int add1(int a, int b) {
		return a+b; //리턴값과 리턴타입의 자료형동일
	}
	
	// int값 2개 입력받아 long값 return하는메서드
	long add2(int a, int b) {
		return a+b; //리턴값을 리턴타입으로 자동형변환 가능
	}

	// int값 2개 입력받아 화면에출력하는 메서드(리턴없이)
	void add3(int a, int b) {
		System.out.println("a+b : "+a+b);//return 생략
		return; // 사용해도 무관
	}
	
	

}
