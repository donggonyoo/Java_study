package ex1_field;
/*
 * 클래스변수사용 예제
 */
public class Car2 {
	String color; //색상 , 인스턴스변수 .null로 초기화
	int num;  // 번호 , 인스턴스변수  ,  0으로초기화
	int sno;  // 생성번호 , 인스턴스변수 ,  0으로초기화 
	static int cnt; // 생산 수 , 클래스변수 ,  0으로초기화
	
	
	public String toString() {
		return "자동차번호 :"+sno+"=>"+color+" , "+num+
				", 자동차 생산갯수 : "+cnt;
		
	}

}
