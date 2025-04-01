package ex4_map;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

/*
 * product.txt 파일생성
 */

class Car{
	private int month;
	private int con;
	private String car;
	private int qty;
	private String remark;
	public Car(int month, int con, String car, int qty, String remark) {
		super();
		this.month = month;
		this.con = con;
		this.car = car;
		this.qty = qty;
		this.remark = remark;
	}
	public int getMonth() {
		return month;
	}
	public int getCon() {
		return con;
	}
	public String getCar() {
		return car;
	}
	public int getQty() {
		return qty;
	}
	public String getRemark() {
		return remark;
	}
	@Override
	public String toString() {
		return  "["+month + ", con=" + con + ", car=" + car + ", qty=" + qty + ", remark=" + remark + "]";
	}

}
public class MapEx2_product {

	static String carName = "BMW";
	static int con = 1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("product.txt"));
		//br.lines 텍스트파일의 내용을 한줄 씩 Stream으로 생성 . 파일에서Stream객체로생성
		//Stream<String> br.lines()
		//한개의 요소 : 4 , 3 , BMW , 4 , 몰라요
		/*
		 * month 필드 : 4
		 * con필드  :  3 --> 1:생산 2:판매 3:반품
		 * car 필드 : BMW -> 자동차 이름
		 * qty 필드 : 4--> 수량
		 * remark 필드 : 몰라요 -> 반품사유
		 * 
		 * br.liines().map(Function String Car)=>
		 * 		Stream<String> --> Stream<Car> 변경
		 * 	
		 */
		Stream<Car> carStream = br.lines().map(s->{              //  0   1   2    3     4 
			String[] str  = s.split(",");//["4","3","BMW","4","몰라요"]
			String temp = "";
			try {
				temp = str[4];//반퓸사유 저장
			}
			catch(ArrayIndexOutOfBoundsException e) {
				//str[4]가 존재하지않는다면 temp에 빈 문자열 전달!!
				temp="";
			}
			return new Car(Integer.parseInt(str[0]), 
					Integer.parseInt(str[1]),
								str[2],//String
					Integer.parseInt(str[3]), 
								temp);//String
		});//Stream<Car> 변경
		
		carStream.filter(s->s.getCar().equals(carName)&&s.getCon()==con)
		//filter로 새로만든Car객체와 조건을 비교한다.) true인 경우에만 넘김
				.forEach(s->System.out.println(s));
					//true인 객체만 출력
	}

}
