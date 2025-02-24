package ex4_bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 화면에서 파일명을 입력받고 출력 시작할 시작라인 , 출력라인수를 입력받아서
 * 시작라인부터 라인수까지의 내용을 화면에출력
 * 
 * 결과
 * 파일명입력
 * src/ex1_InputStream/InputStreamEx1.java
 * 시작라인
 * 1
 * 라인수
 * 3
 * 
 * 
 */
public class Exam1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("파일명 입력");
		String filename = br.readLine();
		
		System.out.println("시작 라인 : ");
		String a = br.readLine();
		int stl = Integer.parseInt(a);
		
		System.out.println("라인 수 : ");
		String b = br.readLine();
		int len = Integer.parseInt(b);
		
		BufferedReader br2 = new BufferedReader(new FileReader(filename));
		String data = null;
		int line=0,cnt=0;//line:라인수 cnt 출력한 라인수
		while((data=br2.readLine())!=null) {
			line++;
			if(line<stl)continue;
			if(cnt>=len)break;
			++cnt;
			System.out.println(line+":"+data);
		}br.close();br2.close();

	}
}
