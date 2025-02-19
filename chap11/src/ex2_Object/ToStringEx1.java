package ex2_Object;

/*
 * toString() : 객체를 문자열로 바꿔주는 메서드
 * 	Object 구현 : 클래스명@16진수 해쉬코드값 구현
 */

class ToString{
	int value;

	public ToString(int value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {
		return "ToString : [value=" + value + "]";
	}	
}
class NoToString{
	int value;
	
	public NoToString(int value) {
		super();
		this.value = value;
	}
}


public class ToStringEx1 {
	public static void main(String[] args) {
		ToString t1 = new ToString(10);
		System.out.print("toString 구현 : ");
		System.out.println(t1);
	
		NoToString t2 = new NoToString(10);
		System.out.print("toString 구현X : ");
		System.out.println(t2);
		
	
		
		
	}
	

}
