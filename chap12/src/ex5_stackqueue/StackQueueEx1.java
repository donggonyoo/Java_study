package ex5_stackqueue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * stack : LIFO( last in first out)
 * stack 클래스 : Vector 클래스의 하위클래스 List객체
 * 주요메서드 : 
 * 			push(Object o ) : 객체를 Stack에추가
 * 			Object pop() : 객체를 stack에서 꺼내기
 * 			Object peek() : Stack에서 다음에 꺼낼 데이터를 조회
 * 
 * 
 * queue : FIFO( firsti in First out)
 * 			인터페이스 LinkedList가 구현클래스임 List객체
 * 			offer(Object o ) : 넣기
 * 			Object poll() : 꺼내기 
 * 			Object peek() : 객체조회
 * 
 * Deque : (ArrayDeque , LinkedList) 성능과 간편함을 잡음
 *  양쪽으로 데이터를 입력하고 출력할 수 있으므로, 
			스택과 큐의 역할을 모두 수행할 수 있다.
			Deque 를 Stack 과 Queue 로 사용하기 위한 메서드 이름까지 제공한다.
			offerFirst() : 앞에 추가한다.  
			offerLast() : 뒤에 추가한다.
			pollFirst() : 앞에서 꺼낸다.
			pollLast() : 뒤에서 꺼낸다. == pop()
 * 
 */
public class StackQueueEx1 {
	public static void main(String[] args) {
		String [] cars = {"Sonata","grandeur","K5","G80"};
		Stack<Object> stack = new Stack<>();
		Queue<Object> queue = new LinkedList<>();
		ArrayDeque<Object> deque = new ArrayDeque<>();
		for (String c : cars) {
			stack.push(c);
			queue.offer(c);
			deque.offer(c);
			
		}
			
		System.out.println("스택에 저장된 객체의 갯수 "+stack.size());
		System.out.println("큐에 저장된 객체의 갯수 "+queue.size());
		System.out.println("데크에 저장된 객체의 갯수 "+deque.size());

		System.out.println("stack:"+stack);
		System.out.println("queue:"+queue);
		System.out.println("deque:"+deque);
		System.out.println("--다음에 꺼낼 데이터 조회--");
		//queue와 deque는 앞에서 꺼냄
		System.out.println(stack.peek());
		System.out.println(queue.peek());
		System.out.println(deque.peekLast());
		System.out.println("--------------");
		//꺼낼 데이터조회만 하는거임 객체의변동X
		
		System.out.println(stack.pop());
		System.out.println(queue.poll());
		System.out.println(deque.pollLast());//마지막에넣은걸 뺴
		
		System.out.println("스택에 저장된 객체의 갯수 : "+stack.size());
		System.out.println("큐에 저장된 객체의 갯수 : "+queue.size());
		System.out.println("데크에 저장된 객체의 갯수 : "+deque.size());
		
		
		
	}

}
