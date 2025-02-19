package ex4_stringbuffer;

/*
 * StringBuffer클래스의 주요메서드
 * sb : abc123Afalse
 */
public class StringBufferEx2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("abc").append(123).append('A').append(false);
		System.out.println("sb : "+sb);//abc123Afalse
		
		sb.delete(2, 4);//2,3번인덱스제거  ab23Afalse
		System.out.println(sb);
		
		sb.deleteCharAt(4);//4번인덱스 제거 delete(4,5)와동일
		//ab23false
		System.out.println(sb);
		
		sb.insert(4, "=="); //4번인덱스에 == 삽입
		//ab23==false
		System.out.println(sb);
		
		System.out.println("sb = new StringBuilder(\"ABCDEFG\");");
		sb = new StringBuilder("ABCDEFG");//sb의 참조값변경
		System.out.println("sb : "+sb);
		
		sb.replace(0, 3, "abc");//012번인덱스 abc로치환
		System.out.println(sb);//abcDEFG
		
		sb.reverse();//역순
		System.out.println("sb.reverse() : "+sb);
		
	}
	

}
