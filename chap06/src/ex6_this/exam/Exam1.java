package ex6_this.exam;

class Rectangle1{
private int w;// 필드를 외부에서 직접 접근할수없게 막음
private int h;// 오직 생성자로만 접근
static int count;
int sno;

public Rectangle1(int w, int h) {
		this.w  =w;
		this.h = h;
		sno=++count; //인스턴스멤버는 클래스멤버 호출가능
	}
public Rectangle1() {
	this(1,1);
}

public Rectangle1(int w) {
	this(w,1);
}
public Rectangle1(Rectangle1 r) {
	this(r.w , r.h);
}
 private int area() {
	return this.w * this.h;
}
 
 private int length() {
	 return 2*(this.w +this.h);
 }
 
 public String toString() {
	 return sno+"번 사각형 ("+w+","+h+") 면적 :"+area()+
			 "둘레 : "+length()+" "+(w==h?"정사각형":"직사각형");
 }
 
}
public class Exam1 {
	public static void main(String[] args) {
		//1번생성자호출
		Rectangle1 r1 = new Rectangle1(10,10);//1번사각형 (10,10) 면적둘레 정사각형
		System.out.println();
		//2번생성자호출 -> this(1,1) 1번생성자호출
		Rectangle1 r2 = new Rectangle1();//2번사각형 (1,1)면적둘레정사각형
		
		//3번생성자호출 -> this(width , 1) 1번생성자호출
		Rectangle1 r3 = new Rectangle1(10);//3번사각형(10,1)....
		
		//4번생성자호출 -> this(r.width , r.height) 1번생성자호출
		Rectangle1 r4 = new Rectangle1(r1);//4번사각형 (10,10) .....
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
	}

}
