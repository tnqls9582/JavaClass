package day12;

public class MemberMain {

	public static void main(String[] args) {
		// 객체 선언
		Member mem = new Member();
		mem.id = "tnqls123";
		mem.password = "abc00~";
		mem.name = "수빈";
		mem.age = 26;
		
		// info메소드 호출
		mem.info();
		
		// update메소드 호출
		mem.update("tnqls123", "abc00~", "홍길동", 26);
		
		// myName메소드 호출
		mem.myName();
		String a = mem.name;
		System.out.println(a);
		
		

	}

}
