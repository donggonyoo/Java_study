package chap8;
/*
 * Lambda2를 이용해
 * 1부터 x까지의 합을 출력하게 만들어보자
 * 
 * interface Lambda2{ 
	void method(int a);
}
 */
public class Exam2 {
	
	private static  void calc2(Lambda2 f , int num) {
		f.method(num);
	}
	
	public static void main(String[] args) {
		Lambda2 f;
		
		f=(x)->{
			int sum=0;
			for (int i = 0; i <= x; i++) {
				sum+= i;
			}
			System.out.println("1부터"+x+"까지의 합 : "+sum);
		};// Lamda2의 메서드를 이렇게 바꾸는거임
		
		calc2(f,10);
		calc2(f, 20);
//----------------------------메서드 동작변경-----------------------------------------------		
		f=(x)->{
			System.out.println(x+"+ 10 = "+(x+10));
		};
		//이  이후에 쓰는 Lambda2의 method
		calc2(f, 10); 
//----------------------------x!값 출력해보자-----------------------------------------------
		f=(x)->{
			int fact=1;
			for(int i = x ; i>=1; i--) {
				fact *= i;
			}
			System.out.println(x+"!  : "+fact);
		};
		calc2(f, 4);
		
	}

}
