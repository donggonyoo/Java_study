package chap3;



public class OpEx3 {
	public static void main(String[] args) {
		
		int x = 10 , y=8;
		
		System.out.println("10+8 : "+(x+y));
		System.out.println("10-8 : "+(x-y));
		System.out.println("10*8 : "+(x*y));
		System.out.println("10/8 : "+((float)x/y)); 
		//둘다정수형이기에 결과도 정수 -> 난 flaot형으로변환시켜 정확히나눔
		System.out.println("10%8 : "+(x%y));
		
		//나누기
		System.out.println();
		System.out.println("10/8 : "+(x/y));
		System.out.println("-10/8 : "+(-x/y));
		System.out.println("10/-8 : "+(x/-y));
		System.out.println("-10/-8 : "+(-x/-y));
		
		//나머지 : 피젯수(앞의숫자) 의 부호 따라감
		System.out.println();
		System.out.println("10%8 : "+(x%y));
		System.out.println("-10%8 : "+(-x%y));
		System.out.println("10%-8 : "+(x%-y));
		System.out.println("-10%-8 : "+(-x%-y));
	
	
	

	}

}
