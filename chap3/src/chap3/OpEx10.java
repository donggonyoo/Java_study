package chap3;

public class OpEx10 {
	/*
	 * 비트이동연산자
	 * >>n : n 만큼 오른쪽으로 이동 왼쪽비트는 부호비트로채움
	 * <<n : n만큼 왼쪽으로 이동 n비트  0으로채움
	 * >>>n : n만큼 오른쪽으로 비트이동 n비트는 0으로
	 */
	public static void main(String[] args) {
		System.out.println("8>>2 : "+(8>>2));
		System.out.println("8 << 2 : "+(8<<2));
		System.out.println("8 >>> 2 : "+(8>>2));
		
		System.out.println("-8 >> 2 : "+(-8>>2));
		System.out.println("-8 << 2 : "+(-8<<2));
		System.out.println("-8 >>> 2 : "+(-8>>>2));
		
	}
	//8 : 0000 1000
	//-8 :1111 1000
	// -8>>2 :  1111 0010  : -2
	//-8 <<2 : 11100000  :  -32
	//-8>>> 2 
	
	
	

}
