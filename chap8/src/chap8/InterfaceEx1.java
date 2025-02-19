package chap8;
/*
 * 인터페이스
 * 1.인터페이스의 멤버 :  상수, 추상메서드 defalut메서드 , static메서드만 가능 
 * 2.인터페이스의 멤버의 접근제어자는 모두 public !!(생략해도 public)
 *         상수 :[ public  static  final ]자료형 상수명
 *         추상메서드 : [public abstract ] 리턴타입 메서드명(매개변수목록);
 *         default 메서드 : [public] 구현부 가능한 메서드 인스턴스메서드
 *                        (다중구현 시 메서드명이 같을 떄  구현체에서 필수오버라이딩)
 *         static 메서드 : [public] 구현부 가능한 메서드 클래스메서드
 * 3. 객체화 불가 : 구현클래스의 객체화를 통해서 객체화가능
 * 4. 클래스와 인터페이스는 구현(implements)로표현 , 다중구현 가능.
 * 5. 인터페이스간의 상속(extends)로 표현함 , 다중상속가능
 */

interface Printerable{
	int INK = 100;//상수는 대문자가 관례임
	void print();
	default void sort() {  //default메서드
		System.out.println("정렬페이지 출력");
	}
	static void sort2() {
		System.out.println("정렬페이지2");
	}
}
//----------------------------------------------------------------------------------

interface Scannerable{
	void scan();}

//----------------------------------------------------------------------------------
interface Faxable{
	String FAX_NO = "02-1111-2142";
	void send(String no);
	void receive(String no);
}

//----------------------------------------------------------------------------------

//인터페이스간의 다중상속
interface Complexerable extends Printerable,Scannerable,Faxable{} 

//--------------------------------------------------------------------------------------

//구현클래스 : 인터페이스를 구현한 클래스 (다중구현 가능)
//인터페이스의 추상메서드를 무조건 오버라이딩해서 사용해야함

class Complexer implements Printerable,Scannerable,Faxable,Complexerable{
	//implements Complexerable

	int ink;
	public Complexer() {
		this.ink = INK;
	}

	@Override
	public void print() {
		System.out.println("프린트 합니다  , 남은 잉크량 : "+--ink);
	}

	@Override
	public void scan() {
		System.out.println("이미지 스캔");
	}

	@Override
	public void send(String no) {
		System.out.println(FAX_NO+"에서 "+no+"로 FAX 전송");

	}

	@Override
	public void receive(String no) {
		System.out.println(no+"는 "+FAX_NO+"에게 FAX를 받았어요");

	}

}

//--------------------------------------------------------------------------


public class InterfaceEx1 {

	public static void main(String[] args) {
		//		Printerable.INK = 150; 인터페이스상수 == final

		Complexer c = new Complexer();
		System.out.println("Printerable.INK : "+Printerable.INK);
		System.out.println("Complexerable.INK : "+Complexerable.INK);
		System.out.println("Complexer.INK : "+Complexer.INK);
		System.out.println("Faxable.FAX_NO : "+Faxable.FAX_NO);
		System.out.println("Complexerable.FAX_NO : "+Complexerable.FAX_NO);
		System.out.println("Complexerable.FAX_NO"+Complexer.FAX_NO);
		String num = "010-8248-8421";
		
		c.print();
		c.scan();
		c.send(num);
		c.receive(num);
		System.out.println("복합기 프린트 남은 잉크량 : "+c.ink);
		System.out.println("===");
		
		if(c instanceof Complexerable) {
			System.out.println("@@ c가 참조하고 있는 객체 Complexerable객체 @@");
			Complexerable co = c;
			//인터페이스 <= 구현클래스 형변환 (자동형변환 가능 )
			co.print();
			co.scan();
			co.send(num);
			co.receive(num);
			//System.out.println("복합기 남은 잉크량 : "+co.ink);구현체의 기능을 사용할순없음
			
			
			if(c instanceof Printerable) {
				System.out.println("@@ c가 참조하고 있는 객체 Printerable객체 @@");
				Printerable p = c;
				//인터페이스 <= 구현클래스 형변환 (자동형변환 가능 )
				p.print();
				System.out.println("Printerable.INK : "+Printerable.INK);
//				p.scan(); 자신의멤버가 아님
//				p.send(num);
//				p.receive(num);
				//System.out.println("복합기 남은 잉크량 : "+co.ink);구현체의 기능을 사용할순없음
			}System.out.println("=================");
			
			if(c instanceof Scannerable) {
				System.out.println(" @@ c가 참조하고 있는 객체 Scannerable객체 @@");
				Scannerable s = c;
//				s.print();  //자신의멤버가아님
				s.scan(); 
//				s.send(num);
//				s.receive(num);
				//System.out.println("복합기 남은 잉크량 : "+co.ink);구현체의 기능을 사용할순없음
			}System.out.println("=================");
			
			
			if(c instanceof Faxable) {
				System.out.println("@@ c가 참조하고 있는 객체 Faxable객체 @@");
				Faxable f = c;
//				f.print();  //자신의멤버가아님
//				f.scan(); 
				f.send(num);
				f.receive(num);
				System.out.println("Faxable.FAX_NO"+Faxable.FAX_NO);
				//System.out.println("복합기 남은 잉크량 : "+co.ink);구현체의 기능을 사용할순없음
			}System.out.println("=================");
			
			if(c instanceof Object) {
				System.out.println("@@ c가 참조하고 있는 객체 Object객체 @@");
				Object o = c;
//			    o.print();     //자신의멤버가아님
//			    o.scan(); 
//				o.send(num);
//				o.receive(num);
				//System.out.println("복합기 남은 잉크량 : "+co.ink);구현체의 기능을 사용할순없음
			}System.out.println("=================");
			
			
			
			

		}
	}
}
