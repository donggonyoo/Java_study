package ex11_group;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import clazz.Student2;
import clazz.Student2.City;
import clazz.Student2.Gender;

public class Ex02_group {
	public static void main(String[] args) {
		List<Student2> list = Arrays.asList(
				new Student2("홍길동", 51,Gender.MALE,City.BUSAN),
				new Student2("유관순", 93,Gender.FEMALE,City.SEOUL),
				new Student2("박아지", 32,Gender.MALE,City.BUSAN),
				new Student2("이시안", 83,Gender.FEMALE,City.SEOUL));
		
		//성별로 평균점수 구하기
	
				Double avgM = list.stream()
				.filter(s->s.getGender()==Gender.MALE)
				.mapToInt(s->s.getScore()).average().getAsDouble();
				
				System.out.println("남자의평균 : "+avgM);
				
				Double avgF = list.stream()
						.filter(s->s.getGender()==Gender.FEMALE)
						.collect(Collectors.averagingDouble(Student2::getScore));
				
				System.out.println("여자평균점수 : "+avgF);
				
		
				//groupingBy(그룹기준컬럼 , 값 ) 
				//averaginDouble(Student2::getScore) : Student2의getScore의 평균을 Double반환
				Map<Gender, Double> map1 = list.stream()
				.collect(Collectors.groupingBy(
						Student2::getGender,Collectors.averagingDouble(s->s.getScore())/*==(Student2::getScore)*/
						));
				System.out.println(map1);
				//key값이 Gender value가 평균인 map객체 출력
				
				
//-----------------------------------도시별로 이름 출력-----------------------------
				
				System.out.print("서울지역 : ");
				list.stream().filter(s->s.getCity()==City.SEOUL).forEach(s->System.out.print(s.getName()+" "));
				System.out.println();
				
				System.out.print("부산지역 : ");
				list.stream().filter(s->s.getCity()==City.BUSAN).forEach(s->System.out.print(s.getName()+" "));
				System.out.println();
				
				Map<City, String> map2 = list.stream()
						.collect(Collectors.groupingBy(Student2::getCity,//도시가 Key
						Collectors.mapping(Student2::getName,Collectors.joining("," , "[" , "]")) ) );
											//각 도시에 매핑되는 Student2의 getName을   , 로 나눔.
				//mapping : Student2::getName 데이터들을 변환하기위한함수 --> 데이터선택
					//Collectors.joinning("," , "[" , "]") -> 선택된데이터를 다음과같이 처리
				System.out.println(map2);
				
//---------------------------------여자 , 남자 의 점수합 -----------------------------------
				System.out.println("남  ,  여 의점수 합");
				Map<Gender, Integer> map3 = list.stream().collect(Collectors.groupingBy(Student2::getGender,
						Collectors.summingInt(Student2::getScore)));
				System.out.println(map3);
	}
}
