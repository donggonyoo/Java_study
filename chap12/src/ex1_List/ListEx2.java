package ex1_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/*
 * Vector클래스
 * 	- Collection 프레임워크 이전의 클래스
 *  - List 의 구현클래스
 *  - 이전의 메서드와 혼합되어 있음.
 *  - 
 */
public class ListEx2 {
	public static void main(String[] args) {
		
//		List<Double> list = new Vector<>();
		Vector<Double> list = new Vector<>();
		list.add(0.3);
		list.add(Math.PI);
		list.addElement(5.0);
		//구버전의 메서드임 (그냥 add를 쓰자 Vector에는 있지만 List에는 존재X)
		System.out.println(list);
		
		int index = list.indexOf(5.0);
		int index2 = list.indexOf(4.0);
		System.out.println("5.0의 인덱스 "+index);
		System.out.println("없는 숫자의 인덱스 : "+index2);
		
		//요소존재확인
		boolean contains = list.contains(3.0);
		System.out.println("3.0은 list에 존재하는가? : "+contains);
		
		//요소 제거
		System.out.println("list 크기 : "+list.size());
		list.remove(0); //remove(int n) : n번 인덱스요소 제거
		list.remove(0.3);//remove(Object o ) : o 객체 제거
		System.out.println("list 목록 : "+list);
		
		System.out.println("==list2==");
		ArrayList<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list2.add(i+1);
		}
		Integer num = 1;
//		int num = 1;
		System.out.println(list2);
		list2.remove(num);
		//int num : 1을 지우는게아니라 index1번을 지우게 됨
		//Integer num : 1을 지운다..
		System.out.println(list2);
	}

}
