package ex1_create;


/*
 * Thread생성
 * 1.Thread 클래스 상속 , run()메서드구현
 * 2.Runnable인터페이스 구현 , run()추상메서드구현
 *  --> 구현클래스는 Thread 객체가 아님
 *    --> new Thread(Runnable) 형태로 Thread객체생성
 */
class Runnable1 implements Runnable{

	@Override
	public void run() {//Running 상태
		//Thread.currentThread() : static메서드 (현재실행중인 쓰레드객체 반환)
		for (int i = 0; i < 5; i++) {
			System.out.println(i+":"+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);//대기상태
			}
			catch(InterruptedException e) {}
		}
		
	}//run메서드종료 : Dead상태
	
}
public class RunnableEx1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"쓰레드 시작");
		Runnable r = new Runnable1();//r : Runnable객체
		Thread t1 = new Thread(r,"First");//Thread객체 생성(r,name)  
		Thread t2 = new Thread(r,"Second");//name은 적지않아도 실행에는 문제가없다
									//(Thread-0과 같은이름이 주어짐)
		
		t1.start();t2.start();//병렬환경의 run()호출.Runnable상태
		System.out.println(Thread.currentThread().getName()+"쓰레드 종료");
		
	}
}
