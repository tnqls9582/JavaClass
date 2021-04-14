package day01;

public class Class3_Variables {

	public static void main(String[] args) {
		// 변수 <-> 상수
		// 변수 : 어떠한 값을 담는 공간
		// 사용자가 입력한 값을 변수에 담아서 컴퓨터에 전달
		// 컴퓨터는 변수 값을 확인 후 처리
		// 변수 선언시 변수타입과 이름 필요
		
		int number1;
		// 변수타입 : 정수형(음수,양수,0)
		// 변수이름 : number1
		// 변수에 값 저장
		// = 은 우변 값을 좌변에 대입한다는 뜻!
		// 변수 선언은 컴퓨터 메모리상에 값을 담는 공간을 만든다는 것
		
		number1 = 10;
		// number1 변수에 담긴 값 출력
		System.out.println(number1);
		
		// 변수에 다른 값 대입시 이전 값 사라짐
		number1 = 20;
		System.out.println(number1);
		
		// 변수 이름 작성 시 의미없는 문자 x (a,b,abc...)
		// 숫자로 시작 혹은 숫자만으로 x
		// 영어 소문자를 기본으로 사용 (number, name, address)
		// 두 단어 이상 조합시 (studentNumber, student_number)
		
		/*
		 * 변수 타입
		 * 1. 정수형 변수
		 *    byte
		 *    short
		 *    int
		 *    long
		 *    char
		 * 2. 실수형 변수
		 *    float
		 *    double
		 * 3. 논리형 변수
		 *    boolean : true/false
		 * 4. 문자열 변수
		 *    String -> 대문자!! / 예약어로 표시 안됨
		 */
		// 변수 선언
		int intVar = 10;
		long longVar = 999999999999999L;
		// long 타입 마지막에 대문자 L 붙임
	    float floatVar = 1.2345f;
	    // float 타입 마지막에 f 붙임
	    double doubleVar = 1.2345234;
	    boolean boolVar = true;
	    String strVar = "아무거나 써도 됨~123abc";
	    
	    System.out.println(intVar);
	    System.out.println(longVar);
	    System.out.println(boolVar);
	    System.out.println(strVar);
	    System.out.println(floatVar);
	    System.out.println(doubleVar);
	    
		

	}

}
