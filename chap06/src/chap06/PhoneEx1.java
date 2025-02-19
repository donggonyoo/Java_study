package chap06;
/*
 * 클래스 예제
 * 
 * 클래스 : 사용자정의자료형
 * 속성 ㅣ 멤버변수 , 필드
 * 기능 : 멤버 메서드 , 멤버함수
 */
class phone {
	String color; //색상, 멤버변수 , 필드
	boolean power;//전원
	String no; //번호

	//멤버 메서드
void power() {//전원켜기
	power = !power;
}

void send(String no) {
	System.out.println(no+"로 전화거는중");
}
void recevie(String no) {
	System.out.println(no+"에서 전화받는 중");
}

}

//구동클래스 : main메서드를 포함한 public클래스
public class PhoneEx1 {
	public static void main(String[] args) {
		phone p1 = new phone(); 
		//객체화(인스턴스화)--> 메모리할당.객체생성
		/*
		 * new : 객체화 기능
		 * 1. 힙영역에 메모리할당 (객체생성)
		 * 2.멤버변수(필드)를 기본값으로 초기화
		 * 3.생성자호출 
		 */
		
		p1.color = "검정";
		p1.power = true;
		p1.no = "010-1234-7892";
		System.out.println(p1.color+", "+p1.power+", "+p1.no);
		
		
		phone p2 = new phone();
		p2.color = "파랑";
		p2.power = true;
		p2.no = "010-4321-7792";
		System.out.println(p2.color+", "+p2.power+", "+p2.no);
		
		p1.send(p2.no);
		p2.recevie(p1.no);
		
		
		System.out.println("p1의 주소값을 p2가 사용");
		System.out.println("p2 = p1 ");
		p2=p1;
		System.out.println(p1.color+", "+p1.power+", "+p1.no);
		System.out.println(p2.color+", "+p2.power+", "+p2.no);
		
		System.out.println("p1.color change");
		p1.color = "빨강빨강";
		//p1의 객체의 필드가 변경되면
		//같은 객체주소를 참조하고있는 p2 도 바뀌게 됨.
		System.out.println(p1.color+", "+p1.power+", "+p1.no);
		System.out.println(p2.color+", "+p2.power+", "+p2.no);
		

	}
}

