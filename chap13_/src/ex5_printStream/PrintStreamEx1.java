package ex5_printStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * PrintStream 보조스트림
 * 1. OutputStream 클래스의 하위클래스 --> 바이트형 출력스트림
 * 2.write 기능을 다양하게 확장함 --> print , println , printf
 *    --> 모든 자료형을 출력 , 예외처리생략가능(IOException)
 *  3.표준출력(System.out) 표준오류(System.err) 객체의자료형
 *  4.객체생성시 바이트형출력스트림(OutputStream)을 매개변수로받는다
 *     new PrintStrema(OutputStream)
 */
public class PrintStreamEx1 {
	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps =new PrintStream(fos);
		ps.println("홍길동");
		ps.println(1234);
		ps.println(true);//println은 그냥 그대로를 출력해줌
		ps.write(65);//FileOutputStream은 byte단위로 저장되므로 아스키코드가나올것임
		ps.flush();
		ps.close();
		
		
	}

}
