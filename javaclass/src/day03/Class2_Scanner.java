package day03;

import java.util.Scanner;

public class Class2_Scanner {

	public static void main(String[] args) {
		//
		// 스캐너 기능을 사용하기 위한 스캐너 객체 선언
		Scanner scan = new Scanner(System.in);
		// scan 부분만 변경 가능 (변수같은 개념)
		// Scanner 에 빨간줄
		// import.java.util 로 없애기 (3번줄 import에 뜸!)
		// 라이브러리를 사용할 때
		
		String name = "초깃값", address = "주소초깃값";
		int age = 10;
		
		System.out.println("스캐너 입력 전 name : "+name);
		System.out.print("이름을 입력하세요 : "); // 안내문구 작성용
		name = scan.next(); // 스캐너 클래스에서 제공하는 next() 메소드를 이용하여 String 값을 입력받을 수 있음
		// 입력한 값을 name 변수에 대입하는 문장
		System.out.println("스캐너로 입력한 name :"+name);
		
	    System.out.println("스캐너 입력 전 address : "+address);
	    System.out.print("주소를 입력하세요 : ");
	    address = scan.next();
	    System.out.println(address);
	    
	    // 정수값을 받을 때는 nextInt() 메소드 사용
	    System.out.println("스캐너 입력 전 age : "+age);
	    System.out.print("나이를 입력하세요 : ");
	    age = scan.nextInt();
	    System.out.println(age);
	    
	    // 띄어쓰기, 긴 문장 사용시 nextLine() 메소드 사용
	    scan.nextLine();
	    
	    System.out.print("문장을 입력하세요 : ");
	    String sent = "문장";
	    sent = scan.nextLine();
	    System.out.println(sent);
	    
	    
	    //----------------예제-------------------
	    int num1 = 0, num2 = 0;
	    System.out.print("첫번째 숫자를 입력하세요 : ");
	    num1 = scan.nextInt();
	    System.out.print("두번째 숫자를 입력하세요 : ");
	    num2 = scan.nextInt();
	    int num3;
	    num3 = num1 + num2;
	    System.out.print("덧셈 결과는 "+num3+"입니다.");
	    
	    
		
		
		scan.close();		

	}

}
