package ex5_constructor.exam;

public class EastCard {
	int num;
	boolean isKwang;
	
	public EastCard() {
		num = 1;
		isKwang = true;
	}
	
	public EastCard(int num , boolean isKwang) {
		this.num = num;
		if(num==1||num==3 || num==8) {
			this.isKwang = isKwang;
		}else {
			this.isKwang = false;
		}
	}
	
	public String toString() {
		return num+""+(isKwang==true?"K":" ");
	}

}
