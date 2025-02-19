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
interface LambdaInterface1 {
	int method(int x, int y);
}
public class Test4 {
	
	 static int  calc(int x , int y , LambdaInterface1 f) {
		return f.method(x, y);
	}
	 
	 static int calc(int[] a , LambdaInterface1 f) {//메서드 오버로딩 (매개변수를 다르게)
		 int max=0,min=0;
		 for (int i = 1; i < a.length; i++) {
			if(a[max]<a[i]) {
				max = i;
			}
			if(a[min]>a[i]) {
				min = i;
			}
		}
		 return f.method(a[max], a[min]);
		 
	 }
	
	public static void main(String[] args) {
		LambdaInterface1 f;
		
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
