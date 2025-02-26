package ex5_Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoublePredicate;
import java.util.function.DoubleUnaryOperator;import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/*
 * Predicate 인터페이스
 * 	boolean test(T) : 매개변수존재, 리턴타입은 boolean
 * 
 * Predicate<T> : boolean test(T)
 * IntPredicate : boolean test(int)
 * LongPredicate : boolean test(long)
 * DoublePredicate : boolean test(double)
 */

class Student{
	private String name;
	private String gendar;
	private int eng;
	private int math;
	public Student(String name, String gendar, int eng, int math) {
		super();
		this.name = name;
		this.gendar = gendar;
		this.eng = eng;
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public String getGendar() {
		return gendar;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	@Override
	public String toString() {
		return  "["+name + ", gendar=" + gendar + ", eng=" + eng + ", math=" + math + "]";
	}
	
	
}
public class PredicateEx1 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("유재석", "남", 89, 99),
				new Student("유나", "여", 56, 78),
				new Student("원영", "여", 100, 100),
				new Student("이술인", "남", 55, 50));
		System.out.println("영어점수가 60이상인 학생의 영어평균 : "+avg(list,s->s.getEng()>=60));
		
		System.out.println("영어점수가 60이상인 학생의 영어평균 : "+
		avg(list,s->{
			return s.getEng()>=60;}));
		System.out.println("영어점수60이상의평균(ToDoubleFunction활용) : "+avgFun(list, s->{
			return s.getEng();
		}));
		System.out.println("수학점수60이상의평균(ToDoubleFunction활용) : "+avgFun(list, s->{
			return s.getMath();
		}));
		
		System.out.println("여학생 영어평균 : "+avg(list,s->s.getGendar().equals("여")));
		System.out.println("남학생 영어평균 : "+avg(list,s->s.getGendar().equals("남")));
		
	}

	private static double avg(List<Student>list, Predicate<Student> p) {
							//p : s.getEng() >=60
		double sum=0;
		int count=0;
		for (Student s : list) {
			//
			if(p.test(s)) {
				//f.test(s) : s.getEng() >=60 인경우에만 true
				sum+=s.getEng();
				count++;//60점이상의경우에만 count를올려줌
			}
		}
		return sum/count;
	}
	
	private static double avgFun(List<Student> list ,ToDoubleFunction<Student>f ) {
		double sum=0;
		int count=0;
		for (Student s : list) {
			if(s.getEng()>=60) {
			sum+= f.applyAsDouble(s);
			count++;
			}
		}return sum/count;
	}
}
