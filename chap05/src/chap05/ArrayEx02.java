package chap05;

public class ArrayEx02 {
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		int a = 0;
		for (int i : arr) {
			++a;
			System.out.println("arr["+a+"]:"+i);
			
		}
		System.out.println();
		
		arr = new int[] {100,200,300};
		int b=0;
		for (int i : arr) {
			++b;
			System.out.println("arr["+b+"]:"+i);
		}
		
	}

}
