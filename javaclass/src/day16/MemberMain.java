package day16;

import java.util.*;

public class MemberMain {

	public static void main(String[] args) {
		// 회원정보 : 아이디, 비밀번호, 이름, 전화번호
		// 주요기능 : 회원가입, 전체회원조회, 로그인, 전화번호변경
		// 모든 회원의 정보는 memberList에 저장
		// 로그인 기능
		//  - 아이디, 비밀번호가 모두 맞으면 "___님 환영합니다" 출력
		//  - 둘 중 하나라도 틀리면 "아이디 또는 비밀번호가 틀립니다" 출력
		// 전화번호 변경 기능
		//  - 아이디, 비밀번호 확인 후 모두 맞으면 변경할 전화번호를 입력받고 전화번호 변경
		// 회원가입을 제외한 모든 기능은 MemberService 클래스에서 담당
		
		Scanner scan = new Scanner(System.in);
		
		Member mem = null;
		
		MemberService ms = new MemberService();
		
		List<Member> memberList = new ArrayList<Member>();
		
		boolean run = true;
		int select = 0;
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.회원가입 2.전체회원조회 3.로그인 4.전화번호변경 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			select = scan.nextInt();
			if(select == 1) {
				mem = new Member();
				System.out.print("아이디 : ");
				mem.setId(scan.next());
				System.out.print("비밀번호 : ");
				mem.setPassword(scan.next());
				System.out.print("이름 : ");
				mem.setName(scan.next());
				System.out.print("전화번호 : ");
				mem.setPhoneNumber(scan.next());
				memberList.add(mem);
			} else if(select == 2) {
				// 전체회원 조회를 위한 memberList 메소드 호출
				ms.memberList(memberList);
			} else if(select == 3) {
				// 로그인을 위한 memberLogin 메소드 호출
				ms.memberLogin(memberList);
			} else if(select == 4) {
				// 전화번호 변경을 위한 phoneUpdate 메소드 호출
				memberList = ms.phoneUpdate(memberList);
			} else if(select == 5) {
				System.out.println("종료합니다.");
				run = false;
			}
		}
		
		
		
		
		scan.close();
		
		
		

	}

}
