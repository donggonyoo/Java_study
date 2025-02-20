package ex2_set;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 *  1  로또번호 생성 1~45 사이의 중복되지않는 임의의 값 6개선택
 *	2. 정렬해서 출력 
 */
public class Exam2 {
	public static void main(String[] args) {
		SortedSet<Integer> set = new TreeSet<>();
		
		for (int i = 0; i < 20; i++) {
			int ran= new Random().nextInt(45)+1;
			set.add(ran);
		}
		
		for (int i = 0; i <6; i++) {
			System.out.print(set.getFirst()+", ");
			set.remove(set.getFirst());
		}
		
	}
	
	

}
