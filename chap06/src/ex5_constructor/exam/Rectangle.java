package ex5_constructor.exam;

public class Rectangle {
	
	int width;
	int height;

	public Rectangle(int w, int h) {
		this.width = w;
		this.height = h;
	}
	
	public Rectangle(int w) {
		this.width = w;
		this.height = 1;
	}

	 int length() {
		return 2*(width+height);
	}
	
	 int area() {
		return width*height;}
	 
	public String toString() {
		return "("+width+","+height+")"+
	"면적 : "+area()+", 둘레"+length();
		
	}

}
