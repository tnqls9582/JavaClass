package day14;

public class People {
	// 접근제한자 private
	// 이름, 주민번호, 주소, 나이
	// 기본생성자 & 매개변수 생성자
	
	// 필드
	private String name;
	private String rNumber;
	private String address;
	private int age;
	
	// 기본생성자
	People() {
		
	}
	
	// 매개변수 생성자
	People(String name, String rNumber, String address, int age) {
		this.name = name;
		this.rNumber = rNumber;
		this.address = address;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getrNumber() {
		return rNumber;
	}

	public void setrNumber(String rNumber) {
		this.rNumber = rNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override // to String 메소드 선언하면 객체 이름만으로 출력 가능
	public String toString() {
		return "People [name=" + name + ", rNumber=" + rNumber + ", address=" + address + ", age=" + age + "]";
	}
	
	

}
