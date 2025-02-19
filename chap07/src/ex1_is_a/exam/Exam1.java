package ex1_is_a.exam;

/*
 * Studemt , Person 클래스 구현
 * 
 * Student클래스 : Person을 상속
 * 멤버메서드
 *    void study() : 공부한다 출력
 * 
 * Person 클래스 :
 *    void eat() : 먹는다를 화면에출력 
 *    void sleep() : 잔다를 출력
 */
 

class Person {
	void eat() {
		System.out.println("먹는다");}
	
	void sleep() {
		System.out.println("잔다");}}


class Student extends Person {
	void study() {
		System.out.println("공부한다");
	}}


public class Exam1 {
	public static void main(String[] args) {
		Student st  = new Student();
		System.out.println("Studnet");
		st.eat();
		st.sleep();
		st.study();  
		
		System.out.println();
		System.out.println("Person");
		Person p = new Person();
		p.eat();
		p.sleep();
//		p.study(); 부모는 자식의기능 사용X
		
	}

}
