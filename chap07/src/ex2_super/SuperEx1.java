package ex2_super;
/*
 * super 예약어
 * super() 생성자
 *    --부모클래스의 생성자 호출  . 코드 첫줄에 구현해야함(this와 같음)
 *    -- 부모클래스의 생성자 중 매개변수 없는 생성자가 있다면(기본생성자)
 *        super(); 생략가능
 *    -- 부모클래스의 생성자 중 매개변수 없는 생성자가 없으면 super(부모클래스의 매개변수타입)
 *    으로 호출해야함 . @@생략불가!!
 *
 *super 참조변수 : 부모클래스의 객체를 참조하는 참조변수
 *    
 */
public class SuperEx1 {
	public static void main(String[] args) {
		Child child = new Child();
		child.method();
		
	}

}
