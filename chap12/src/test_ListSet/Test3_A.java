package test_ListSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Random;

/*
다음 결과가 나오도록 프로그램을 작성하시오
 1 ~ 1000번까지의 번호를 가지는 복권이 있다.
 1등 1장, 2등 2장, 3등 3장 을 추첨하는 프로그램 작성하기
  단 추첨은 3등부터 추첨하고, 당첨번호는 중복되면 안된다.
  추첨된 번호는 임의의 수이므로 숫자 값은 실행 할때 마다 다르다.

  LinkedHashSet : 순서유지, 중복불가
  Random
  new ArrayList(Set) : Set 객체를 List객체로 생성

  [결과]
3등 복권 추첨합니다.
369,355,699,
2등 복권 추첨합니다.
280,920,
1등 복권 추첨합니다.
839,
 *** 복권 추첨 결과 ***
1등:839
2등:920,280,
3등:699,355,369,
===========

1등:[839]
2등:[280, 920]
3등:[355, 369, 699]
 */
public class Test3_A {
	public static void main(String[] args) {
		//		int ran = new Random().nextInt(1000)+1;//1~1000
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for (int i = 1; i < 1000; i++) {
			set.add(i);
		}
		ArrayList<Integer> list = new ArrayList<>(set);
		ArrayList<Integer> a3 = new ArrayList<>();
		ArrayList<Integer> a2 = new ArrayList<>();
		ArrayList<Integer> a1 = new ArrayList<>();
		Collections.shuffle(list);

		System.out.println("  [결과]  ");
		System.out.println("3등복권 추첨!");
		for (int i = 0; i < 3; i++) {
			a3.add(list.get(i));
			System.out.print(list.get(i)+",");
		} System.out.println();

		System.out.println("2등복권 추첨!");
		for (int i = 3; i < 5; i++) {
			a2.add(list.get(i));
			System.out.print(list.get(i)+",");	
		} System.out.println();

		System.out.println("1등복권 추첨!");
		System.out.println(list.get(5));
		a1.add(list.get(5));

		System.out.println("********");
		
		for (Integer i : a1) {
			System.out.println("1등 : "+i);
		}
		
		System.out.print("2등 : ");
		for (Integer i : a2) {
			System.out.print(i+" ");
		}System.out.println();
		
		System.out.printf("3등 : ");
		for (Integer i : a3) {
			System.out.print(i+" ");
		}System.out.println();
		
		System.out.println("===========");

		System.out.println("1등 : "+a1);
		System.out.println("2등 : "+a2);
		System.out.println("3등 : "+a3);



	}

}
