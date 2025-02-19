package chap05;

/*
 * command 라인에서 파라미터받기
 */
public class ArrayEx06 {
	public static void main(String[] args) {
		
		if(args.length ==0) {
			System.out.println("command라인에 파라미터 입력 : ");
			return; //함수종료
		}
		/*
		 * 1.소스코딩 : A.java
		 * 2.컴파일러 : A.class(바이트코드) 생성
		 * 			(생성법) javac A.java
		 * 3.실행 : 인터프리터 
		 * 		-java A 홍길동 김삿갓 == command라인
		 * 		-JVM 환경생성 , 
		 * 		-jvm의 (클래스영역)메서드영역에 a.class 라는 바이트코드 road
		 * 		-main함수 호출 .String[] args  =  command라인에서 입력한 문자열을 배열로 전달
		 *      args 배열 값을 사용할 수 있음.
 		 *  
		 */
		for (String a : args) {
			System.out.println("("+a+")");
		}
	}

}
