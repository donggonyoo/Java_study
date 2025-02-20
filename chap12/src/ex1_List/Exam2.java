package ex1_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Name implements Comparable<Name>{

	String kor;
	String eng; 
	public Name(String kor, String eng) {
		this.kor = kor;
		this.eng = eng;
	}
	public String toString() {
		return kor+" : "+eng;
	}
	@Override
	public int compareTo(Name o) {
//		return kor.hashCode() - o.kor.hashCode();
		//한글의해쉬코드로 정렬을 시도해봤다
		return kor.compareTo(o.kor);
	}
}
public class Exam2 {

	public static void main(String[] args) {
		ArrayList<Name> list = new ArrayList<>();
		list.add(new Name("김","kim"));
		list.add(new Name("이","lee"));
		list.add(new Name("박","park"));
		list.add(new Name("안","an"));
		list.add(new Name("최","choi"));
		System.out.println(list);
		Collections.sort(list);//이름순
		System.out.println(list);
		System.out.println("영문이름으로 정렬해보기");
		//람다식을 이용했음
		Comparator<Name> f = (e1,e2)->{
			return e1.eng.compareTo(e2.eng);
			};
			
		Collections.sort(list, f);
		System.out.println(list);
		System.out.println("한글이름으로 내림차순 정렬");
		Collections.sort(list.reversed());
//		Collections.sort(list,Comparator.reverseOrder()); 위에랑 같은 의미	
		System.out.println(list);
		System.out.println("한글이름으로 내림차순 정렬2");
		Comparator<Name> f1 = (e1,e2)->{
			return e1.kor.compareTo(e2.kor)*-1;
			};
		Collections.sort(list,f1);
		System.out.println(list);
		
		System.out.println("영문이름으로 내림차순 정렬하기");
		Collections.sort(list,(e1,e2)->e1.eng.compareTo(e2.eng)*-1);
		System.out.println(list);
		
		
		}
}
