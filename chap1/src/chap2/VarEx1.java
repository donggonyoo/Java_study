package chap2;

public class VarEx1 {
	public static void main(String[] args) {
		boolean a1 = true;
		
		char c1 = '1';
	
		
		byte b1=0;
//		b1=130; 오류발생 byte범위 외  숫자대입 시도
		b1=(byte)256; 
		//범위 외의 숫자를 대입할 일 있다면 캐스팅해야함.
		//-128~127의범위 즉 255개만 들어갈 수 있지만
		//256을 캐스팅 해 넣는다면 0.
		
		short s1=10;
		int i1=20;
		long l1=30;
		
		
		float f1=1.5f;
		double d1 = 2.422;
		
		System.out.println("논리형");
		System.out.println("a1 : "+a1);
		
		System.out.println("문자형");
		System.out.println("c1 : "+c1);
		
		System.out.println("정수형");
		System.out.print("b1 : "+b1);
		System.out.print("\t"+"s1 : "+s1);
		System.out.print("\t"+"i1 : "+i1);
		System.out.println("\t"+"l1 : "+l1);
		
		System.out.println("실수형");
		System.out.println("f1 : "+f1);
		System.out.println("d1 : "+d1);
		
	}

}
