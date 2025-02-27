package ex4_map;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Function;
import java.util.stream.Stream;

/*
 * product.txt 파일에서 그랜져 반품목록 출력하기
 */
public class Exam2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br  = new BufferedReader(new FileReader("product.txt"));
		
		Function<String, Car> f = s->{
			//람다식 활용
			String[] split = s.split(",");
			String remark = "";
			
			try {
				remark = split[4];
				
			} catch (Exception e) {
				remark = "";
			}
			return new Car(Integer.parseInt(split[0]), 
					Integer.parseInt(split[1]),
					split[2], 
					Integer.parseInt(split[3]),
					remark);
		};
		
		br.lines().map(f).filter(s->s.getCar().equals("그랜저")&&s.getCon()==3)
		//carStream에  다음과같은 필터를 씌운다.
		.forEach(s->System.out.println(s));
		//필터가 True인 객체만 출력
		
		//그랜저의 반품수량출력
		//한번 순회하면 스트림이 사라지기때문에 다시생성해야함!!
		br  = new BufferedReader(new FileReader("product.txt"));
		int sum = br.lines().map(f).filter(s->s.getCar().equals("그랜저")&&
				s.getCon()==3).mapToInt(s->s.getQty()).sum();
		System.out.println("그랜저 반품 수량 :"+sum);
		
	}

}
