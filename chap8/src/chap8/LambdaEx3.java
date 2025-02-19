package chap8;
/*
 * 매개변수와 리턴값 모두 있는 경우
 * 매개변수의 갯수가 한개인경우 () 생략가능
 * {} 내부에 문장이 한개인경우 {} return 생략가능
 */
interface LamdaInterface3{
	int method(int x, int y);
}
public class LambdaEx3 {
	public static void main(String[] args) {
		LamdaInterface3 f = (x,y)->{
			return x+y;
			};
		
		System.out.println("두수의 합 : "+f.method(2, 5));
		
		f=(x,y) -> x + y;
		System.out.println("두수의합 : "+f.method(2, 3));
		
		f=(x,y) -> x * y;
		System.out.println("두수의 곱 : "+f.method(10, 2));
		
		f=(x,y) -> x / y;
		System.out.println("두수의 몫 : "+f.method(240, 2));

		f=(x,y) -> x & y;
		System.out.println("두수의 나머지 : "+f.method(10, 4));
		
		f=(x,y) -> {
			if(x>y) {return x;}
			else {return y;}
		};
		System.out.println("두수 중 큰 수: "+f.method(10, 4));
		
		f=(x,y)->(x<y)?x:y;
		System.out.println("두수 중 작은 수: "+f.method(10, 4));
	}

}
