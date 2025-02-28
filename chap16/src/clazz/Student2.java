package clazz;

public class Student2 {
	public enum Gender {MALE,FEMALE};
	public enum City {SEOUL,BUSAN};
	
	//enum : 열거형 ( 범위내의 값만 사용가능)
	String name;
	int score;
	private Gender gender;
	private City city;
	
	public Student2(String name, int score, Gender gender, City city) {
		this.name = name;
		this.score = score;
		this.gender = gender;
		this.city = city;
	}
	
	public Student2(String name , int score , Gender gender) {
		this(name,score,gender,null); //위에 생성자로올라감
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public Gender getGender() {
		return gender;
	}

	public City getCity() {
		return city;
	}

	@Override
	public String toString() {
		return  name + ", score=" + score + ", gender=" + gender + ", city=" + city ;
	}
	
	


}
