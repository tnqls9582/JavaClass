package day12;

public class StudentMain {

	public static void main(String[] args) {
		// 기본생성자를 이용한 객체선언
		Student s = new Student();
		
		s.name = "수빈";
		System.out.println(s.name);
		
		s.stuNum = 20150996;
		System.out.println(s.stuNum);
		
		// 매개변수가 있는 생성자를 이용한 객체선언
		Student s1 = new Student("수빈2",20215678);
		System.out.println(s1.name);
		System.out.println(s1.stuNum);
		
		// fieldPrint 메소드 호출
		s.fieldPrint();
		s1.fieldPrint();
		
		// 리턴 메소드 호출
		// 호출 후 리턴값을 활용하는 내용이 필요
		System.out.println("리턴 메소드 호출");
		s.numberMethod();
		
		int a = 0;
		System.out.println(a); // 메소드 호출 전
		a = s.numberMethod();
		System.out.println(a); // 메소드 호출 후
		
		System.out.println(s1.numberMethod());
		
		System.out.println("String 메소드 호출");
		System.out.println(s.stringMethod());
		
		String b = s.stringMethod();
		System.out.println(b);
		
		// 매개변수가 있는 메소드
		Student s2 = new Student();
		int c = s2.numberMethod2(30);
		System.out.println(c);
		
		int number1 = 50;
		c = s2.numberMethod2(number1);
		System.out.println(c);
		
		

	}

}
