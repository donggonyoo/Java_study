package ex4_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

class Student{
	private String name;
	private int eng;
	private int math;
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
		return "[name=" + name + ", eng=" + eng + ", math=" + math + "]";
	}

}
public class OperatorEx2 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("유재석", 100, 90),
				new Student("하하", 70, 60),
				new Student("광수", 55, 100));
		System.out.println("영어점수 최고자 : "+minOrMax(list,(a,b)->a.getEng()>b.getEng()?a:b));
		System.out.println("수학점수 최고자 : "+minOrMax(list,(a,b)->a.getMath()>b.getMath()?a:b));
		System.out.println("영어점수 최저자 : "+minOrMax(list,(a,b)->a.getEng()<b.getEng()?a:b));
		System.out.println("수학점수 최저자 : "+minOrMax(list,(a,b)->a.getMath()<b.getMath()?a:b));
		System.out.println("합계점수 최고자 : "+minOrMax(list,(a,b)->a.getMath()+a.getEng()>b.getMath()+b.getEng()?a:b));
		System.out.println("합계점수 최저자 : "+minOrMax(list,(a,b)->a.getMath()+a.getEng()<b.getMath()+b.getEng()?a:b));
		
	}


private static Student minOrMax(List<Student> list,BinaryOperator<Student> f ) {
	Student result =list.get(0);
	for (Student s : list) {
		result = f.apply(result, s);
		}
	return result;
	}

}
