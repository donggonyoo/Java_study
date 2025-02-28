package ex11_group;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

import clazz.Car;



public class Ex01_Product {
	public static void main(String[] args) throws FileNotFoundException  {
		BufferedReader br = new  BufferedReader(new FileReader("product.txt"));

		//BufferReader : 파일을 한줄씩 읽을 수 있음 

		//월별 판매현황을 map객체로
		Map<Integer, Long> map = br.lines()
				.map(s->{ // Stream<String> => Stream<car>
					//s : String. product.txt 파일의 한줄
					String[] str = s.split(",");
					String temp ="";
					try {
						temp=str[4]; // 상태3(반품)인 경우 반품 사유
					}catch(ArrayIndexOutOfBoundsException e) {
						temp="";
					}
//					new Car(int month, int con, String name, int qty, String remark)
					return new Car(Integer.parseInt(str[0]) // 월
							,Integer.parseInt(str[1]),// 상태 1: 생산 2: 판매 3: 반품
							str[2], 					// 자동차명
							Integer.parseInt(str[3]),// 수량
							temp); 				//  반품사유
				}) // 결과 Stream<Car>
				.filter(s->s.getCon()==2) // con멤버 값이 2 == 판매
				.collect(Collectors.groupingBy(Car::getMonth,// key 값
						Collectors.summingLong(Car::getQty))); //Qty 의 합
		System.out.println(map);
	
		map.entrySet().stream().map(s->{
			//s.getKey()는 Integer 타입임 +""을 붙여 String 타입 반환
			String temp = s.getKey()+"";
			if(s.getKey() <10) temp ="0"+temp; //10월보다 작은 월은 key앞에0을 붙여줌
			return (temp+"월 판매 수량 :"+s.getValue());
		}).sorted().forEach(s->System.out.println(s));
	}
}


