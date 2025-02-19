package ex1_equals;

import java.util.Objects;
/*
 * Object 클래스멤버 : equals 메서드
 * 
 * equals : 같은내용인지 판단 리턴용도
 * 		=> 내용비교를 위해서 각각의 클래스에서 오버라이딩필요
 * 
 * == : 같은객체판단
 */
class Equal{
	int value;
	public Equal(int value) {
	this.value = value;
	}

	//value값이 같으면 True 다르면 false리턴
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Equal) {
		Equal e = (Equal) obj;
		return value == e.value;}
		
		else {
			return false;
		}
	}
	
	
}
public class EqulasEx1 {

	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		if(e1==e2) {
			System.out.println("e1과e2는 같은객체");
		}
		else {
			System.out.println("e1과 e2는 다른객체");
		}
		
		System.out.println("e1Hashcode : "+e1.hashCode());
		System.out.println("e2Hashcode : "+e2.hashCode());
		
		if(e1.equals(e2)) {
			System.out.println("e1과e2는 같은 내용의 객체");
		}
		else {
			System.out.println("e1과 e2는 다른 내용의 객체");
		}
		
		

	}

}
