package ex5_other;

/*
 * Thread 우선순위
 * Runnable상태 --> Running 상태 변경시 스케쥴러가 관여함.개발자의 영역X
 * 우선순위를 설정해서 실행상태의 확률을 높일수있음.
 * 우선순위 1~10 까지
 * 10 : 가장높은 우선순위
 *  5 : 기본우선순위
 *  1 : 가장낮은우선순위
 */

class ThreadPriority extends Thread{
	 ThreadPriority(String name) {
		this(name,Thread.NORM_PRIORITY);
	}
	 ThreadPriority(String name,int p) {
		 super(name);
		this.setPriority(p);
	}

	@Override
	public void run() {
		try {
			sleep(200);
		}
		catch (InterruptedException e) {}
		for (int i = 0; i < 10; i++) {
			System.out.println(this.toString());
		}
	}
	
}
public class PriorityEx1 {
	public static void main(String[] args) {
		System.out.println("높은 우선순위 : "+Thread.MAX_PRIORITY);
		System.out.println("기본 우선순위 : "+Thread.NORM_PRIORITY);
		System.out.println("낮은 우선순위 : "+Thread.MIN_PRIORITY);
		ThreadPriority t1 = new ThreadPriority("first", 1);
		ThreadPriority t2 = new ThreadPriority("second");
		ThreadPriority t3 = new ThreadPriority("Third",10);
		t1.start();t2.start();t3.start();
		System.out.println("@@"+Thread.currentThread().getName()+"종료@@");
		//우선순위가 높다고 해당쓰레드를 모두끝낼때까지 아무것도실행되지않는게 아님!
		//우선순위가높은것을 먼저 처리하려고한다.(확률적으로 우선순위가낮은게 밑에있다)
		
		
		
		
		
	}

}
