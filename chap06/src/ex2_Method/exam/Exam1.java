package ex2_Method.exam;

class Rectangle{

	public static int cnt;
	public int width;
	public int height;
	public int serialNo;
	
	 int Area() {
		return width*height;
	}
	 int length() {
		return 2*(width+height);
	}
	 boolean isSquare() {
		return (width==height);
	}
	
	public String toString() {
		return serialNo+"번 사각형("+width+","+height+")"
				+ " 생성 사각형 갯수 : "+cnt+"==>"+
				"\n면적 : "+Area()+" 둘레 : "+length()+
				(isSquare()?" 정사각형":" 직사각형");}
}


public class Exam1 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 30;
		r1.height = 20;
		r1.serialNo = ++Rectangle.cnt;
		System.out.println(r1);
		//1번사각형(30,20) 생성된 사각형갯수 : 1 =>
		//면적600 , 둘레 100, 직사각형
	}
}
