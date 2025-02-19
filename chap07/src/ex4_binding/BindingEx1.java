package ex4_binding;
/*
 * 1 . 자손타입의 객체를 부모타입의 참조변수로 참조가 가능 : 다형성 (반대는 성립X)
 * 2 . 부모타입의 참조변수로 자손타입의 객체를 참조하는경우
 *     같은 멤버인경우 
 *     변수 :  참조변수 타입을 따라감
 *     메서드 : 객체의 최종 오버라이딩 된 메서드
 *
 *3. 모든클래스의 객체는 Object 의 참조변수로 형변환 가능함!! Object o = xx;
 *4. 모든클래스의 객체는 Object 참조변수로 참조가 가능.
 */

class Parent{
	int x = 10;
	void method() {
		System.out.println("Parent 쿨래스의 method");
	}
}

class Child extends Parent{
	int x = 20;
	
	@Override
	void method() {
		super.method();
		System.out.println("Child클래스의 method");
		System.out.println("x = "+x);
		System.out.println("this.x : "+this.x);
		System.out.println("super.x : "+super.x);
	}	
}


public class BindingEx1 {
	public static void main(String[] args) {
		Parent p = new Child(); // 부모는 자식객체 참조가 가능(부모는 자식을 담을 수 있음)
		System.out.println(p.x);//참조변수 타입을 따라감 p == Parent 참조변수
		p.method(); //객체의 오버라이딩 된 메서드를 호출함
	
		
		System.out.println();
		Child c = (Child)p;//자식 <- 부모 (강제형변환 필요)
		System.out.println(c.x);// c == child
		c.method();
		
		Object o = p;//부모 <- 자식  : 자동형변환	
	}
}
