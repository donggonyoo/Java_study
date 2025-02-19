package ex6_Wrapper;

/*
 * Wrapper 클래스 : 8개의 기본자료형을 객체화하기위한클래스
 * 기본자료형       Wrapper 클래스
 * boolean           Boolean
 * char              Character
 * byte              Byte
 * short             Short
 * int              Integer
 * long             Long
 * float            Float
 * double          Double
 * 
 * 기본자료형과 참조자료형은 형변환 불가능
 * String str1 = 'A' (X)
 * 예외적으로 기본자료형과 Wrapper 클래스 간의 형변환은 가능
 * 참조형 < = 기본형 : autoBoxing
 * 기본형 < = 참조형 : auto UnBoxing
 */
public class WrapperEx1 {
	public static void main(String[] args) {

		Integer i1 = 100;
		Integer i2 = 100;
		System.out.println(i1==i2);
		System.out.println(100==i1);
		System.out.println(i1.equals(i2));

		//int 정보
		System.out.println("int형의 최댓값 : "+Integer.MAX_VALUE);
		System.out.println("int형의 최소값 : "+Integer.MIN_VALUE);
		System.out.println("int형의 bit 크기 : "+Integer.SIZE);

		//int 정보
		System.out.println("double형의 최댓값 : "+Double.MAX_VALUE);
		System.out.println("double형의 최소값 : "+Double.MIN_VALUE);
		System.out.println("double형의 bit 크기 : "+Double.SIZE);
		
		//정수형 <- 문자열
		//Integer.parseInt(숫자문자열) 
		//Integer.parseInt(숫자문자열,진법) : 해당진법으로 인식해 int형으로 리턴 
		System.out.println(Integer.parseInt("123"));
		System.out.println("\"123\",8 : "+Integer.parseInt("123",8));
		//( 10진수 <- 8)
		System.out.println("\"123\",16 : "+Integer.parseInt("123",16));
		//(10진수 < - 16진수)
		
		System.out.println(Double.parseDouble("123.56"));
		System.out.println(Float.parseFloat("123.56"));

	}

}
