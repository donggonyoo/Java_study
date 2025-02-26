package ex4_map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Student{
	String name;
	int eng;
	int math;
	public Student(String name, int eng, int math) {
		super();
		this.name = name;
		this.eng = eng;
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", eng=" + eng + ", math=" + math + "]";
	}
	
	
}
public class Exam1 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동", 90, 80),
				new Student("김삿갓", 95, 80),
				new Student("이몽룡", 95, 80));
		
		//stream이용해 영어점수합 , 수학점수합 , 전체점수합 출력
		
		
		
		
		System.out.print("영어점수합  ");
		IntStream engSum = list.stream().mapToInt(s->s.eng);
		//s: student ->s.eng : s.eng만 사용해 IntStream타입으로만들자
		System.out.println(engSum.sum());
		//eng의 합
		
		System.out.print("수학점수합  ");
		IntStream mathSum = list.stream().mapToInt(s->s.math);
		//s: student ->s.math : s.math만 사용해 IntStream타입으로만들자
		System.out.println(mathSum.sum());
		
		System.out.print("전체점수합  ");
		IntStream totalSum = list.stream().mapToInt(s->s.math+s.eng);
		System.out.println(totalSum.sum());
		
		System.out.println("메서드 참조방식");
		System.out.print("영어점수합 : ");
		System.out.println(list.stream().mapToInt(Student::getEng).sum());
		System.out.print("수학점수합 : ");
		System.out.println(list.stream().mapToInt(Student::getMath).sum());
		
		System.out.print("영어 평균");
		System.out.println(list.stream().mapToInt(s->s.getEng()).average().getAsDouble());
						//double average() : 평균을 구해준다
		// getAsDouble() :  값이없다면 throws
		System.out.print("수학 평균");
		System.out.println(list.stream().mapToInt(s->s.getMath()).average().getAsDouble());
		

	}
}
