package ex3_Function;

import java.util.function.Function;
import java.util.function.ToIntFunction;

/*
 * Function 계열 인터페이스
 * R applyXXX(T) : 매개변수 존재 , 리턴값 존재
 * 
 * Function<T,R> : R apply(T); 
 * T를넣어 R을반환함
 * 
 * BiFunction<T,U,R> : R apply(T,U);
 * T,U 두가지의 매개변수를 받아 R을 반환
 * 
 * IntFunction<R> : R apply(int)
 * 
 * DoubleFunction<R> : R apply(double)
 * 
 * ToIntFunction<T> : int applyAsInt(T)
 * 
 * ToDoubleFunction<T> : double applyAsDouble(T)
 */
class Student{
	private String name;
	private int eng;
	private int math;
	private String major;
	public Student(String name, int eng, int math, String major) {
		super();
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}
	//getter : 멤버변수값 리턴 String getName() -> nameGet Property
	//setter : 멤버변수값 세팅 void setName(String name)->nameSet property
	public String getName() {
		return name;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public String getMajor() {
		return major;
	}
}
public class FunctionEx1 {
	private static Student[] list = {
			new Student("홍길동", 90, 80, "경영"),
			new Student("김삿갓", 70, 70, "수학"),
			new Student("이몽룡", 80, 60, "통계")
	};
	public static void main(String[] args) {
		System.out.print("학생의이름 : ");
		for (Student s : list) {
			System.out.print(s.getName()+",,");
		}
		System.out.println();
		
		System.out.printf("학생의 이름 :");
		//s는 Student타입이므로 getName호출이가능하며
		//반환값이 String이므로 return getName()!!!
		Function<Student, String> f1 = s->s.getName();
		for (Student s : list) {
			System.out.print(f1.apply(s)+",");
		}
		System.out.println();
		System.out.printf("학생이름 : ");
		//s:Student , return값 : String
		printString(s->s.getName());
		
		
		System.out.println();
		System.out.printf("전공명 : ");
		printString(s->s.getMajor());
		
		//함수변경!!!
		//반환값을 Integer로 변경했다
		System.out.println();
		System.out.printf("수학점수 : ");
		printInt(s->s.getMath());
		
		System.out.println();
		System.out.printf("영어점수 : ");
		//s:Student , return값 : String
		printInt(s->s.getEng());
		
		System.out.println();
		System.out.printf("학생이름(영어점수):");
		printString(s->s.getName()+"("+s.getEng()+")");
		
		System.out.println();
		System.out.print("학생이름(수학점수) : ");
		printString(s->s.getName()+"("+s.getMath()+")");

	}
	static void printString(Function<Student, String> f) {
		for(Student s : list) {
			System.out.print(f.apply(s)+",");
		}
	}
	static void printInt(ToIntFunction<Student> f) {
		for(Student s : list) {
			System.out.print(f.applyAsInt(s)+",");
//			int applyAsInt = f.applyAsInt(s);
		}
	}
}
