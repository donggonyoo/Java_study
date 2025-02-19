package chap05.test2;
/*
11*11 크기의 사각형이 있다고 가정할때 다음 결과를 출력되도록 프로그램 작성하기

X□■□■□■□■□X       x : length - 1 -i(행)
□X□■□■□■□X□       □ : 행이 짝수 : 짝수 열 번호
■□X□■□■□X□■           행이 홀수 : 홀수 열 번호
□■□X□■□X□■□
■□■□X□X□■□■
□■□■□X□■□■□
■□■□X□X□■□■
□■□X□■□X□■□
■□X□■□■□X□■
□X□■□■□■□X□
X□■□■□■□■□X                    

■ : ㅁ 한자
□ : ㅁ 한자
*/
public class Test6_1 {
	public static void main(String[] args) {
		int size=11;
		String[][] a =  new String[size][size];
		
		
		//String 배열의 초기화는 필수임
		//초기화안할시 다 null값이므로 다른것을 찍을 수 없게됨
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if(i%2==0) {
					if(j%2==0) {
						a[i][j] = "□";
					}else {
						a[i][j] = "■";
					}
				}else {
					if(j%2==1) {
						a[i][j] = "□";
					}else {
						a[i][j] = "■";
					}
				}
			}
		}
		int b=a.length-1;
		int c =0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][b] = "X";
				a[i][c] = "X";
			}b--;c++;
		}
		
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}System.out.println();
			
		}
	}
}
