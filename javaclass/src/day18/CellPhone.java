package day18;

// Phone의 자식클래스
public class CellPhone extends Phone {
	
	// 필드
	String button;
	String messsage;
	
	// 기본생성자
	CellPhone() {
		
	}
	
	// button, model, company를 매개변수로 하는 생성자
	CellPhone(String button, String model, String company) {
		this.button = button; // CellPhone 필드
		this.model = model; // Phone 필드
		this.company = company; // Phone 필드
		// model, company 필드는 상속을 받았기 때문에 CellPhone이 가지고 있지 않아도 바로 사용 가능
	}
	
	// 메소드
	void sendMessage(String message) {
		System.out.println("메세지 전송"+message);
	}
	
	// 메소드 오버로딩 : 메소드 이름은 같지만 매개변수 타입이나 갯수가 다른것
	void sendMessage() {
		System.out.println("매개변수가 없는 메소드");
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	// 메소드 재정의(오버라이딩) : 상속받은 메소드의 내용을 수정하거나 바꾸는것 (메소드 이름은 그대로 유지)
	// @ Annotation(어노테이션) 
	
	@Override // 재정의를 제대로 했는지 안했는지 체크하는 용
	void hangOn() {
		System.out.println("CellPhone으로 전화를 겁니다.");
	    System.out.println("CellPhon 전화");
	}
	
	
	
	
	

}
