package chap05;

public class ArrayEx08 {
	public static void main(String[] args) {
		int[][] arr1 = new int[3][2];
		arr1[0] = new int[]{10,20};
		arr1[1] = new int[]{30,40};
		arr1[2] = new int[]{50,60};
		
		int[][]arr ={{10,20},
					 {30,40},
					 {50,60}};
		System.out.println("==arr1==");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print("arr["+i+"]["+j+"]="+arr1[i][j]);
				if(j!=arr1[i].length-1) {System.out.print(",");} //마지막 열 제외하고 , 를 찍는다
			}System.out.println();
		}
		
		System.out.println("==arr==");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]);
				if(j!=arr[i].length-1) {System.out.print(",");}
			}System.out.println();
		}
	}
}
