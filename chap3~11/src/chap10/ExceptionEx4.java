package chap10;
/*
 * throws : 예외처리
 * 			예외던지기 , 예외선언
 * 			예외 발생한 메서드에서 발생된 예외를 호출한 메서드로 전달
 * 			--> 호출한 메서드에서 예외 발생
 */
public class ExceptionEx4  {
	public static void main(String[] args) {

		try {
			fisrt();
		} catch (Exception e) {
			System.out.println("main에서 예외 처리");
			System.out.println(e.getMessage());
		
		}
	}

	private static void fisrt() throws Exception {
		second();

	}
	private static void second()  throws Exception {

		System.out.println(Integer.parseInt("abc"));
	}

}
