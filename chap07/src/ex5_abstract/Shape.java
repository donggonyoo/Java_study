package ex5_abstract;
/*
 * 추상클래스 
 * 1. 추상메서드를 멤버로 가질 수 있는 클래스(abstract)
 * 2. 객체화 X --> 상속을 통해 자손클래스의 객체화로 객체화가능
 * 3. 그 외는 일반클래스와 동일 ( 멤버변수 , 생성자 , 멤버메서드,초기화블럭 , 다른클래스를 상속받을 수 있음)
 * 
 * 
 * 추상메서드
 * 1.메서드의 선언부만 존재함(구현부 {} 가 없음). abstract 예약어사용
 * 2. 하위클래스에서 반드시 오버라이딩해야함
 * 3. 
 */
public abstract class Shape { //도형클래스--> 추상클래스
	String type;//멤버변수
	Shape(String type){//생성자 (매개변수 o)
		this.type = type;}
	
	abstract double area(); //추상메서드 바디({})X
	abstract double length();//  하위클래스에서 오버라이딩은 필수임

	@Override
	public String toString() {
		return "Shape [type=" + type + ", area()=" + area() + ", length()=" + length() + "]";
	}
}

//Circle클래스
class Circle extends Shape{
	int r;

	Circle(int r) { 
		super("원");//부모의생성자 호출해야함
		this.r = r;}

	@Override
	double area() {//추상메서드는 반드시 오버라이딩해야함
		return Math.PI*r*r;}

	@Override
	double length() {
		return 2*Math.PI*r;}

	@Override
	public String toString() {
		return type+": "+r +"-> 면적 : "+area()+", 둘레 : "+length(); 
	}
}



/*
 * Rectangle클래스구현
 * 멤버변수 : width , height
 */

class Rectangle extends Shape{
	int width,height;

	Rectangle(int width,int height) {
		super("사각형");
		this.width = width;
		this.height = height;}

	@Override
	double area() {
		return width * height;}

	@Override
	double length() {
		return 2*(width+height);}
	
	@Override
	public String toString() {
		return type+": ("+width+","+height+") -> 면적 : "+area()+", 둘레 : "+length(); 
	}
	
}


