package chap06.exam;


class Rectangle {

	int width;
	int height;
	public void area() {
		System.out.println("면적 : "+(width*height));
	}
	public void length() {
		System.out.println("둘레  : "+2*(width+height));
	}
}

public class Exam01 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 10;
		r1.height = 5;
		r1.area();// 사각형 면적 : 50
		r1.length(); //사각형둘레 30
	}
}
