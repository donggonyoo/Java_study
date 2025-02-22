package ex1.InputStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderEx1 {
	public static void main(String[] args) throws IOException {
		//InputStreamReader : InputStream객체를 Reader로 변경 스트림
		Reader in = new InputStreamReader(System.in);
		int data=0;
		//in.read : 2byte단위로읽어 (한글같은 char형의 데이터도 문제없이 읽어냄)
		while((data = in.read()) != -1) {
			System.out.print((char)data);
		}
	}

}
