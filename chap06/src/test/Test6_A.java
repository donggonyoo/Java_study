package test;

public class Test6_A {
	public static void main(String[] args) {
		Coin myCoin = new Coin();
		Coin youCoin = new Coin();
		int mycount = 0, youcount = 0;
		System.out.println("myCoin\tyouCoin");
		while(true){ //
			myCoin.flip();
			youCoin.flip();
			if(myCoin.side == 0){
				System.out.print("앞면\t");
				mycount++;
			}else{
				System.out.print("뒷면\t");
				mycount = 0;
			}			
			if(youCoin.side == 0){
				System.out.print("앞면\n");
				youcount++;
			}else{
				System.out.print("뒷면\n");
				youcount = 0;
			}			
			if(mycount == 3 || youcount == 3)
				break; //반복문 종료
		} //while 종료
		if(mycount > youcount)
			System.out.println("myCoin 승리");
		else if(mycount < youcount)
			System.out.println("youCoin 승리");
		else
			System.out.println("비김");
	}

}
