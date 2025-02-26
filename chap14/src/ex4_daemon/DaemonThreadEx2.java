package ex4_daemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * 타자연습프로그램
 */
class DataAddThread extends Thread{
	List<String> words;
	String[] data;
	int interval;

	public DataAddThread(List<String> words, String[] data, int interval) {
		this.words = words;
		this.data = data;
		this.interval = interval;
	}

	@Override
	public void run() {
		while(true) {
			words.add(data[(int)(Math.random()*data.length)].trim());
			//중복되서 추가될수도있음(리스트는중복허용) 공백을 제거해서 추가!!
			try {
				sleep(interval);//interval만큼 sleep
			}
			catch(InterruptedException e) {}
		}
	}
}
public class DaemonThreadEx2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> words =  new ArrayList<>();//삭제대상이되는 문자들을 모아놈
		String[] data= {"     태연","     유리","  윤아","  효연 ","수영","서현",
				"티파니","써니","유재석","강호동"};
		
		int interval = 3*1000;//sleep시간
		
		words.add(data[0].trim());//일단 0 번인덱스를 list에 추가(공백을 제거하고넣어야함)
		DataAddThread t1 = new DataAddThread(words,data,interval);
		t1.setDaemon(true);//데몬스레드설정
		
		t1.start();//Runnable
		
		while(true) {
			System.out.println(words);
			System.out.printf("-->");
			String input = scan.next().trim();//공백을제거한 입력문자
			words.remove(input);//입력된이름을 리스트의요소에서제거
			if(words.size()==0) {
				break;
			}
		}
		System.out.println("프로그램종료");
		
		}
	}


