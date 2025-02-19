package chap8.test;

abstract class  Robot2 {
	String name;
	abstract void action();
	Robot2(String name){
		this.name = name;
	}
}
class DanceRobot2 extends Robot2{
	
	DanceRobot2() {
		super("DanceRobot");
	}
	@Override
	 protected void action() {
		// 인터페이스는 오버라이딩 시 무조건 public이지만
		//abstract은 접근제한자를 넓은범위로 만들 수 있음
		
		//부모클래스의 메서드가 default이므로 
		//자식 클래스는 (default),protected , public 가능
		
		System.out.println(name+"은 춤 춘다");
	}
}

class SingRobot2 extends Robot2{
	

	
	SingRobot2() {
		super("SingRobot");
	}
	@Override
	 void action() {
		System.out.println(name+"은 노래부른다");
	}
}

class DrawRobot2 extends  Robot2{

	DrawRobot2() {
		super("DrawRobot");
		// TODO Auto-generated constructor stub
	}

	@Override
	 void action() {
		System.out.println(name+"은 그림그린다");
	}
}


public class Test3_2 {
	public static void main(String[] args) {
		Robot2[] robot = new Robot2[3];
		robot[0] = new DanceRobot2();
		robot[1] = new SingRobot2();
		robot[2] = new DrawRobot2();
		for(Robot2 r : robot) {
			r.action(); 
		}
	}
}
