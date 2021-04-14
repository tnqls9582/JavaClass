package day04;

import java.util.Scanner;

public class Class3_IfEx {

	public static void main(String[] args) {
		//
		// 배수 판별 프로그램
		// 정수를 입력받아 3의 배수, 5의 배수인지 출력
		// 공배수인 경우 "공배수 입니다." 출력
		
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		System.out.print("숫자를 입력하세요 : ");
		num1 = scan.nextInt();
		
		if (num1>0) {
		    if (num1%3 == num1%5) { // num1%3 = 00 && num1%5 == 0
		    	System.out.println("공배수입니다.");
		    } else if (num1%5 == 0) {
		    	System.out.println("5의 배수입니다.");
		    } else {
		    	System.out.println("3의 배수입니다.");
		    }
		} else {
			System.out.println("양수를 입력하세요.");
		}
		
		
		
		scan.close();
		
		

	}

}
