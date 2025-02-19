package ex5_constructor;

public class Car {
	String color;
	int num;
	static int width = 200;
	static int height = 120;
	
	Car(){};
	Car(String c , int n){
		color = c;
		num = n;
	}
	Car(String c){
		color = c;
		num= 1234;
	}
	Car (int n){
		color = "White";
		num = n;
	}
	
	public String toString() {
		return color+","+num+"("+width+","+height+")";
	}

}
