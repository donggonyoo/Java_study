package ex2_super;

public class Child extends Parent {

	int x = 20;
	public Child() {
		
		super(100); 
		//부모의 생성자는 무조건 호출해야함
		//(매개변수가없는)기본생성자일 경우는 선언 생략해도 자동출력
		//super(); 자동호출
	}
	
	void method() {
		int x = 30;
		System.out.println("x = "+x);
		System.out.println("this.x : "+this.x);
		System.out.println("super.x : "+ super.x);
	}

}
