package ex2_set;

import java.util.HashSet;
import java.util.Objects;
/*
 * 객체추가시 중복 판단 기준
 * 1.equals 메서드의결과가 true
 * 2.hashCode 메서드의 결과가 같다
 * 1 & 2 모두만족 ㅣ 중복객체로판단
 * 
 * equals , hashCode 메서드를 동시에 오버라이딩하도록 권장
 */
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "(name=" + name + ", age=" + age + ")";
	}

	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}

	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Person) {
			Person p = (Person)obj;
			return name.equals(p.name) && age==p.age;
			//들어온객체가 Person객체를 포함한다면
			//이름과 나이가같으면 같은객체로판단
			}
		else return false;
	}


	}

	public class SetEx2_Person {
		public static void main(String[] args) {
			HashSet<Object> set = new HashSet<>();
			set.add(new String("abc"));
			set.add(new String("abc"));
			set.add(new Person("유동곤",26));
			set.add(new Person("유동곤",26));
			//equals & hashCode 구현 안 할시 중복으로인식해 다 저장됨....
			System.out.println(set);
		}

	}
