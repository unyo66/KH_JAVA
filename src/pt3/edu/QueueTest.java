package pt3.edu;
import java.util.*;

public class QueueTest {

	public static void main(String[] args) {
		/*
		 add : 데이터 추가, 큐가 꽉 찬 경우 예외 발생
		 remove : 데이터 삭제, 예외 발생
		 element : 데이터 검사, 예외 발생
		 
		 offer : 데이터 추가, 큐가 꽉 찬 경우 false 리턴
		 poll : 데이터 삭제, 큐가 빈 경우 false 리턴
		 peek : 데이터 검사, 큐가 빈 경우 false 리턴
		 */
		Queue<String> q = new LinkedList<>();
		
		System.out.println("poll로 삭제 : " + q.poll());
		try
		{
			System.out.println("remove로 삭제 : " + q.remove());
		}
		catch (NoSuchElementException e)
		{
			System.out.println("큐가 비었습니다.");
		}
		
		System.out.println("offer로 추가 " + q.offer("바나나"));
		try 
		{
			System.out.println("add로 추가 " + q.add("체리"));
		} 
		catch (IllegalStateException e)
		{
			System.out.println("헤드 엿보기 : " + q.peek());
		}
				
		String head = null;
		try
		{
			head = q.remove();
			System.out.println(head + " 제거하기");
			System.out.println("새로운 헤드 : " + q.element());
		}
		catch (NoSuchElementException e)
		{
			
		}
		
		head = q.poll();
		System.out.println(head + " 제거하기");
		System.out.println("새로운 헤드 : " + q.peek());
		
		System.out.println("체리를 포함하고 있나요? " + q.contains("체리"));
		System.out.println("사과를 포함하고 있나요? " + q.contains("사과"));
	}

}
