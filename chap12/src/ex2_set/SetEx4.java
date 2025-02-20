package ex2_set;

import java.util.Set;
import java.util.TreeSet;

class Data implements Comparable<Data>{
	int value;
	Data(int value){
		this.value = value;
	}
	@Override
	public int compareTo(Data o) {
		
		return value-o.value;
	}
	public String toString() {
		return value+"";
	}
}
public class SetEx4 {

	public static void main(String[] args) {
		Set<Data> set =  new TreeSet<Data>((d1,d2)->d1.value - d2.value);
		set.add(new Data(1));
		set.add(new Data(4));
		set.add(new Data(2));
		set.add(new Data(3));
		System.out.println(set);
	}
}
