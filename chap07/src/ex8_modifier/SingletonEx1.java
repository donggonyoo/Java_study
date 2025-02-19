package ex8_modifier;

import java.time.LocalDate;

/*
 * 생성자의 접근제어자를 private : 객체의 갯수제한
 * 객체의 갯수를 한개만
 */

class SingleObject{
	private static SingleObject obj = new SingleObject();
	private SingleObject() {};//생성자
	//기본생성자 제공 불가 . 생성자에 접근 현재 클래스에서만허용
	int value=100;
	public static SingleObject getObj() {
		return obj;
	}
}
public class SingletonEx1 {
	public static void main(String[] args) {
//		SingleObject o = new SingleObject();
		SingleObject o1 = SingleObject.getObj();
		SingleObject o2 = SingleObject.getObj();
		System.out.println("o1.value : "+o1.value);
		System.out.println("o2.value : "+o2.value);
		o1.value = 200;  //객체는 하나임
		//참조변수를 100개를 만들어도 참조하는 객체는 하나뿐
		System.out.println("== o1.value = 200 실행 후 == ");
		System.out.println("o1.value : "+o1.value);
		System.out.println("o2.value : "+o2.value);
		
//		Math m = new Math(); 객체생성불가능
//		Math클래스의 모든멤버는 Static
		
		
		
	}


}
