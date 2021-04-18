package day14;

public class Student {
	// 접근제한자 : public, default, protected, private
	// - public : 누구나 접근 가능
	// - private : 클래스 내에서만 접근 가능. 다른 클래스에서 접근 불가능. 필드 앞에 붙여서 사용
	
	
	// 이름, 전화번호, 주소 필드
	// 기본생성자 & 모든 필드를 매개변수로 하는 생성자
	
	// 필드
    private String name;
    private String phone; // int로 할때 맨앞 0 안나옴
    private String address;
	
	// 기본생성자
	Student() {
		
	}
	
	// 매개변수 생성자
	Student(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	
	// name 필드의 getter
	// - 필드값을 가져다 쓸 때 (필드값 타입의 리턴 있음)
	public String getName() {
		return name;
	}

	// name 필드의 setter
	// - 필드값을 바꿀 때 (리턴 없음)
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	// 필드는 private으로 선언하고
	// getter, setter 메소드
	
	
	
	
	
	

}
