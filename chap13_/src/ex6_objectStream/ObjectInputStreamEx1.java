package ex6_objectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * ObjectOutputStream을 이용해 객체를 저장한 Object.ser파일 읽기
 */
public class ObjectInputStreamEx1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//ois스트림 : object.ser파일에서 객체를  읽을 수 있는 스트림
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.ser"));
		int data=0;
		Customer c1 = (Customer) ois.readObject();//object->Customer로 다운캐스팅
		Customer c2 = (Customer) ois.readObject();//readObject() 메서드의 리턴타입 : Object
		
		
		
//		Object c1 =  ois.readObject();
//		Object c2 =  ois.readObject(); 출력은 다운캐스팅을 하나 안하나 똑같음
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
