package ex7_other;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;

public class GGG {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream a =new ObjectInputStream(new FileInputStream("tt.ser"));
		
		HashMap<Object,Object> hashMap = new HashMap<Object,Object>();
		hashMap.put(1, "a");
		hashMap.put(2, "b");
		hashMap.put(3, "v");
		hashMap.put(4, "d");
		hashMap.put(5, "e");
		Object object = hashMap.get(1);
	
	}

}
