package ex6_this.exam;

public class Rectangle {
	int width, height, number;
	
	static int no;
	
	 int area() {
		return width*height;}
	 
	int length() {
		return 2*(width+height);}

	public Rectangle(int width, int height) {
		System.out.println("@(int,int)생성자@");
		this.width = width;
		this.height = height;
		number = ++no;}

	public Rectangle() {
		this(1,1);
		System.out.println("기본생성자");
		System.out.println();}

	
	public Rectangle(int width) {
		this(width,1);
		System.out.println("(int)생성자");
		System.out.println();
	}
	
	public Rectangle(Rectangle r) {
		this(r.width,r.height);
		System.out.println("(Rectangle)생성자");
		System.out.println();
	}
	
	public String toString() {
		return number+"번 사각형 ("+width+","+height+")"+
				"면적 : "+area()+" 둘레 : "+length()+" "
				+(width==height?"[정사각형]":"[직사각형]");}
}
