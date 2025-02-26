package ex4_daemon;

/*		데몬 스레드
 * 1.일반스레드의 보조기능담당
 * 2.일반스레드가 종료되면 데몬스레드도 종료
 * 3.가비지콜렉터가 대표적인 데몬스레드
 * 4.무한반복형태로구현
 */

class DaemonThread extends Thread{
	/*
	 * public DaemonThread(String name) { super(name); }
	 */
	@Override
	public void run() {
		while(true) {
			/*
			 * Thread[#21,Thread-1,5,main]
			 * Thread[번호,스레드이름,우선순위,스레드그룹]
			 */
			System.out.println(this);
			try {
				sleep(100);
			}catch (InterruptedException e) {}
		}
		//run()의 while문은 break문없이
		//무한으로 this를 출력한다
	}
	
}
public class DaemonEx1 {
	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+"스레드 시작");
		DaemonThread t1 = new DaemonThread();
		DaemonThread t2 = new DaemonThread();
		t1.setDaemon(true);t2.setDaemon(true);//데몬스레드로지정
		t1.start();t2.start();
		Thread.sleep(2000);//mainThread를 2초간 sleep 후 종료
		System.out.println(Thread.currentThread().getName()+"스레드 종료");
	}

}
