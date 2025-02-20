package ex3_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Book{
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
	
	
}

public class MapEx2_Book {
	private static Map<String,Book> books = new HashMap<>();
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
	
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
		System.out.print(" 제목을 입력하세요 : ");
		String name = scan.next();
		Book book = books.get(name);
		if(book==null) {
			System.out.println("존재하지않는제목");
		}
		else {
			System.out.println(book);	
		}
	}
	private static void printBook() {
		System.out.println("도서목록 조회");
		Collection<Book> values = books.values();
		for (Book book : values) {
			System.out.println(book);
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
