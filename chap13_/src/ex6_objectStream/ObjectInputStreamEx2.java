package ex6_objectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx2 {

	public static void main(String[] args) throws  IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("object2.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		UserInfo u1= (UserInfo)ois.readObject();
		UserInfo u2= (UserInfo)ois.readObject();
		System.out.println(u1);
		System.out.println(u2);
	}
}
