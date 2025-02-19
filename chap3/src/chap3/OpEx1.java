package chap3;

/*
 * 단항연산자
 * 	증감연산자 : ++ . --
 */

public class OpEx1 {
	public static void main(String[] args) {
		int x = 5,y=5;
		System.out.println("x : "+x+"  y: "+y);
		x++;//후위증감자 계산후에 적용이 됨
		y--;
		System.out.println("x : "+x+"  y: "+y);
		++x;//전위증감자 
		--y;
		System.out.println("x : "+x+"  y: "+y);
		x=y=5; //x,y 5로초기화
		
		
		System.out.println("\n@@후위증감자 전위증감자 차이@@(x,y : 5로 초기화)");
		System.out.println("전위증감자");
		y=++x;
		System.out.println("x : "+x+"  y: "+y);
		
		System.out.println("\n후위증감자");
		y=x++; 
		System.out.println("x : "+x+"  y: "+y);
		//후위증감자는 계산 후에 값이올라감  
				//y=x 후에 x가 증가함
		
		x=5;
		System.out.println("\n@@ x=5 @@ ");
		System.out.println("x++ : "+ x++);
		System.out.println("++x : "+ ++x);
		
		y=5;
		System.out.println("\n@@ y= 5 @@");
		System.out.println("y-- : "+ y--);
		System.out.println("--y : "+ --y);
	}

}
