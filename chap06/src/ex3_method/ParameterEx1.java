package ex3_method;
/*
 * 매개변수 예제
 */
class Value{
	int val;
}

public class ParameterEx1 {
	public static void main(String[] args) {
		Value v = new Value();
		v.val = 100;
		System.out.println("원본 : "+v.val+"\n");
		change1(v.val);
		System.out.println("change1 이후 : "+v.val);
		System.out.println();
		change2(v);
		System.out.println("change2 이후 : "+v.val);
		
	}
	private static void change1(int val) {
		val +=100;
		System.out.println("change1() : "+val);
	}
	//호출 후 사라짐 단순히 값만 받으므로
	//종료와동시에 사라지는메서드
	
	private static void change2(Value v) {
		v.val +=200;
		System.out.println("change2() : "+v.val);
	}//이 메서드는 참조값을 받으므로
	//v 인스턴스를 참조하고있음.
	//여기서의 값 변경은 인스턴스값 자체를 바꾸는것임

}
