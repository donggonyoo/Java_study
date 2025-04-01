package chap05.test2;

import java.util.Arrays;

/*
  Command 라인에서 숫자를 입력받아 숫자의 약수를 출력하기
  int num = Integer.parseInt(args[0]);
  [결과]
  10의 약수 : 1,2,5,10,
 */
public class Test1 {
	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("Command라인에 파라미터 입력 ");
			return;
		}
		
		
		System.out.println(Arrays.toString(args));
		int int1 = Integer.parseInt(args[0]);
		System.out.print(int1+"의 약수 : ");
		for (int i = 1; i <= int1; i++) {
			if(int1%i==0) {
				System.out.print(i+" ");
			}	
		}
		
		
		
			
		
	}
}
