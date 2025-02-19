package ex2_Method.exam;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Rectangle클래스이용해 20~50 사이의 임의의 가로 세로 길이를 가진 사각형5개생성
 * 사각형정보출력
 * 전체사각형의면적의합과 둘레의합 출력
 */
public class Exam2 {
	public static void main(String[] args) {
//		ArrayList<Rectangle> a2 = new ArrayList<Rectangle>();
//		a2.add(new Rectangle());
//		a2.add(new Rectangle());
//		a2.add(new Rectangle());
//		a2.add(new Rectangle()); 생성자를 이용한다면 이렇게도 충분히가능
//		System.out.println(a2);
		
		Rectangle[] a = new Rectangle[5];
		//Rectangle의 참조값만 생성하는것임.
		//a[0] : Rectangle 형의 참조변수 (Rectangle객체 아님)
		//쉽게말해서 Rectangle이 들어갈 자리를 만들어주는거 
		
		
		System.out.println("모두 null값이 들어가 있다.");
		for (Rectangle rectangle : a) {
			System.out.print(rectangle+",");
		}System.out.println();
		
		
		
		int areaSum = 0;
		int lengthSum = 0;
		for (int i = 0; i < a.length; i++) {
			
			a[i] = new Rectangle();//객체생성
			a[i].serialNo = ++Rectangle.cnt; 
			//총 사각형갯수를 올려주고 그 번호를 no에 할당
			
			a[i].width= (int)(Math.random()*31)+20;//20~50사이랜덤
			a[i].height = (int)(Math.random()*31)+20;
			
			areaSum+=a[i].Area();//면적 저장
			lengthSum+=a[i].length();//둘레 저장
			
			System.out.println(a[i]); //사각형정보
			System.out.println();
		}
		System.out.println(" 면적 : "+areaSum);
		System.out.println("면적(평균) : "+(double)areaSum/a.length);
		System.out.println(" 둘레 : "+lengthSum);
		System.out.println("둘레(평균) : "+(double)lengthSum/a.length);
		
		System.out.println("참조값");
		for (Rectangle r : a) {
			System.out.print(Integer.toHexString(r.hashCode())+" ,");
		}
		
	}

}
