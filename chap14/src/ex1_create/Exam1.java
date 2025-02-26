package ex1_create;

public class Exam1 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"시작");
		Runnable r=()->{
			for (int i = 0; i < 5; i++) {
				System.out.println(i+":"+Thread.currentThread().getName());
				try {
					Thread.sleep(1000);//대기상태
				}
				catch(InterruptedException e) {}
			}
		};
		
		Thread t1 = new Thread(r,"하하");
		Thread t2 = new Thread(r,"재석");
		t1.start();t2.start();
		System.out.println(Thread.currentThread().getName()+"종료");
		
	}

}
