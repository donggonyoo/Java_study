package ex6_objectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


/*
 * ObjectOutputStream예제
 * 1. 객체를 외부로전송 할 수 있는 스트림
 * 2. 외부전송이 가능한 객체는 반드시 Serializable 인터페이스를 구현해야함
 * 		==> 직렬화
 * 		==> Serializable 인터페이스를 구현하지않은 객체를 외부전송시 
 *  						NotSerializableException발생
 *  3.ObjectOutputStream으로 전송된객체는 ObjectInputStream객체로읽음
 * 
 * Serializable 인터페이스의 멤버 없음!!
 */

@SuppressWarnings("serial")//warning표시 안 하겠단 에노테이션

class Customer implements Serializable{//꼭 구현!
	private String name;
	private  int age;
	//transient : 직렬화 대상의 객체에서 해당멤버는 제외
	private transient int pw;
	public Customer(String name, int age,int pw) {
		super();
		this.name = name;
		this.age = age;
		this.pw = pw;
	}
	@Override
	public String toString() {
		return name +","+ age +","+pw ;
	}
	
}
public class ObjectOutputSteamEx1 {
	public static void main(String[] args) throws IOException {
		//fos스트림의 목적지 : object.ser
		FileOutputStream fos = new FileOutputStream("object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos/*목적지*/);
		Customer c1 = new Customer("하이", 44,9844);
		Customer c2 = new Customer("루", 24,5312);
		System.out.println(c1);
		System.out.println(c2);
		
		oos.writeObject(c1);//c1객체를 object.ser로 전송
		oos.writeObject(c2);//c2객체를 object.ser로 전송
		oos.close();
		fos.close();
		
		
		

	}
}
