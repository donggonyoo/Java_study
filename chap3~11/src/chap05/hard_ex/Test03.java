package chap05.hard_ex;

import java.util.Iterator;

/*
2단	      3단	  4단	5단	
2*2=4	3*2=6	4*2=8	5*2=10	
2*3=6	3*3=9	4*3=12	5*3=15	
......  ......  ......  ......
2*8=16	3*8=24	4*8=32	5*8=40	
2*9=18	3*9=27	4*9=36	5*9=45	

6단	    7단	    8단	    9단	
6*2=12	7*2=14	8*2=16	9*2=18	
6*3=18	7*3=21	8*3=24	9*3=27	
......  ......  ......  ......
6*8=48	7*8=56	8*8=64	9*8=72	
6*9=54	7*9=63	8*9=72	9*9=81	 * 
 */

public class Test03 {
	public static void main(String[] args) {
		for(int k=2 ;k<=5 ;k++)
		{
			System.out.print(k+"단    ");
		}System.out.println();
		for (int i = 2; i <= 9 ; i++) {

			for (int j = 2; j <= 5; j++)
			{

				System.out.print(j+"*"+i+"="+(i*j)+" ");
			}System.out.println();

		}System.out.println("\n");
		for(int h=6 ;h<=9 ;h++)
		{
			System.out.print(h+"단    ");
		}System.out.println();
		for (int l = 2; l <= 9 ; l++) {

			for (int m = 6; m <= 9; m++)
			{

				System.out.print(m+"*"+l+"="+(m*l)+" ");
			}System.out.println();



		}
	}}

