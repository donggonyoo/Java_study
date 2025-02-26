package ex5_other;

import java.io.IOException;

/*
 * 멀티프로세스예제
 * Process : Os상에서 실행되는프로그램
 * Runtime.getRuntime() : OS로부터 프로세스를 실행권한 얻기
 */
public class ProcessEx1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		Process p1 = Runtime.getRuntime().exec("mspaint.exe");//그림판
		Process p2 = Runtime.getRuntime().exec("notepad.exe");//메모장
		p1.waitFor();
		System.out.println("main종료");
	}

}
