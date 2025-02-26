package ex4_operator;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

/*
 * Operator 인터페이스
 * 	- Function 인터페이스의 하위인터페이스
 *  - 매개변수,리턴값 모두존재
 *  - T applyXXXX(T)
 *  
 *  - 종류
 *   
 *   UnaryOperator<T> : T apply(T)
 *   DoubleUnaryOperator : double apply(double)
 *   IntUnaryOperator : int apply(int)
 *   LongUnaryOperator : long apply(long)
 *   
 *   BinaryOperator<T> : T apply(T t1, T t2) => BiFunction인터페이스의 하위
 *   DoubleBinaryOperator : double apply(double,double)
 *   IntBinaryOperator : int apply(int,int)
 *   LongBinaryOperator : long apply(long,long)
 *   
 */
public class OperatorEx1 {
	private static int[] score= {92,95,76};
	public static void main(String[] args) {
		System.out.print("최대값 : ");
		int max=score[0],min = score[0];
		for (int i : score) {
			max= i<max?max:i;
		}
		System.out.println(max);
		System.out.print("최솟값");
		for (int i : score) {
			min= min<i?min:i;
		}
		System.out.println(min);
		
		
		System.out.println("최대값 : "+maxOrMin((a,b)->a>b?a:b));
		System.out.println("최소값 : "+maxOrMin((a,b)->a<b?a:b));
	}
	private static int maxOrMin(IntBinaryOperator op) {
		int num=score[0];
		for (int i : score) {
			num= op.applyAsInt(num, i);
			//(a,b)->a>b?a:b 의경우 : num과 i중 num이 크면 num반환 아니라면 i 반환
			//배열의 크기만큼 루프를돌림
		}
		return num;
	}
	
	

}
