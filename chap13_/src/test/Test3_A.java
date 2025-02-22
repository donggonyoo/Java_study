package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

/*
1. 반복문을 이용하여 
  파일명을 입력받아서 해당 파일이 존재하면 해당파일명.bak 파일 복사하기
  파일명에 exit 가 입력되면, 프로그램 종료.
  해당 파일이 없으면 해당 파일이 없습니다. 메세지 출력

[결과]
파일명을 입력하세요(종료:exit)
aaa.txt
aaa.txt=>aaa.bak 복사완료
파일명을 입력하세요(종료:exit)
bbb.txt  
복사할 파일이 없습니다.
파일명을 입력하세요(종료:exit)
exit
 */
public class Test3_A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("파일명을 입력하세요 (종료 exit)");
			
			try {
				String file = scan.next();
				if(file.equalsIgnoreCase("exit")) {
					System.out.println("종료");
					break;
				}
				int lastIndexOf = file.lastIndexOf(".");
				if(lastIndexOf==-1) {
					System.out.println("확장자가 없어요");
					continue;
				}
				String bak = file.substring(0, lastIndexOf)+".bak";
				
//				String[] split = file.split("\\.");//정규식을 이용해 .을 문자로인식하게해야함
//				String bak = split[0]+".bak";//.txt앞의 파일명을 따옴
				
				Reader r =new FileReader(file);
				
//				FileInputStream r = new FileInputStream(file);
				int data=0;
				char[] a = new char[2000];
//				byte[] a = new byte[r.available()];

				Writer w  =  new FileWriter(bak);
//				FileOutputStream w =  new FileOutputStream(file+".bak");
				while((data=r.read(a))!= -1) {
					w.write(a,0,data);
				}
				r.close();
				w.flush();
				w.close();
				System.out.println(file+"--> "+bak+" 복사완료");

			} catch (IOException e) {
				System.out.println("파일이 없어요");
			}
		}
	}

}
