package test_setMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/*
 * MapEx2의 예제를 이용하기
 *
 * 조회를 입력했을 경우
 * 제목,저자,가격순으로 조회되도록 프로그램 수정하기
 *  
 * 검색을 입력했을 경우 
 * 제목,저장,가격으로 검색하도록 프로그램을 수정하기
 * 
 * [결과]
1.추가 2.삭제 3.조회 4.검색 0.종료
3
정렬 방식을 입력하세요 (1.제목 2.저자 3.가격)
1
(춘향전,미상,5000)
(홍길동전,허균,10000)

1.추가 2.삭제 3.조회 4.검색 0.종료
4
도서를 검색합니다.
조회 기준을 입력하세요 (1.제목 2.저자 3.가격)
1 
제목을 입력하세요
홍길동전
조회 정보 : (홍길동전,허균,10000) 입니다.
 */
class Book implements Comparable<Book>{
	String title;
	String author;
	int price;
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "(" + title + "," + author + "," + price + ")";
	}
	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.title);
	}
	


}

public class Test3_A {
	private static Map<String,Book> books = new HashMap<>();

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);

		//확인용
		books.put("안녕", new Book("안녕", "하이", 10000));
		books.put("채식주의자", new Book("채식주의자", "한강", 5000));
		books.put("가나다", new Book("가나다", "당근", 8000));
		books.put("유동곤", new Book("유동곤", "당근", 8000));
		books.put("마라", new Book("마라", "수박", 2000));
		//확인용


		while(true) {
			try {
				System.out.println("1.추가 2.삭제 3.조회 4.검색 0.종료");
				int choose = scan.nextInt();
				if(choose==0)break;
				switch(choose) {
				case 1-> {addBoook();}
				case 2-> {deleteBook();}
				case 3-> {printBook();}
				case 4-> {searchBook();}
				default-> System.out.println("잘못된 입력입니다 1 2 3 4 0 중에입력 ");

				}
			}
			catch (InputMismatchException e) {
				System.out.println("1,2,3,4,0 숫자만 입력하세요");
				scan.next();
			}

		}

	}
	private static void searchBook() {
		Scanner scan = new Scanner(System.in);
		System.out.println("책 검색 시작");
		List<Book> bookList = new ArrayList<>(books.values());
		//		Set<Book> bookset = new HashSet<>(books.values());
		System.out.println("검색기준 입력 : 1(제목) 2(저자) 3(가격) (아무거나입력시 제목!)");
		
		try {
			int num = scan.nextInt();
			ArrayList<Book> bookList2 = new ArrayList<Book>();
			switch(num) {
			case 1->{
				System.out.print("제목을 입력하세요");
				String next = scan.next();
				Book book2 = null;
				for (Book book : bookList) {
					if(book.title.equals(next)){
						System.out.println(book);
						return;//return으로 현재메서드를 종료하고 호출한곳으로 가게 됨 (104번째줄)
						//map의 key값은 중복될수없으니 제목은 중복되는게 없을거다
					}
				}
				//			for(Book book : bookset) {
				//				if(book.title.equals(next)){
				//					System.out.println(book);
				//						return;
				//				} 검색은 Set도 가능한 것을 확인
				//			}
			}
			case 2->{
				System.out.print("저자를 입력하세요");
				String next = scan.next();
			
				for (Book book : bookList) {
					if(book.author.equals(next)){
						bookList2.add(book);
						}
					}
				}
			case 3->{
				System.out.print("가격을 입력하세요");
				int price = scan.nextInt();
				for (Book book : bookList) {
					if(book.price==price){
						bookList2.add(book);
					}
				}
			}

			default->{
				System.out.println("잘못된 입력 ");
				return;
					}
				}
			//swich문 종료 후
			if(bookList2.size()==0) {
				System.out.println("존재하지않는 도서");
				}
			else {
				System.out.println(bookList2);
			}
		}
		catch(InputMismatchException e) {
			System.out.println("숫자만 입력");
			scan.next(); 
			return;
		}
	}
	private static void printBook() {
		Scanner scan = new Scanner(System.in);
		System.out.println("도서목록 조회");
		System.out.println("조회방식을 입력하세요 1제목 2저자 3가격(아무거나입력시 제목 순)");
		try {
			int print = scan.nextInt();
			List<Book> bookList = new ArrayList<>(books.values());
			switch(print) {
			case 1->Collections.sort(bookList);//객체에 제목으로 compare을 오버라이딩해놨음
			case 2->{Collections.sort(bookList,//저자로 정렬(compareTo활용)
				(s1,s2)->s1.author.compareTo(s2.author));}
			case 3->{Collections.sort(bookList,
				(s1,s2)->s1.price-s2.price);}//가격으로 정렬
			default ->Collections.sort(bookList);
			}
			for (Book book : bookList) {
				System.out.println(book);
			}
		}
		catch(InputMismatchException e) {
			System.out.println("숫자만 입력 ");
			scan.next();
		}


	}
	private static void deleteBook() {
		Scanner scan = new Scanner(System.in);
		System.out.printf("삭제 할 책 이름을 입력 : ");
		String title = scan.next();
		Book remove = books.remove(title);//key값으로 삭제할요소를 찾아냄
		if(remove ==null) {
			System.out.println("없는 도서에요");}
		else {
			System.out.println(remove+" 삭제 완료");
			System.out.println("현재 도서 재고 : "+books);}
	}

	private static void addBoook() {
		System.out.println("도서를 추가할게요 ");
		Scanner scan = new Scanner(System.in);
		System.out.printf("제목 : ");
		String title = scan.next();
		System.out.printf("저자 : ");
		String author = scan.next();
		System.out.printf("가격 : ");
		try {
			int price = scan.nextInt();
			Book book = new Book(title, author, price);
			books.put(title,book);
			System.out.println(book+" 도서 추가");}
		catch(InputMismatchException e){
			System.out.println("처음부터 다시입력해주세요");
			scan.next();

		}

	}
}
