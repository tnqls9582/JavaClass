package day11;

public class People {
	// 필드선언
	String name;
	int age;
	String nation; // 파란색 = 필드
	
	
	// 생성자 선언 (생성자의 이름은 클래스 이름과 같다)
	//--- 기본생성자 ---
	People() {
		nation = "대한민국"; // 안써도됨!
	}
	
	//--- 매개변수가 있는 생성자 ---
	// 매개변수를 사용하는 이유
	// -> 생성자에서 필드값을 셋팅하거나 메소드에서 처리할 값을 넘길 때
	People(String name, int age) { // ** 괄호 안이 매개변수 (갈색) **
		this.name = name;
		this.age = age;
	}
	// 넘겨받은 매개변수를 필드값으로 저장
	// 매개변수 이름과 필드 이름은 동일하게 하는것이 일반적
	// 구분을 위해 this. 붙임 (필드를 지칭할 때)
	// -> this. 가 없으면 변수로 인식
	
	

}
