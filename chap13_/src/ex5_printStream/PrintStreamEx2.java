package ex5_printStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;

/*
 * p.getInputStream() : ping 외부프로세스로부터 Data를 읽기
 * new InputStreamReader(InputStream,encoding방식); : UTF-8이 기본
 *  			--> 텍스트의 Encoding 방식 설정
 *  
 */
public class PrintStreamEx2 {
	public static void main(String[] args) throws IOException {
		String [] cmds = {"ping", "192.168.7.1"};
		//Process : 현재실행중인 프로세스
		Process p = Runtime.getRuntime().exec(cmds);
		Reader r = new InputStreamReader(p.getInputStream(),"EUC-KR");
				//인코딩떄문에 한글이깨지는지 , 바이트 수 때문에깨지는지 판단하자
		//참고로 Reader는 2바이트씩읽으므로 한글이 깨질일이없다 (인코딩방식문제)
		int data=0;
		PrintStream ps = new PrintStream(new FileOutputStream("ping.txt"));
		while((data=r.read())!= -1) {
			ps.print((char)data);
			System.out.print((char)data);
		}
	}

}
