package ex2_synchronized;

/*
 * 동기화메서드방식
 * 
 * 동기화영역 , 임계영역.synchronized예약어사용
 * 1. 동기화 블럭방식
 * static Object Lock=new Object();
 * synchronized(Lock 객체){..}
 * lock객체는 공유객체여야한다 
 * 모든스레드가 lock객체를공유(static)
 * 
 * 2. 동기화 메서드방식
 * 메서드에 synchronized 예약어사용
 * (메서드를 lock으로사용함)
 * 동기화메서드는유일해야한다.
 * 공유객체의 메서드여야한다.

 */
class PrintThread3 extends Thread{
	Printer prt;
	char ch;
	PrintThread3(Printer prt , char ch){
		this.prt = prt;
		this.ch = ch;
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			prt.printChar(ch);
		}
	}
	
}
//------------------------------------------------------------
class Printer{

	public synchronized void printChar(char ch) {//동기화메서드
		for (int i = 0; i < 5; i++) {
			System.out.print(ch);
		}System.out.println();
	}	
}

public class PrintThreadEx3 {
	public static void main(String[] args) {
		Printer p = new Printer();
		PrintThread3 t1 = new PrintThread3(p, 'A');
		PrintThread3 t2 = new PrintThread3(p, 'B');
		PrintThread3 t3 = new PrintThread3(p, 'C');
		t1.start();t2.start();t3.start();
	}
}
