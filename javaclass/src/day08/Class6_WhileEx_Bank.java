package day08;

import java.util.Scanner;

public class Class6_WhileEx_Bank {

	public static void main(String[] args) {
		// 입금, 출금, 잔액조회 기능만 있음
		// 초기 잔액은 0
		
		Scanner scan = new Scanner(System.in);
		
		
		int num = 0, money = 0, sum = 0;
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			num = scan.nextInt();
			if(num==1) {
				System.out.print("예금액> ");
				money = scan.nextInt();
			    sum = sum + money;
				System.out.println("현재 잔액은 "+sum+"입니다.");
				System.out.println();
			} else if(num==2) {
				System.out.print("출금액> ");
				money = scan.nextInt();
				if(sum>money) {
					sum = sum - money;
					System.out.println("현재 잔액은 "+sum+"입니다.");
					System.out.println();
				} else {
					System.out.println("잔고가 부족합니다.");
					System.out.println("현재 잔액은 "+sum+"입니다.");
				    System.out.println();
				}
			} else if(num==3) {
				System.out.println("현재 잔액은 "+sum+"입니다.");
				System.out.println();
			} else if(num==4) {
				System.out.println("종료합니다.");
				System.out.println();
			    run = false;
			}
		}
		
		
		
		// switch case 활용해서
		int balance = 0; // 잔고
		int deposit = 0; // 입금
		int withdraw = 0; // 출금
		int select = 0; // 번호선택
		select = scan.nextInt();
		
		boolean run1 = true;
		while(run1) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			select = scan.nextInt();
			switch(select) {
			case 1 :
				System.out.println("에금액> ");
				deposit = scan.nextInt();
				balance += deposit;
				System.out.println("현재잔액은 "+balance+"입니다.");
				break;
			case 2 :
				System.out.println("출금액> ");
				withdraw = scan.nextInt();
				if(withdraw>balance) {
					System.out.println("잔액이 부족합니다.");
					System.out.println("현재 잔액은 "+balance+"입니다.");
				} else {
					balance -= withdraw;
					System.out.println("현재 잔액은 "+balance+"입니다.");
				}
				break;
			case 3 :
				System.out.println("현재 잔액은 "+balance+"입니다.");
				break;
			case 4 :
				System.out.println("종료합니다.");
				run1 = false;
				break;
			}
		}
		
		
		
		scan.close();
		
		

	}

}
