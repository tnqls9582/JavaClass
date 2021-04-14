package day12;

public class Cal {
	// 필드 선언
	int num1;
	int num2;
	
	
	// 메소드를 정의할 때
	// -> 리턴타입, 메소드이름, 매개변수유무, 실행내용(리턴유무) 유의
	
	// sum1메소드(리턴X)
	void sum1(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	
	// sum2메소드(리턴ㅇ)
	int sum2(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	

}
