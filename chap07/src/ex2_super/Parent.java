package ex2_super;

public class Parent {
	int x=10;
	
	public Parent(int x) {
		this.x=x;
	}
//	Parent(){} 매개변수없는 생성자를 만들어준다면
	//자식클래스에서 부모의 생성자를 굳이 호출하지않아도
	///자동으로 기본생성자를 호출하게됨
}
