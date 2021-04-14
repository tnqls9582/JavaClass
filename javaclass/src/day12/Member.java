package day12;

public class Member {
	String id;
	String password;
	String name;
	int age;
	
	// 기본생성자
	Member(){
		
	}
	
	// 매개변수 생성자
	Member(String id, String password, String name, int age) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
	}
	
	// info메소드
    void info() {
    	System.out.println(this.id);
    	System.out.println(this.password);
    	System.out.println(this.name);
    	System.out.println(this.age);
    }
    
    // update메소드
    void update(String id, String password, String name, int age) {
    	System.out.println(this.name);
    }
    
    // myName메소드
    String myName() {
    	String name = "홍길동";
    	return name;
    }

    
    

}
