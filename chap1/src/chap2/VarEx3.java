package chap2;

/*
 * 변수의 형변환 : 8개의 기본자료형중 boolean 제외 7가지의 자료형은 서로 형변환가능
 * 논리형(boolean1) 문자형(char2) 정수형(byte1 , short2 , int4 , long8)  실수형(float4 , double8)
 * 
 * 기본자료형의 형변환 
 * 1. 기본자료형 중 boolean을 제외한 7가지의 자료형은 형변환 가능
 * 2. 기본자료형과 참조자료형사이는 형변환X(Wrapper 클래스 예외 (Integer 등))
 * 3.자동형변환(묵시적형변환) : 작은크기 -> 큰크기 (ex . long a = 15; ) 
 * 4. 명시적형변환 : 큰크기 ->작은크기 ( ex. byte a = (byte)123324; )
 */
public class VarEx3 {
	public static void main(String[] args) {
		byte b1 = 10;
		short s1 = 20;
//		b1 = s1;  short(2)-->byte(1) 형변환필요 : (byte)s1
		int i1 = 30;
		long l1 = 40;
		float f1 = /* (float) */i1;//묵시적(자동) 형변환
		double d1 = f1;
		System.out.println("b1 : "+b1);
		System.out.println("s1 : "+s1);
		System.out.println("i1 : "+i1);
		System.out.println("l1 : "+l1);
		System.out.println("f1 =i1 : "+f1);
		System.out.println("d1 =f1 : "+d1);
		
		float  f2 = (float)10.3; //실수형리터럴의 기본값 : double이므로 명시적형변환을 해줘야함
		float f3 = 10.3f;//이 방법도 가능
		
		char c1= (char)b1; //byte , short와 char사이의 형변환은 명시적형변환!
		
		
		
	}

}
