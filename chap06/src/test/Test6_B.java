package test;

//class Coin{
//	int side;
//	
//	void flip() {
//		side = (int)(Math.random()*2); 
//		//  0<= Matn.random() < 1
//		//  0<= Math.random()*2 < 2  -----> int로 바꾸면 0 or 1 라는 뜻
//		
////		new Random().nextInt(1);이거와 같은 뜻
//	}
//	boolean isSquare() {
//		return side==0?true : false; //side가 0이면 true
//	}
//	String getSide() {
//		return side==0?"앞":"뒤"; //앞 뒤 반환
//	}
//	
//}
public class Test6_B {
	public static void main(String[] args) {
		Coin c1 = new Coin();
		Coin c2 = new Coin(); //코인객체 2개생성
		System.out.println("myCoin \t YouCoin");
		int c1Count=0;
		int c2Count=0;
		
		while(true) {
			c1.flip();//side에 0or1 저장
			c2.flip();
			
			
			System.out.printf("%3s",c1.getSide()+"\t");
			System.out.printf("%3s",c2.getSide());
			System.out.println();
			
			//앞면이라면 true가반환된다
			//true면 c1Count에 1을 누적하고 아니라면 c1Count를 0으로설정
			c1Count = (c1.isSquare()==true ? c1Count+=1 : 0); 
			c2Count = (c2.isSquare()==true ? c2Count+=1 : 0);
			
			if (c1Count==3) {
				System.out.println("나 승리");
				break;
			}
			else if(c2Count==3) {
				System.out.println("시스템 승리");
				break;
			}	
		}
	}
}
