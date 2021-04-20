package day16;

import java.util.*;

public class MemberService {
	Scanner scan = new Scanner(System.in);

	/*
	 * 전체회원 조회를 위한 메소드
	 * 메소드 이름 : memberList
	 * 매개변수 : memberList
	 * 리턴 : 없음
	 */

	void memberList(List<Member> memberList) {
		for (int i = 0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i));
		}
	}

	/*
	 * 메소드 이름 : memberLogin
	 * 매개변수 : memberList
	 * 리턴 : 없음
	 */

	void memberLogin(List<Member> memberList) {
		System.out.print("아이디 : ");
		String id = scan.next();
		System.out.print("비밀번호 : ");
		String password = scan.next();
		for (int i = 0; i < memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId()) && password.equals(memberList.get(i).getPassword())) {
				System.out.println(id + "님 환영합니다.");
			} else {
				System.out.println("아이디 또는 비밀번호가 틀립니다.");
			}
		}
	}

	/*
	 * 메소드 이름 : phoneUpdate
	 */

	public List<Member> phoneUpdate(List<Member> memberList) {
		System.out.print("아이디 : ");
		String id = scan.next();
		System.out.print("비밀번호 : ");
		String password = scan.next();
		for (int i = 0; i < memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId()) && password.equals(memberList.get(i).getPassword())) {
				System.out.print("변경할 전화번호 : ");
				String phoneNumber = scan.next();
				memberList.get(i).setPhoneNumber(phoneNumber);
			} else {
				System.out.println("아이디 또는 비밀번호가 틀립니다.");
			}
		}
		return memberList;
	}

}
