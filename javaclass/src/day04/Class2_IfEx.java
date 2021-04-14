package day04;

import java.util.Scanner;

public class Class2_IfEx {

	public static void main(String[] args) {
		//
		/*
		 * 홀,짝 판별 프로그램
		 * 짝수 = 어떠한 숫자를 2로 나눠서 나머지가 0
		 * num1%2 == 0
		 */
		Scanner scan = new Scanner(System.in);

		int num1 = 0;
		System.out.print("숫자를 입력해 주세요 : ");
		num1 = scan.nextInt();

		if (num1>0) {
			if (num1%2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		} else {
			System.out.println("0보다 큰 수를 입력하세요");
		}
		
		
		scan.close();
		
		
		
		
	}

}
