package ex1_field;

/*
 * 지역변수는 반드시 초기화되어야함
 * 매개변수는 지역변수임
 */
public class Main2 {
	public static void main(String[] args) {
		int num;
		//		System.out.println(num);//지역변수num은 초기화해야함

		boolean b = true;
		if(b) {num=100;}
		//		System.out.println(num);초기화 되지 않을 가능성 있으므로 오류


		if(b) { num=100; }
		else {num=20;}
		System.out.println("num : "+num);

		String grade=null;
		int score=80;

		if(score>=90) {
			grade = "A";
		}
		else if(score >=80) {
			grade = "B";
		}
		else if(score >=70) {
			grade = "C";}
		System.out.println(grade+"학점");

		/* 해결법 1) grade를 초기화한다(null)
		 *   	2) else문을 추가한다
		 */

		switch(score/10) {
		case 9-> grade="A";
		case 8-> grade="B";
		case 7-> grade="C";
		default-> grade="F";
		}System.out.println(grade+"학점");
	}
}
