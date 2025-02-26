package ex5_other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * Join메서드 : 스레드가 종료할때까지 join() 메서드를 호출한 메서드가 대기함
 * 
 * 1~1000까지의 합 구하기
 * t1~t5 까지 쓰레드가  200씩나누어  합을 구하고 main은 대기하고있다가 전체합을 출력
 */

class SumRunnable implements Runnable{
	int firstNum,lastNum;
	int sum;
	

	public SumRunnable(int firstNum, int lastNum) {
		this.firstNum = firstNum;
		this.lastNum = lastNum;
	}


	@Override
	public void run() {
		for(int i=firstNum;i<=lastNum;i++) {
			sum+=i;
		}
	}
	
}
public class JoinEx1 {
	public static void main(String[] args) throws InterruptedException {
		//List  =  Arrays.asList(값들)
		List<SumRunnable> list = Arrays.asList(new SumRunnable(1, 200),new SumRunnable(201, 400),
				new SumRunnable(401, 600),new SumRunnable(601, 800),new SumRunnable(801, 1000));
		ArrayList<Thread> list1 = new ArrayList<>();
		
		for (Runnable s : list) {//list에있는 Runnable의 수만큼 쓰레드생성
			list1.add(new Thread(s));
		}
		for (Thread t : list1) {//모든쓰레드 start
			t.start();
		}
		/*
		 * join() : 모든스레드가 종료할때까지 main메서드가 대기함
		 */
		for (Thread t1 : list1) {//모든쓰레드 join()
			t1.join();
		}
		
		//모든스레드의 상태가 dead일 경우 실행
		int sum=0;
		for (SumRunnable s : list) {
			//스레드의 sum을 모두 모아
			sum+=s.sum;
			
		}
		System.out.println("전체합계 : "+sum);
		
		
	}

}
