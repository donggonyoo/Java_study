package ex2_Object;

import java.util.Objects;

/*
 * hashCode 메서드 : JVM이 객체를 구분하기위한 고유값
 * 		두객체의 해시코드값이 동일한경우는 하나의객체로인식
 * 		물리적으로 같은객체 - 실제로같은객체
 * 		논리적으로 같은객체판단 - 내용기준으로 같은 객체인지 판단할 필요성 있음.
 * 
 * 논리적으로 같은객체판단기준
 * equals 메서드의 결과가참
 * hashCode 메서드값이 같은 경우
 * 
 * 권장사항
 * equals 메서드 오버라이딩을 하는 경우 hashCode메서드와 함꼐 오버라이딩 하기
 */

class HashCode{
	int value;

	public HashCode(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof HashCode) {
			HashCode h = (HashCode)obj;
			return value == h.value;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return value;
	}
	

}



public class HashCodeEx1 {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println("s1 == s2 : "+(s1 == s2));
		System.out.println("s1.equals(s2) : "+s1.equals(s2));
		//논리적인 hashCode()값
		System.out.println("s1.hashCode() : "+s1.hashCode());
		System.out.println("s2.hashCode() : "+s2.hashCode());
		
		//물리적인 hashCode()값
		System.out.println("System.identityHashCode(h2) : "
							+System.identityHashCode(s1));
		
		System.out.println("System.identityHashCode(h2) : "
							+System.identityHashCode(s2));

		HashCode h1 = new HashCode(10);
		HashCode h2 = new HashCode(10);
		System.out.println("h1 == h2 : "+(h1 == h2));
		System.out.println("h1.equals(h2) : "+h1.equals(h2));
		System.out.println("h1.hashCode() : "+h1.hashCode());
		System.out.println("h2.hashCode() : "+h2.hashCode());
		System.out.println("System.identityHashCode(h1) : "+System.identityHashCode(h1));
		System.out.println("System.identityHashCode(h2) : "+System.identityHashCode(h2));


	}

}
