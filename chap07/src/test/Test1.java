package test;
/*
 * 다음의 결과가 나오도록 Student 클래스 구현하기
 * [결과]
      학번:1
      이름:홍길동
      국어:0
      영어:0
      수학:0
      총점:0
      평균:0.0
   =====================
      학번:2
      이름:김삿갓
      국어:80
      영어:90
      수학:70
      총점:240
      평균:80.0
=====================
 */
class Student{
	private int no;
	private String name;
	private int kr;
	private int en;
	private int mt;
	
	public Student(String name , int no) {
		this.name = name;
		this.no =no;	
	}
	
	public Student(String name, int no, int kr, int en, int mt) {
		this(name , no);
		this.kr = kr;
		this.en = en;
		this.mt = mt;
		
	}

	int sum() {
		return kr+en+mt;}
	
	double avg() {
		return (double)sum()/3;}

	public void info() {
		System.out.println("학번 : "+no+
	"\n이름 : "+name+
	"\n국어 : "+kr+
	"\n영어 : "+en+
	"\n수학 : "+mt+
	"\n총점 : "+sum()+
	"\n평균 : "+avg()+"\n");
	}
	
}
public class Test1 {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1);
		s.info();
		Student s2 = new Student("김삿갓", 2, 80, 90, 70);
		s2.info();
	}
}
