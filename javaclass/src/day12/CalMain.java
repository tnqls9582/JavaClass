package day12;

public class CalMain {

	public static void main(String[] args) {
		// sum1 메소드
		//  - 정수형 매개변수 2개
		//  - 리턴X, 실행내용은 2개 매개변수의 합 출력
		// sum2 메소드
		//  - 정수형 매개변수 2개
		//  - 정수값(매개변수의 합) 리턴
		// sum1, sum2 메소드를 각각 호출하여 10+20 출력
		
		
		// Cal 클래스 객체 선언
		Cal call = new Cal();
		
		// 리턴이 없는 메소드 호출
		call.sum1(10, 20);
		
		// 리턴이 있는 메소드 호출
		int sum = call.sum2(10, 20);
		System.out.println(sum);
		
		
		
		
		

	}

}
