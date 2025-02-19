package ex2_Method;

public class AdderMain1 {
	public static void main(String[] args) {
		Adder a1 = new Adder();
		
		int add1 = a1.add1(1, 2);
		//선언부에 맞는 변수로반환
		//(자동형변환이 가능한 변수는 사용가능) byte short
		
		float add2 = a1.add2(44, 23);
		//선언부 타입에 맞지않는 변수 넣기도 금지
		//float , double 등으로  반환 가능(자동형변환가능)
	
		System.out.println(add1);
		System.out.println(add2);
		a1.add3(78, 424);
		
	}

}
