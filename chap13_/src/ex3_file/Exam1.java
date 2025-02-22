package ex3_file;


import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter 클래스를 이용하여 FileOutputStreamEx1.java의 내용을 out2.txt 파일에 저장하기
 * 주요메서드
 * void write(int data): 1char를 출력.
 * void write(char[] buf): buf의 내용을 출력
 * void write(char[] buf,int start, int len): buf의 start 인덱스 부터 len크기만큼 내용 출력
 * void write(String str) : str문자열의 내용을 출력
 */
public class Exam1 {
	public static void main(String[] args) throws IOException {
		System.out.println("out.txt 파일에 내용이 저장됩니다.");
		FileWriter fos = new FileWriter("out2.txt",true);
		//fos: out2.txt 파일에 내용을 저장 할 수 있는 출력스트림
		
		fos.write('1');fos.write('2');fos.write('3');
		fos.write('a');fos.write('b');fos.write('c');
		fos.write('가');fos.write('나');fos.write('다');
		//char단위로 읽기때문에 한글이깨지지않음
		
		//String.toCharArray : 문자열을 char형 배열로 바꿔줌	
		char[] buf = "\nFileOutputStream 예제입니다.\n".toCharArray();
		fos.write(buf); //buf의 내용을 out.txt파일에 출력
		fos.write(buf,5,6); //buf의 내용 중 5번인덱스부터 6개의 바이트를 출력
		fos.write("\nFileWrite는 문자열 출력이가능해요!!\n");
		fos.flush();
		fos.close();
	}

}
