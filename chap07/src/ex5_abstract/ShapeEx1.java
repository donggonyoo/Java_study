package ex5_abstract;

public class ShapeEx1 {
	public static void main(String[] args) {
//		Shape s  = new Shape("도형"); 추상클래스는객체화불가
		Shape []arr = new Shape[2]; //Shape 객체를 참조할수있는 참조변수(객체가 아님)
		
		arr[0] = new Circle(10);
		arr[1] = new Rectangle(10, 10);
		
		double totalArea=0,totalLength=0;
		for (Shape s : arr) {
			System.out.println(s);
			totalArea += s.area();
			totalLength += s.length();
		}System.out.printf("면적 합 : %.4f   둘레 합 : %.4f",totalArea,totalLength);
		System.out.println();
	}
}
