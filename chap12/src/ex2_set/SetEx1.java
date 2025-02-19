package ex2_set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
 * set 인터페이스 : 중복객체저장안함
 * 
 * boolean add(Object) : true : 추가성공
 * 						 false : 추가실패
 * 
 * 구현클래스
 * 	HashSet : 중복불가 순서뒤죽박죽
 *  TreeSet : 중복불가 ,  정렬됨
 *   LinkedHashSet : 중복불가 . 순서유지
 */
public class SetEx1 {
	public static void main(String[] args) {
		Object [] arr = {"홍길동",1,"1","김삿갓","이몽룡","유재석","에러내ㅓ","홍길동","유재석","아이"};
		HashSet<Object> set1 = new LinkedHashSet<>();
		HashSet<Object> set2 = new HashSet<>();
		HashSet<Object> set3 = new HashSet<>();
		
		for (int i = 0; i < arr.length; i++) {
			if(!set1.add(arr[i])) {//set1객체에서 arr[i]객체 추가 실패인 경우
				if(!set2.add(arr[i])) {
					set3.add(arr[i]);
				}
			}
		}
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		
		//forEach구문으로 조회가능
		for (Object o : set1) {
			System.out.print(o+"__");
		}System.out.println();
		for (Object o : set2) {
			System.out.print(o+"__");
		}System.out.println();
		for (Object o : set3) {
			System.out.print(o+"__");
		}System.out.println();
		
	}

}
