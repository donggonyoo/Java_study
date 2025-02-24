package ex6_objectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class UserInfo{
	protected String name;
	protected String password;
	public UserInfo() {};
	public UserInfo(String name , String password) {
		this.name = name;
		this.password = password;
	}
	public String toString() {
		return name+","+password;
	}
}

class User extends UserInfo implements Serializable{
	private int age;
	public User(String name , String password , int age) {
		super(name,password);
		this.age = age;
	}
	public String toString() {
		return super.toString()+","+age;
	}
	
	//부모객체의 멤버를 직렬화에 추가하기
	//User클래스내에서 자동으로 메서드를실행함
	private void writeObject(ObjectOutputStream out) throws IOException{
		out.writeUTF(name);//protected이므로 접근가능
		out.writeUTF(password);//부모의문자열을 OutputStream에저장
		out.defaultWriteObject();
		//나머지것(age)을 다 보내란 뜻
	}
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
		name = in.readUTF();
		password = in.readUTF();
		in.defaultReadObject();
	}
}
	



public class ObjectOutputStreamEx2 {
	public static void main(String[] args) throws  IOException, ClassNotFoundException {
		
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("object2.ser"));
		UserInfo u1 = new User("유동곤", "1233", 24);
		UserInfo u2 = new User("김삿갓", "643", 16);
		os.writeObject(u1);
		os.writeObject(u2);
		System.out.println(u1);
		System.out.println(u2);
		os.close();	
	}

}
