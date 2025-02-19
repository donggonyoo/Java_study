package chap8;

abstract class Animal{
	String name;
	Animal(String name){
		this.name = name;
	}
	abstract void eat();//하위 클래스들은 무조건 상속해야하는 메서드
}

//----------------------------------------------------------------------------
interface Flyable {
	void fly();
}
//--------------------------------------------------------------------
class Dove extends Animal implements Flyable {

	Dove() {
		super("비둘기");
	}

	@Override
	public void fly() {
		System.out.println(name+"는 날아다닌다");
	}

	@Override
	void eat() {
		System.out.println(name+"는 벌레를 잡아먹음");
		
	}
}

//----------------------------------------------
class Monkey extends Animal{

	Monkey() {
		super("원숭이");
	}

	@Override
	void eat() {
		System.out.println(name+"는 바나나를 먹는다");	
	}
	 
}
//-----------------------------------------------------
public class Exam1 {
	public static void main(String[] args) {
		Animal a = new Dove();
		a.eat();
		if(a instanceof Flyable) {
			Flyable f = (Flyable)a;
			f.fly();
		}
		//Animal a 가아닌 Dove a 로 참조변수를 만들었다면
		// [ 인터페이스 <== 구현체 ]가 자동형변환 가능했을거임
		System.out.println("=========");
		a =  new Monkey();
		a.eat();
		if(a instanceof Flyable) {
			Flyable f = (Flyable)a;
			f.fly();
		}
		
		
		
	}

}
