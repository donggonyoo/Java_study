package ex4_binding.exam;

class Product{
	int price,point;
	
	Product(int price){
		this.price = price;
		this.point=price/10;
	}}

class Tv extends Product{

	Tv() {
		super(100);}
	
	@Override
	public String toString() {
		return "Tv";}
}

class Computer extends Product{

	Computer() {
		super(200);}
	
	@Override
	public String toString() {
		return "Computer";}
}

class HandPhone extends Product{

	HandPhone() {
		super(150);	}
	
	@Override
	public String toString() {
		return "HandPhone";}	
}
/*
 * Buyer클래스
 * 멤버변수 : money : 500 ,point 
 *         product[] items = new Product[5]; 구매물품목록
 *         int cnt; 구매물품 갯수
 *
 *멤버메서드
 *    void buy(Product p)
 *    1.p 상품의 가격을 money에서 차감
 *    2.p 상품의 point만큼 Buyer의 point 증가
 *    3. 물건을 items에 추가  ,cnt값 증가
 *    4. p 제품의 이름 출력 후 메서드종료 ex) Tv구입
 *    
 *    void summary()
 *    1.구매제품 전체금액합계 , 포인트합계 계산
 *    2. 잔액출력
 *    3. 구매물품의 이름 출력  
 */

class Buyer{
	int money=500,point,cnt;
	Product [] items =  new Product[5];//구매물품은 최대5개
	
	//Product를 상속받은 클래스 모두 들어올 수 있다.
	//(new Tv() instanceof Product)  : tv가 참조하는 객체에는 Product가 존재함
	void buy(Product p) {
		money -= p.price; //p의 가격만큼 Buyer의 money 차감
		point += p.point; // p의 point를 Buyer의 point에 누적
		items[cnt++] = p;
		System.out.println(p+"구입  ["+p.price+"만원]");
	}
	
	void summary() {
		int sum=0;
		int point = 0; //지역변수 (메서드가종료되면 사라짐 , 멤버변수의 point는 this.point로 접근가능)
		System.out.print("구매물품 : ");
		for (int i = 0; i < cnt; i++) {
			sum+= items[i].price;
			point += items[i].point;
			System.out.print(items[i]+",");
		}
		System.out.println("\n구매제품 전체금액 : "+sum+"만원 , 포인트합계 : ["+point+"]P");
		
		System.out.println("잔액  : "+this.money+"만원");
	}
}

public class Exam1 {
	public static void main(String[] args) {
		Tv tv = new Tv();
		Computer cp = new Computer();
		HandPhone hp = new HandPhone();
		Buyer buyer = new Buyer();
		buyer.buy(tv); //매개변수 자동형변환
		//Product를 상속받았으므로 들어갈 수 있음 또한 출력도 오버라이딩된 메서드가 나오게되므로 나의 toString출력가능
		buyer.buy(cp);
		buyer.buy(hp);
		buyer.summary();
		
		System.out.println();
		if(tv instanceof Product) {
			System.out.println("Tv는 Product가 존재(Product의 자식)");
		}
		if(cp instanceof Product) {
			System.out.println("Computer는 Product가 존재(Product의 자식)");
		}
		
	}
	

}
