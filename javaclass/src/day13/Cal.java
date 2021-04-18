package day13;

import java.util.Scanner;

public class Cal {
	// 덧셈 메소드 -> 더하는 값을 받아서 출력
	void sum(int num1, int num2) {
		int sum = num1 +num2;
		System.out.println(sum);
	}
	
	// 뺄셈 메소드 -> 출력
	void sub(int num1, int num2) {
		int sub = num1 - num2;
		System.out.println(sub);
	}
	
	// 곱셈 메소드 -> 리턴
	int multi(int num1, int num2) {
		int multi = num1 * num2;
		return multi;
	}
	
	// 나눗셈 메소드 -> 여기서 스캐너!
	int division() {
		Scanner scan = new Scanner(System.in);
		System.out.print("1번숫자 : ");
	    int num1 = scan.nextInt();
	    System.out.print("2번숫자 : ");
	    int num2 = scan.nextInt();
	    int division = num1 / num2;
	    return division;
	}
	
	
	

}
