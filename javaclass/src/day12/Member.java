package day12;

public class Member {
	String id;
	String password;
	String name;
	int age;
	
	// 기본생성자 -> 생성자 이름은 클래스 이름과 같아야함
	Member(){
		
	}
	
	// 매개변수 생성자
	Member(String id, String password, String name, int age) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
	}
	
	// info메소드 (리턴X, 매개변수X)
    void info() {
    	System.out.println(this.id);
    	System.out.println(this.password);
    	System.out.println(this.name);
    	System.out.println(this.age);
    }
    
    // update메소드 (리턴X, 매개변수O) -> name을 매개변수로 받아서 필드에 넣어라
    void update(String name) {
    	this.name = name;
    }
    
    // myName메소드 (리턴O, 매개변수X) -> name 필드값을 리턴
    String myName() {
    	return this.name;
    }

    
    

}
