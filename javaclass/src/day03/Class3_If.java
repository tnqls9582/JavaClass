package day03;

import java.util.Scanner;

public class Class3_If {

	public static void main(String[] args) {
		/*
		 * 조건문(if else / switch case) if(condition) { 조건이 true면 실행 } else { 조건이 false면
		 * 실행 } condition 자리는 비교연산식, 논리연산식, boolean변수, T, F 등이 올 수 있다.
		 */

		boolean con;
		con = true;

		System.out.println("if문 시작");
		if (con) {
			System.out.println("if부분 실행됨");
		} else {
			System.out.println("else부분 실행됨");
		}
		System.out.println("if문 끝"); // "if부분 실행됨" 만 실행

		
		// if 조건 비교연산식 활용
		int num1 = 0, num2 = 0;
		num1 = 100;
		num2 = 50;

		if (num1 > num2) {
			// num1이 크면 이 부분 실행
			System.out.println("num1이 큽니다.");
		} else {
			// num2가 크면 이 부분 실행
			// 같을 때도 실행 (거짓이니까)
			System.out.println("num2가 큽니다.");
		}

		if (num1 > num2 && num1 > 0) {
			// 두 조건 모두 충족시
			System.out.println("num1이 큽니다.");
		} else {
			// 두 조건 중 하나라도 맞지 않을시
			System.out.println("num2가 큽니다.");
		}

		
		// 여러개의 조건을 따질 때
		int num3 = 5, num4 = 3;

		if (num3 > 0) {

		} else if (num3 > num4) {

		} else if (num4 > 0) {

		} else {

		}

		
		// -------------예제--------------
		Scanner scan = new Scanner(System.in);
		int score = 0;
		System.out.print("점수를 입력하세요. : ");
		score = scan.nextInt();

		if (score >= 90) {
			System.out.println("A학점 입니다.");
		} else if (score >= 80) {
			System.out.println("B학점 입니다.");
		} else if (score >= 70) {
			System.out.println("C학점 입니다.");
		} else if (score >= 60) {
			System.out.println("D학점 입니다.");
		} else {
			System.out.println("F학점 입니다.");
		}
		
		
		/*
		 * 중첩 if문
		 * if(서류 문제 없음) {
		 *      if(면접 잘 봄) {
		 *          합격
		 *      } else {
		 *        불합격
		 *      }
		 * } else if(조건식) {
		 * 
		 * } else {
		 * 
		 * }
		 */
		
	     scan.close();
	     
		
		

	}

}
