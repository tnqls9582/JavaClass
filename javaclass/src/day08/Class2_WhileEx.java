package day08;

import java.util.Scanner;

public class Class2_WhileEx {

	public static void main(String[] args) {
		// 문자열이 같은지 비교할 경우
		String str1 = "가가가";
		String str2 = "나나나";
		String str3 = "가가가";
		// 문자열이 같은지 판단할 때 == 사용하지 않고 equals() 사용
		if(str1.equals(str3) ) {
			System.out.println("두 값이 같다.");
		} else {
			System.out.println("두 값이 다르다.");
		}
		
		
		if(str1.equals(str2) ) {
			System.out.println("두 값이 같다.");
		} else {
			System.out.println("두 값이 다르다.");
		}
		
		
		
		
		//--------------예제-----------------
		Scanner scan = new Scanner(System.in);
		String enter = "", stop = "종료";
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 '종료'를 입력하세요");
		
		boolean run = true;
		while(run) {
			System.out.print(">");
			enter = scan.next();
			System.out.println(enter);
			if(enter.equals(stop)) {
				System.out.println("프로그램 종료");
				run = false;
			}
		}
		
		
		
		// do while 사용할 때
	    System.out.println("메시지를 입력하세요");
	    System.out.println("프로그램을 종료하려면 '종료'를 입력하세요");
	    String inputString = "";
	    boolean run1 = true;
	    do {
	    	System.out.print(">");
	    	inputString = scan.next();
	    	System.out.println(inputString);
	    	if(inputString.equals("종료")) {
	    	    run = false;
	    	}
	    } while(run1);
	    System.out.println();
	    System.out.println("프로그램 종료");
	    
	    
		scan.close();
		

	}

}
