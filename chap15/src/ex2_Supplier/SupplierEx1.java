package ex2_Supplier;

import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
/*
 * Supplier 관련 인터페이스
 * T getXXX() : 매개변수가없고 리턴값 존재
 * Supplier<T> : T get()
 * IntSupplier : int getAsInt()
 * DoubleSupplier : double getAsDouble()
 * BooleanSupplier : boolean getAsBoolean()
 * 
 */
public class SupplierEx1 {
	public static void main(String[] args) {
		Supplier<String> s1 = ()->{
			return "java";
		};
		System.out.println(s1.get());
		IntSupplier s2 = ()->new Random().nextInt(6)+1;//1~6 랜덤한정수
		System.out.println(s2.getAsInt());
		double[] arr = {1,1.2,2.4, 5.3 ,10 ,3};//double형배열
		DoubleSupplier s3 = () ->{
			double sum=0;
			for (double d : arr) {
				sum+=d;
			}
			return sum;//double형 sum 반환(
		};
		
		
	}

}
