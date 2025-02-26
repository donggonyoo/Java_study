package ex1_create;


/*
 * Thread 클래스를 상속
 * run() 메서드 구현 : 스레드의기능
 */
class Thread1 extends Thread{

	 Thread1(String name) {
		super(name);//Thread 이름설정(getName()으로호출가능)
	}
	 
	 //Thread 수행 해야할 메서드
	 @Override
	public void run() {//Running상태 (run()메서드 실행중인 상태)
		for (int i = 0; i < 5; i++) {
			System.out.println(i+"="+getName());
			try {
				sleep(1000);//(1000ms)1초동안대기(대기상태)
				//이함수로인해 멀티쓰레드가 됨.
				//대기하는동안 Thread2실행
			}
			catch (InterruptedException e) {}
		}
	}
}
public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("main시작");
		Thread1 t1 = new Thread1("First");
		Thread1 t2 = new Thread1("second");//Thread객체 생성
		t1.start();//t1 객체 Runnable상태
		t2.start();//t2 객체 Runnable상태
		/*
		 * start() : 스레드의 시작.병렬화시킴 , 멀티쓰레드환경
		 * 1.스택영역을 병렬화시킨다
		 * 2.병렬화된 스택영역에 run()메서드 호출
		 * 
		 */
		System.out.println("main 종료");
	}

}
