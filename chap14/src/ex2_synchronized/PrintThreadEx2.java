package ex2_synchronized;
/*
 * 동기화블럭 예
 * 1.synchronized 예약어 사용
 * 2.lock 객체는 유일해야한다.(static)
 * 3.lock 기본자료형은 안됨(int double 등 불가능)
 */
class PrintThread2 extends Thread{
	char ch;
	static Object Lock = new Object();
	//static이 아니라 인스턴스멤버라면 각각 다른 Lock객체가 생기는것임
	PrintThread2(char ch){
		this.ch = ch;
	}
	@Override
	public void run() {
		synchronized(Lock) {
			//synchronized(){}: 동기화블럭(끝날때까지 다른객체가 접근 불가능)
			//Lock이 Object타입이므로 Thread객체가 들어갈 수 있음.
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					System.out.print(ch);
				}
				System.out.println();
			}
		}
	}

}
public class PrintThreadEx2 {
	public static void main(String[] args) {
		PrintThread2 t1 = new PrintThread2('A');
		PrintThread2 t2 = new PrintThread2('B');
		PrintThread2 t3 = new PrintThread2('C');
		t1.start();t2.start();t3.start();
		
	}
	
}
