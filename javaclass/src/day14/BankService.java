package day14;

import java.util.*;
// Service 클래스 : 처리를 담당하는 클래스(비즈니스 클래스)
public class BankService {
	// 입금 처리를 위한 메소드 선언
	/*
	 * 메소드 이름 : deposit
	 * 매개변수 : BankList
	 * 리턴 : BankList
	 * (Main Class가 가장 최신의 데이터를 가져야 하기 때문)
	 */
	Scanner scan = new Scanner(System.in);
	
	
	List<Bank> deposit(List<Bank> BankList) {
		System.out.print("계좌번호 : ");
	    String accountNumber = scan.next();
		System.out.print("입금액> ");
		int deposit = scan.nextInt();
		for(int i=0; i<BankList.size(); i++) {
			if(accountNumber.equals(BankList.get(i).getAccountNumber())) {
				int balance = BankList.get(i).getBalance() + deposit;
				BankList.get(i).setBalance(balance);
			}
		}
		return BankList;
	}
	
	
	
	/*
	 * 메소드 이름 : withdraw
	 * 매개변수 : BankList
	 * 리턴 : BankList
	 */
	List<Bank> withdraw(List<Bank> BankList) {
		System.out.print("계좌번호 : ");
	    String accountNumber = scan.next();
	    System.out.print("출금액> ");
	    int withdraw = scan.nextInt();
	    for(int i=0; i<BankList.size(); i++) {
	    	if(accountNumber.equals(BankList.get(i).getAccountNumber())) {
	    		if(BankList.get(i).getBalance() >= withdraw) {
	    			int balance = BankList.get(i).getBalance() - withdraw;
	    			BankList.get(i).setBalance(balance);
	    		} else {
	    			System.out.println("잔액이 부족합니다.");
	    		}
	    	} else {
	    		System.out.println("없는 계좌입니다.");
	    	}
	    }
	    return BankList;
	    
	    
	}

}
