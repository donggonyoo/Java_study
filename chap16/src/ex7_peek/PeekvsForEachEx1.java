package ex7_peek;

import java.util.Arrays;
/*
 * peek : 중간 처리 반복자
 * 		  중간단계에서 추가 작업시 사용 됨
 * 		  다음단계 처리가 없다면 동작 실행X
 * 		  
 * 
 * forEach : 최종 단계 반복자 ( 다음 단계가없음)
 */
public class PeekvsForEachEx1 {
public static void main(String[] args) {
	int[] intArr = {1,2,3,4,5};
	System.out.println("peek 메서드 연습");
	//peek : 짝수의 합 출력 , 중간단계에서 작업 수행
	int tot=
			Arrays.stream(intArr).filter(a->a%2==0)//짝수만넘겨
			.peek(n->System.out.print(n+"+")).sum();
			//sum()이없다면 peek동작 실행X
	
	
	System.out.println("=="+tot);
	
	System.out.println("ForEach 메서드 연습");
	Arrays.stream(intArr).filter(a->a%2==0)//짝수만 넘긴다.
	.forEach(n->System.out.println(n+","));
}
}
