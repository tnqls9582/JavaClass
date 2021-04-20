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
		
		Bank b1 = null;
		
		Bank b2 = null;
		
		// Service 클래스 객체
		BankService bs = new BankService();
		
		List<Bank> BankList = new ArrayList<Bank>();
		
		int select = 0;
		int deposit = 0;
		int withdraw = 0;
		int balance = 0;
		String accountNumber = "";
		boolean run = true;
	    while(run) {
	    	System.out.println("----------------------------------------------------------------------");
			System.out.println("1.고객등록(get,set) | 2.고객등록(생성자) | 3.입금 | 4.출금 | 5.고객리스트 | 6.종료");
			System.out.println("----------------------------------------------------------------------");
			System.out.print("선택> ");
			select = scan.nextInt();
			if(select == 1) {
				b1 = new Bank();
				b1.setClientNumber(BankList.size()+1);
				System.out.print("이름 : ");
				b1.setName(scan.next());
				System.out.print("계좌번호 : ");
				b1.setAccountNumber(scan.next());
				System.out.print("입금액 : ");
				deposit = scan.nextInt();
				b1.setBalance(deposit);
				BankList.add(b1);
			} else if(select == 2) {
				b2 = new Bank(BankList.size()+1,"이름2","계좌2",0);
				System.out.print("이름 : ");
				b2.setName(scan.next());
				System.out.print("계좌번호 : ");
				b2.setAccountNumber(scan.next());
				System.out.print("입금액 : ");
				deposit = scan.nextInt();
				b2.setBalance(deposit);
				BankList.add(b2);
			} else if(select == 3) {
//				System.out.print("계좌번호 : ");
//				accountNumber = scan.next();
//				System.out.print("입금액> ");
//				deposit = scan.nextInt();
//				for(int i=0; i<BankList.size(); i++) {
//					if(accountNumber.equals(BankList.get(i).getAccountNumber())) {
//						// String 타입 비교시 == 아니고 .equals() 사용 ()안에 비교대상
//						balance = BankList.get(i).getBalance() + deposit;
//						BankList.get(i).setBalance(balance);
//					}
//				}
				BankList = bs.deposit(BankList);
			} else if(select == 4) {
//				System.out.print("계좌번호 : ");
//			    accountNumber = scan.next();
//			    System.out.print("출금액> ");
//			    withdraw = scan.nextInt();
//			    for(int i=0; i<BankList.size(); i++) {
//			    	if(accountNumber.equals(BankList.get(i).getAccountNumber())) {
//			    		if(BankList.get(i).getBalance() >= withdraw) {
//			    			balance = BankList.get(i).getBalance() - withdraw;
//			    			BankList.get(i).setBalance(balance);
//			    		} else {
//			    			System.out.println("잔액이 부족합니다.");
//			    		}
//			    	} else {
//			    		System.out.println("없는 계좌입니다.");
//			    	}
//			    }
			} else if(select == 5) {
				for(int i=0; i<BankList.size(); i++) {
					System.out.println(BankList.get(i));
				}
			} else if(select == 6) {
				System.out.println("종료합니다.");
				run = false;
			}
	    }
	    
	    
	    
		

	}

}
