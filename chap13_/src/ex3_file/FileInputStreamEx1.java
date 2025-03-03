package ex3_file;

import java.io.FileInputStream;
import java.io.IOException;
/*
 * FileInputStream : 파일내용 읽어 화면에출력 (바이트단위)
 * 
 * 주요메서드
 * int read() : 1바이트읽어서 내용을 리턴
 * int read(byte[] buf) : buf의 크기만큼 읽어서 내용을 buf에 저장.읽은 바이트 수를 리턴해줌
 * int read(byte[] buf,int start, int len) :
 *     len의크기만큼읽어서 buf의 start인덱스 부터  내용을 buf에 저장.읽은 바이트 수를 리턴해줌
 *    
 * int available() : 읽기 가능 바이트 수 return 
 */
public class FileInputStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src\\ex1\\InputStream\\GG.java");
		int data = 0;
		System.out.println("======= read() 메서드를 이용해 읽기");
		while((data=fis.read()) != -1) {
			System.out.print((char)data);
			//읽을때 1byte씩 읽으므로 파일이 좀 많이깨지는 현상!!
		}
		
		System.out.println("=====read(byte[]) 메서드이용해 읽기 ====");
		fis = new FileInputStream("src\\ex1\\InputStream\\GG.java");
		//다른패키지 or 다른경로상에있는 파일을 불러오려면 전체경로를 입력하자
		//ex) D:/java/Java_study/chap12/src/test_ListSet/Gd.java
		
		byte[] buf = new byte[fis.available()];
		System.out.println("fis.available()"+fis.available());
		
		//fis.available() 읽기가능 바이트수
		//100바이트짜리 파일을 읽지 않은 경우  100
		//100바이트짜리 파일중 1바이트를 읽은경우 99
		while((data=fis.read(buf)) != -1) {
			//fis.read(buf) : fis에서 buf만큼 읽어서 읽은내용은 buf저장 , 실제읽은크기를 리턴
					//data : 실제읽은 바이트 수
			System.out.print(new String(buf,0,data));
			System.out.println("@@ data @@ "+data);//1695 
			//new String(buf,0,data) : buf에 0번인덱스부터 data의크기만큼 문자열객체로생성
			//buf로 읽어낸다면 한번에 읽어내기때문에 훨씬성능이좋음
			
		}
		System.out.println("=======read(byte[],int,int) 메서드 이용 ====");
		fis = new FileInputStream("src\\ex1\\InputStream\\GG.java");
		buf = new byte[fis.available()+1];
		buf[0]='Z';
		while((data=fis.read(buf,1,buf.length-1)) != -1) {
			System.out.print(new String(buf,0,data));
		}
	}


}
