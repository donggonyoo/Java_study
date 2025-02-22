package ex1.InputStream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) throws IOException{
		InputStream in = System.in;// 키보드입력
		int data=0;
		//in.read() : 1byte 씩 읽기 (한글: 2byte)
		while((data=in.read()) != -1) {//ctrl+z (EOF) : 더이상안한다고판단
			System.out.print((char)data+" ");
		}
	}

}
