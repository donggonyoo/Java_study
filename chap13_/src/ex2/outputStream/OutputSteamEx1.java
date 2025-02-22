package ex2.outputStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputSteamEx1 {
	public static void main(String[] args) throws IOException {
		//OutputStream : 바이트형 출력
		OutputStream out = System.out;
		out.write('1');out.write('2');out.write('3');
		out.write('a');out.write('b');out.write('c');
		out.write('가');out.write('나');out.write('다');//내가보내는 부분
		//1byte씩만 출력되기때문에 한글이 깨질거다

		out.flush();//버퍼의 내용을 강제로 목적지(화면)로보내는 메서드
	}

}
