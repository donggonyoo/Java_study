package test;

/*
다음 결과가 출력되도록 동물(Animal)클래스와 구동클래스(Test2)를 구현하기       

 동물클래스(Animal)
    멤버변수 : 이름(name), 나이(age)
    멤버메서드: eat() ;
         기능 : "맛있게 얌얌" 출력
[결과]
     이름(name):원숭이
     나이(age):20
     맛있게 얌얌   
*/

class Animal{
	String name;
	int age;
	private String eat() {
		return "냠냠";
	}
	public String toString() {
		return "이름(name): "+name+"\n"+
				"나이(age) : "+age+"\n"+eat();
	}
}
public class Test2 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.name = "원숭이";
		animal.age = 20;
		System.out.println(animal);
		
	}
}
