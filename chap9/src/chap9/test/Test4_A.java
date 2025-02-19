package chap9.test;
/*
 * 
 * LambdaInterface1 인터페이스의 함수 객체와 
 * 인터페이스를 사용한 calc 함수 구현하기
 * [결과]
 * 두수 (5,2)의 합:7
 * 두수 (5,2)의 곱:10
 * arr 배열의 최대값:10
 * arr 배열의 최소값:1
 */
interface LambdaInterface1_A {
	int method(int x, int y);
}
public class Test4_A {
	
	 static int  calc(int x , int y , LambdaInterface1_A f) {
		return f.method(x, y);
	}
	 
	 static int calc(int[] a , LambdaInterface1_A f) {//메서드 오버로딩 (매개변수를 다르게)
		 int minmax = a[0];
		 for (int i : a) {
			minmax = f.method(minmax, i);
		}
		 return minmax;
	 }
	
	public static void main(String[] args) {
		LambdaInterface1_A f;
		
		f=(x,y)-> x+y;	
		System.out.println("두수 (5,2)의 합:" + calc(5,2,f));//7
		
		f=(x,y)-> x*y;	
		System.out.println("두수 (5,2)의 곱:" + calc(5,2,f));//10
		
		int[] arr = {5,8,12,3,1,24,42,14};
		
		f=(x,y)->x>y?x:y;
		System.out.println("arr 배열의 최대값:" + calc(arr,f));//10
		
		f=(x,y)->x<y?x:y;
		System.out.println("arr 배열의 최소값:" + calc(arr,f));//1
	}
}
