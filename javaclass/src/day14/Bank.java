package day14;

public class Bank {
	// 은행 고객에 대한 정보를 정의한 클래스
	// 필드(private 접근제한)
	// - 고객번호(clientNumber), 고객명(name), 계좌번호(accountNumber), 잔고(balance)
	// 생성자 두가지 모두
	
	private int clientNumber;
	private String name;
	private String accountNumber;
	private int balance;
	
    Bank() {
    	
    }
    
    Bank(int clientNumber, String name, String accountNumber, int balance) {
    	this.clientNumber = clientNumber;
    	this.name = name;
    	this.accountNumber = accountNumber;
    	this.balance = balance;
    }

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Bank [clientNumber=" + clientNumber + ", name=" + name + ", accountNumber=" + accountNumber
				+ ", balance=" + balance + "]";
	}
	
	
	
	

}
