package chap4.exam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exam04 {
	public static void main(String[] args) {
		int sumF=0,sumW=0,sumD=0;
		int w=0,w1=0;
		
		for (int i = 1; i <= 100; i++) {
			if(i%2==0) {
				sumF+=i;
			}
		}
		System.out.println("짝수의합 :"+sumF);
		
		while(w<=100) {
			w++;
			if(w%2==0) {
				sumW+=w;
			}
		}
		System.out.println("짝수의합(while) :"+sumW);
		
		do {
			w1++;
			if(w1%2==0) {
				sumD+=w1;
			}
			
		} while (w1<100);
		System.out.println("짝수합(do-while) : "+sumD);
		
	}

}
