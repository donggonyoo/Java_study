package chap3;

public class OpEx7 {
	/*
	 * String클래스에서 + 연산사용하기
	 * 
	 * 1.+연산자사용가능 : String = String + 기본자료형
	 * 2. 대입연산자로 객체생성이가능한 유일한 클래스 (문자열풀이라는것을 사용해 메모리공간효율up)
	 * String str = "a"; or  String str = new String("a");
	 * 3.문자열에 관련된 다양한 메서드를 멤버로 가짐
	 */
	public static void main(String[] args) {
		System.out.println(1+ 2.5 +3+"값");
		System.out.println(""+1+ 2.5 +3+"값");
		//문자열 => +1 =>  문자열1 => +2.5 ==> 문자열12.5
		System.out.println("값"+1+ 2.5 +3);
		
	
	}

}
