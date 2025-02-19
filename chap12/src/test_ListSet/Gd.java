package test_ListSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Gd {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(32);
		a.add(42);
		a.add(14);
		a.add(11);
		a.add(3);
		System.out.println(a);
		System.out.println("오름차순정렬 후");
		Collections.sort(a);
		System.out.println(a);
		System.out.println("내림차순 정렬 후");
		Collections.sort(a,Comparator.reverseOrder());
		System.out.println(a);
		
		
	}

}
