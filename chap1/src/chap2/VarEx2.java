package chap2;

public class VarEx2 {
	/*
	 * 문자형(기본형) : char ==>  1개의 문자만 저장  , 'a' 와 같은 형식
	 * 문자열형(참조자료형) : String => 0개 이상의 문자열 저장 , "aa" 의 형식
	 */ 
	public static void main(String[] args) {
		
//		char c1 = 'ab';   char : 무조건 한개의 문자만 허용
//		char c1_1= '';
		
		char c2 = ' '; //공백은 문자로 허용 
		char c3 = 'a';
		
		String s1= "";//공백없는 문자열도 가능
		String s2= "a";
		String s3= "ab";
		
//		System.out.println("c1 : "+c1);
		System.out.println("c2 : "+c2);
		System.out.println("c3 : "+c3);
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
	}

}
