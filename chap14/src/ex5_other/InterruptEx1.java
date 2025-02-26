package ex5_other;

/*
 * 쓰레드정리
 * 1.스레드 생성
 *   1) Thread 클래스상속 , run메서드 오버라이딩
 *   2) Runnable 인터페이스구현 , run메서드오버라이딩 , Thread객체에 주입
 *  
 *  2.스레드상태
 *    Thread 생성상태 : new Thread();
 *    Runnable 상태 : start()메서드 실행 후
 *    Running 상태 : start()에 의해 run()메서드가 실행중인 상태
 *    
 *    대기상태 : sleep(), 동기화 lock획득실패,
 *            wait() : notify() or notifyAll로 꺠우지않으면 무한대기
 *            			대기상태해제시 Runnable상태로 변경
 *   Dead 상태 : run메서드를 모두 실행하고 종료된 상태
 *   
 * 3.주요메서드
 *  (1) start() : 병렬화 기능 , run메서드 호출 , new 상태-->Runnable상태
 *  (2) run()  : 쓰레드의기능 , 스레드가 실행하는 메서드.
 *  (3) sleep(ms) : 밀리초만큼 대기
 *  (4) setDaemon(boolean) : true인경우 DaemonThread로 사용하곘단소리
 *  			(start전에 실행)	Daemon스레드 :일반 스레드종료시 함께종료
 *  (5) join() : 해당스레드가 종료시까지 호출한메서드가 대기
 *  (6) setPriority(1~10) : 우선순위설정
 *  (7) interrupt() : InterruptedException발생시킴
 *  (8) stop()메서드는 쓰지마라.
 *  
 *  4.동기화 : Synchronized 예약어사용
 *  동기화블럭 : lock설정 ,  공유객체로 lock설정해야함
 *  동기화메서드 :공유객체의 메서드여야함(유일해야함)
 *  		메서드자체가 동기화영역 
 *  
 *  5.wait , notify , notifyAll
 *  Object 멤버
 *  동기화영역에서만 사용 가능
 */
class InterruptThread extends Thread{

	@Override
	public void run() {
		System.out.println("깨우지마세요");
		try {
			sleep(1000000);//10000초 대기
			
		} catch (InterruptedException e) {

			System.out.println("기상");
			e.printStackTrace();
		}
		
	}
	
}
public class InterruptEx1 {
	public static void main(String[] args) throws InterruptedException{
		InterruptThread t1 = new InterruptThread();
		t1.start();
		Thread.sleep(2000);//2초 대기
		t1.interrupt();//t1쓰레드에 InterruptedException 발생
		
	}

}
