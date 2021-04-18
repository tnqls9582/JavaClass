package day12;

public class MemberMain {

	public static void main(String[] args) {
		// 객체 선언
		Member mem = new Member();
		mem.id = "tnqls123";
		mem.password = "abc00~";
		mem.name = "수빈";
		mem.age = 26;
		mem.info();
		mem.update("빈수");
		mem.info();
		mem.myName();
		String b = mem.myName();
		System.out.println(b);
		
		
		// 매개변수 생성자를 이용한 객체
		Member mem1 = new Member("idid", "pwpw", "비니", 24);
		
		// info메소드 호출
		mem1.info();
		
		// update메소드 호출
		mem1.update("홍길동");
		
		// myName메소드 호출
		mem1.myName();
		String a = mem.name;
		System.out.println(a); // 리턴이 있는 메소드는 호출만 하고 끝나지 않음
		
		

	}

}
