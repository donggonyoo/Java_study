package ex1_equals;

class Number{
	int num;

	public Number(int num) {
		super();
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Number) {
			Number n = (Number)obj;
			return n.num == num;
		}
		else {
			return false;
		}
	}
}

public class Exam1 {
	public static void main(String[] args) {
		Number n1 = new Number(10);
		Number n2 = new Number(10);
		
		if(n1==n2) {
			System.out.println("같은객체");
		}
		else {
			System.out.println("다른객체");
		}
		
		if(n1.equals(n2)) {
			System.out.println("같은 내용");
			System.out.println("n1.num : "+n1.num);
			System.out.println("n2.num : "+n2.num);
		}
		else {
			System.out.println("다른 내용");
		}
		
		
	}

}
