package ex3_wait_notify;

/*
 * mother , son 스레드는 하나계좌를 공유
 * 계좌에잔액이없다면 son은 wait()
 * 잔액이있다면 mother wait()
 * mother :  1 ,2,3만원 중 한개를 입금 후 son을 깨운다
 * son : 잔액을 0으로만들고 mother을 깨움
 * 
 * wait() , notify() , notifyAll()
 * 1.동기화영역(동기화블럭,동기화메서드)에서만 사용이가능
 * 
 * 2.Object 클래스의멤버임 -> 모든객체들이 사용가능
 * 
 * 3.wait() : 현재실행중인 스레드를 대기상태로변환 ,lock 해제함
 * 		notify , notifyAll 메서드로만 해제 가능함
 * 
 * 4.notify() : wait() 상태인 스레드 한개 --> Runnable 
 * 				(한개는 개발자가 지정할수없음 시스템이선택해줌)
 * 
 * 5.notifyAll() : wait()상태 스레드 전부를 Runnable상태로변환
 */
class Account{//공유객체
	int money;
	synchronized void output() {//son Thread
		while(money==0) {
			try {
				wait();//동기화영역에서만 사용가능함
			}catch (InterruptedException e) {}
		}
		notify();//동기화영역에서만 사용가능함
		//wait()상태의 스레드중 한개만 Runnable상태로 변경함(지정불가)
		System.out.println(Thread.currentThread().getName()+":"+
		money+"원 출금");
		money = 0;
	}
	synchronized void input(){//mohter Tread
		while(money>0) {
			try {
				wait();
			}catch (InterruptedException e) {}
		}
		//money가 0이면 실행
		money = ((int)(Math.random()*3)+1)*10000;//1~3 *10000
		notifyAll();//모든스레드를 깨움(Son을 깨움)
		System.out.println(Thread.currentThread().getName()+":"+
				money+"원 입금");}
}
//--------------------------------------------------------------------
class Mother extends Thread{
	Account account;
	Mother(Account account){ 
		super("Mother");
		this.account = account;
	}
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			account.input(); //입금(1만원2만원3만원 중 랜덤)
			try {
				sleep((int)(Math.random()*3000));
			}catch (InterruptedException e) {}
		}
	}
}
//--------------------------------------------------------------------
class Son extends Thread{
	Account account;
	Son(Account account){
		super("Son");
		this.account = account;
	}
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			account.output();//초기에는 money가 없기에 wait()상태에들어가게됨
			try {
				sleep((int)(Math.random()*1000));//0~1000ms 사이의랜덤한 sleep
			}catch (InterruptedException e) {}
		}
	}
}
//--------------------------------------------------------------------
public class AccountEx1 {
	public static void main(String[] args) {
		Account account = new Account();
		Thread m1 = new Mother(account);
		Thread m2 = new Son(account);
		m1.start();m2.start();
	}

}
