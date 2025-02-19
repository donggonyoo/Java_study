package test;
/*
 Test3의 Coin 클래스를 이용하기 
 두개의 Coin 객체를 생성하기 myCoin, youCoin 객체 생성하기
 앞면이 연속해서 3번 나오면 승리가 출력되도록 구동 클래스 구현하기   

 [결과예시] => 결과는 다를 수 있습니다.
 myCoin	youCoin
  앞면	뒷면
  뒷면	앞면
  앞면	앞면
  앞면	앞면
 youCoin 승리
 */
//class Coin{
//	int side;
//	
//	void flip() {
//		side = (int)(Math.random()*2); 
//		//  0<= Matn.random() < 1
//		//  0<= Math.random()*2 < 2  ----->
//		     (int)Maht.random()*2 == 0 or 1
////		new Random().nextInt(1);이거와 같은 뜻
//	}
//	boolean isSquare() {
//		return side==0?true : false; //side가 0이면 true
//	}
//	String getSide() {
//		return side==0?"앞":"뒤"; //앞 뒤 반환
//	}
//	
//}---> Test3에존재


public class Test6 {
	
	public static void main(String[] args) {
		Coin myCoin = new Coin();
		Coin youCoin = new Coin();
		
		int myCount =0;
		int youCount =0;//앞면의개수를 세기위한 변수
		
		System.out.println("myCoin  youCoin");
		while(myCount<3 && youCount<3) {
			//두개의 count 가 3보다 작을동안 반복
			myCoin.flip();
			youCoin.flip();
			
			System.out.println(myCoin.getSide()+"\t "+youCoin.getSide());//앞면or뒷면 출력
			
			
			//isSquare가 참 (앞면) 이면 myCount = mycount+1 해줌 아니면 mycount =0;
			myCount = myCoin.isSquare()? myCount+1 : 0;   
			youCount = youCoin.isSquare()? youCount+1 : 0;
			
			if(myCount==3) {
				System.out.println("myCoin 승리");
				break;
			}
			else if(myCount==3 && youCount==3){
				System.out.println("동점");
			}
			else if(youCount==3) {
				System.out.println("youCoin 승리");
			}
		}	
	}
}



