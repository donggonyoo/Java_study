package chap06.exam;

class Calc{
	int num1;
	int num2;
	
	 void  minus() {
		System.out.println("num1-num2 : "+(num1-num2));
	}
	
	 void  plus() {
		System.out.println("num1+num2 : "+(num1+num2));
	}
	public String toString() {
		return "num1 : "+num1+", num2 : "+num2;
	}
	
}
public class Exam02 {

	public static void main(String[] args) {
		Calc c = new Calc();
		c.num1 = 10;
		c.num2 = 15;
		c.minus(); // -5
		c.plus(); // 25
		
		System.out.println(c);//toString사용해서 입력값들을 뽑아보자
		
	}

}
