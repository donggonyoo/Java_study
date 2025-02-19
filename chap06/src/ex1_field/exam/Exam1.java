package ex1_field.exam;

class Rectangle {

	public int width;
	int height;
	int sno;
	static int cnt;
	
	public String toString() {
		return sno+"번 사각형 : 가로("+width+"), 세로("+height+"),"
				+ "현재까지 생성된 사각형 ("+cnt+")";
	}
}
public class Exam1 {
	public static void main(String[] args) {
		System.out.println("Rectangle.cnt : "+Rectangle.cnt);
		Rectangle r1 = new Rectangle();
		r1.width = 10;
		r1.height = 20;
		
		r1.sno = ++Rectangle.cnt;
		System.out.println("++Rectangle.cnt : "+Rectangle.cnt);
		System.out.println(r1);
		
		Rectangle r2 = new Rectangle();
		r2.width = 10;
		r2.height = 20;
		
		r2.sno = ++Rectangle.cnt;
		System.out.println("++Rectangle.cnt : "+Rectangle.cnt);
		System.out.println(r2);
		
		
		Rectangle[] rArr =  new Rectangle[3];
		System.out.println("**rArr배열 초기요소**");
		for (Rectangle rectangle : rArr) {
			System.out.print(rectangle+",");
		}//지금 배열에는 모두 null값이 들어 있을거다
		System.out.println();
		
		rArr[0] = r1;
		rArr[1] = r2;
		
		System.out.println("** r1 ,r2 를 요소로 사용**");
		for (Rectangle r : rArr) {
			System.out.print("["+r+"] ,");
		}
		
	}

}
