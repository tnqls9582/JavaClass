package day14;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {
		// 1. 고객등록(getter/setter 이용)
		//    - 고객 정보는 스캐너를 이용하여 입력받고 모든 정보는 ArrayList에 저장됨
		// 2. 고객등록(생성자 이용)
		//    - 고객 정보는 스캐너를 이용하여 입력받고 모든 정보는 ArrayList에 저장됨
		// 3. 입금
		//    - 입금시 계좌번호, 입금금액을 스캐너로 입력받고 해당 계좌에 입금금액을 추가함
		// 4. 출금
		//    - 출금시 계좌번호, 출금금액을 스캐너로 입력받고 해당 계좌에서 인출함(잔액부족시 출금불가)
		
		Scanner scan = new Scanner(System.in);
		
		Bank b1 = new Bank();
		b1.setClientNumber(1);
		b1.setName("이름");
		b1.setAccountNumber("계좌");
		b1.setBalance(0);
		
		Bank b2 = new Bank(2,"이름2","계좌2",0);
		
		int select = 0;
		int deposit1 = 0;
		int withdraw1 = 0;
		int deposit2 = 0;
		int withdraw2 = 0;
		int sum1 = 0;
		int sum2 = 0;
		boolean run = true;
	    while(run) {
	    	System.out.println("----------------------------------------------------------------------");
			System.out.println("1.고객등록(get,set) | 2.고객등록(생성자) | 3.입금 | 4.출금 | 5.고객리스트 | 6.종료");
			System.out.println("----------------------------------------------------------------------");
			System.out.print("선택> ");
			select = scan.nextInt();
			if(select == 1) {
				System.out.print("이름 : ");
				b1.setName(scan.next());
				System.out.print("계좌번호 : ");
				b1.setAccountNumber(scan.next());
				System.out.print("입금액 : ");
				deposit1 = scan.nextInt();
				sum1 += deposit1;
				b1.setBalance(sum1);
			} else if(select == 2) {
				System.out.print("이름 : ");
				b2.setName(scan.next());
				System.out.print("계좌번호 : ");
				b2.setAccountNumber(scan.next());
				System.out.print("입금액 : ");
				deposit2 = scan.nextInt();
				sum2 += deposit2;
				b2.setBalance(sum2);
			} else if(select == 3) {
				System.out.print("계좌번호 : ");
			    String accountNumber = scan.next();
			    if(b1.getAccountNumber() == accountNumber) {
			    	System.out.print("입금액> ");
			    	deposit1 = scan.nextInt();
			    	sum1 += deposit1;
			    } else if(b2.getAccountNumber() == accountNumber) {
			    	System.out.print("입금액> ");
			    	deposit2 = scan.nextInt();
			    	sum2 += deposit2;
			    }
			} else if(select == 4) {
				
			} else if(select == 5) {
				
			} else if(select == 6) {
				System.out.println("종료합니다.");
				run = false;
			}
	    }
	    
	    
	    
		

	}

}
