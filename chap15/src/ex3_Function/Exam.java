package ex3_Function;

import java.util.function.DoubleFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class Exam {
	private static Student[] list = {
			new Student("홍길동", 92, 81, "경영"),
			new Student("김삿갓", 72, 72, "수학"),
			new Student("이몽룡", 83, 67, "통계")
	};

	public static void main(String[] args) {
		System.out.println("학생들의 영어점수 합계 : ");
		printTot(s->s.getEng());
		System.out.println("학생들의 수학점수합계");
		printTot(s->s.getMath());//Student타입이며 int로반환되는 값만 넣을수있음
		
		System.out.println("학생들의 영어점수 합계  :"+getTot(s->s.getEng()));
		System.out.println("학생들의 수학점수 합계  :"+getTot(s->s.getMath()));
		System.out.println("학생들의 영어점수 평균  :"+getAvg(s->s.getEng()));
		System.out.println("학생들의 수학점수 평균  :"+getAvg(s->s.getMath()));
	}
	
	private static Double getAvg(ToDoubleFunction<Student> f) {
		double sum=0;
		for(Student s : list) {
			sum+=f.applyAsDouble(s);
		}
		return sum/list.length;
	}

	private static int getTot(ToIntFunction<Student> f) {
		int sum=0;
		for (Student s : list) {
			sum+=f.applyAsInt(s);
		}
		return sum;
	}

	private static void  printTot(ToIntFunction<Student> f ) {
		int sum=0;
		for (Student s : list) {
			sum+=f.applyAsInt(s);
			//밖에서 람다식을 통해 applyAsInt()메서드를 이용가능
			//즉 f.applyAsInt(s)는 무조건Student타입만 받을수있으며
			// s->s.getEng()가 들어온다면 int형으로 반환해준다
			// f.applyAsInt(s) == s.getEng()
		}
		System.out.println(sum);
		
	}
}
