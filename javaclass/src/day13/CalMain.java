package day13;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Cal c = new Cal();
		
		int select = 0;
		int num1 = 0, num2 = 0;
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1. + | 2. - | 3. X | 4. / | 5. 종료");
			System.out.println("-----------------------------------");
			System.out.print("번호선택> ");
			select = scan.nextInt();
			if(select == 1) {
				// 덧셈 메소드 호출
				num1 = 10;
				num2 = 20;
				c.sum(num1, num2);
			} else if(select == 2) {
				// 뺄셈 메소드 호출 -> 스캐너로 입력받아 메소드로 전달
				System.out.print("1번숫자 : ");
			    num1 = scan.nextInt();
			    System.out.print("2번숫자 : ");
			    num2 = scan.nextInt();
			    c.sub(num1, num2);
			} else if(select == 3) {
				// 곱셈 메소드 호출 -> 스캐너
				System.out.print("1번숫자 : ");
			    num1 = scan.nextInt();
			    System.out.print("2번숫자 : ");
			    num2 = scan.nextInt();
			    int multi = c.multi(num1, num2);
			    System.out.println(multi);
			} else if(select == 4) {
				// 나눗셈 메소드 호출 -> 호출만!
				int division = c.division();
				System.out.println(division);
			} else if(select == 5) {
				System.out.println("종료합니다");
			    run = false;
			}
		}
		
		
		scan.close();
		

	}

}
