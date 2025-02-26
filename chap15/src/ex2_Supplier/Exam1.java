package ex2_Supplier;

import java.util.function.BooleanSupplier;

public class Exam1 {

	//배열의합이 짝수인지 홀수인지?
	public static void main(String[] args) {
		int[] data= {1,2,5,78,4,6,8,12,10};
		BooleanSupplier b = ()->{
			int sum=0;
			for (int i : data) {
				sum+=i;
			}
			System.out.println(sum);
			return sum%2==0?true:false;
			//sum이짝수이면 true 아니면 false를 반환하게될것
		};
		
		if(b.getAsBoolean()) {//true
			System.out.println("짝수");
		}
		else {//false
			System.out.println("홀수");
		}
		
	}
}
