package chap3;

public class OpEx4 {
	/*
	 * 관계연산자 : ==,!= ,<, >,<= ,>=  :  결과가 boolean
	 * 논리연산자 : && , || --> boolean && boolean :  boolean
	 *  @@ &&(AND)가 ||(OR) 보다 우선순위가 높음
	 *   ^(XOR) 하나만 참이면 참
	 */
	
	public static void main(String[] args) {
		int x = 1, y=1;
		System.out.println("1==1 : "+( x==y ));
		System.out.println("1 != 1 : "+( x!=y ));
		System.out.println("1 < 1 : "+( x<y ));
		System.out.println("1 > 1 : "+( x>y ));
		System.out.println("1 <= 1 : "+( x<=y ));
		System.out.println("1 >= 1 : "+( x>=y ));
		
		//논리연산자 ( AND , OR )
		System.out.println("x==1 && y==2 : "+(x==1 && y==2)); //false (하나라도 거짓이면 거짓)
		System.out.println("x==1 || y==2 : "+(x==1 || y==2)); //true (하나라도 참이면 참)
		System.out.println("x==1 ^ y==2 : "+(x==1 ^ y==2)); //true (하나만 참이여야함)
		System.out.println("x==1 ^ y!=2 : "+(x==1 ^ y!=2)); // T^T :  false

		
		
		
		
	}

}
