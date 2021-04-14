package day04;

import java.util.Scanner;

public class Class1_IfEx {

	public static void main(String[] args) {
		// 증감연산자 (++ --) 변수 앞 또는 뒤에 붙음
		// - 앞 : 1 증감 후 계산
		// - 뒤 : 계산 완료 후 변수값에만 1 증감 적용
		// 스캐너 : Scanner scan = new Scanner(System.in);
		// 스캐너 닫음 : scan.colse();
		// if 조건문
		//-----------------------------------------------
		
		
		// 학점계산기
		// 중첩if문 사용
		// 100 이상의 숫자 사용시 "입력범위 초과!!" 입력

		Scanner scan = new Scanner(System.in);

		int score = 0;
		System.out.print("점수를 입력하세요 : ");
		score = scan.nextInt();

		if (score <= 100) {
			if (score >= 95) {
				System.out.println("당신의 학점은 A+ 입니다.");
			} else if (score >= 90) {
				System.out.println("당신의 학점은 A 입니다.");
			} else if (score >= 85) {
				System.out.println("당신의 학점은 B+ 입니다.");
			} else if (score >= 80) {
				System.out.println("당신의 학점은 B 입니다.");
			} else {
				System.out.println("당신의 학점은 F 입니다.");
			}
		} else {
			System.out.println("입력범위 초과!!");
		}

		// -------------심화----------------
		int score1 = 0;
		System.out.print("점수를 입력하세요. : ");
		score1 = scan.nextInt();
		// 학점을 저장하기 위한 변수
		String grade = "";
		// 변수를 선언할 때 초깃값을 되도록이면 주자

		if (score1 <= 100) {
			if (score1 >= 95) {
				grade = "A+";
			} else if (score1 >= 90) {
				grade = "A";
			} else if (score1 >= 85) {
				grade = "B+";
			} else if (score1 >= 80) {
				grade = "B";
			} else {
				grade = "F";
			}
		} else {
			System.out.println("입력범위 초과!!");
		}
		System.out.println("학점은 " + grade + "입니다.");
		
		
		scan.close();
		

	}

}
