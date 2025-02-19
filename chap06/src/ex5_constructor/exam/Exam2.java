package ex5_constructor.exam;

/*
 * EastCar클래스
 * 멤버변수 int number
 * boolean isKwang
 * 
 * 멤버메서드
 * toString()
 * 
 */
public class Exam2 {

	public static void main(String[] args) {
		EastCard c1 = new EastCard(3,false);
		EastCard c2 = new EastCard();
		System.out.println(c1);//3
		System.out.println(c2);//1K
	}
}
