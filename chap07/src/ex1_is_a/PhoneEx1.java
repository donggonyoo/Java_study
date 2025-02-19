package ex1_is_a;
/*
 *
 * 1. 자손클래스의 객체생성은 부모클래스의 객체부터 생성함.
 * 2. 클래스간의 상속은 단일상속만 가능 자식[클래스extend부모클래스1 , 부모클래스2 X]
 * ex) 자식1 extends 부모    o
 * 	   자식2 extends 부모    o
 * 	   자식3 extneds 자식2   o
 * 3. 모든 클래스의 부모클래스가 존재 (Object)
 */
public class PhoneEx1 /* extends Object */{
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.power();
		sp.send();
		sp.receive();
		sp.setApp("카카오");	
	}

}
