package day16;

import java.util.*;

public class BoardService {

	Scanner scan = new Scanner(System.in);

	// 전체글목록 메소드 - boardList
	void boardList(List<BoardDTO> boardList) {
		for (int i = 0; i < boardList.size(); i++) {
			System.out.println(boardList.get(i));
		}
	}

	// 글조회 메소드 - inquiry
	void inquiry(List<BoardDTO> boardList) {
		System.out.print("글번호 : ");
		int number = scan.nextInt();
		for (int i = 0; i < boardList.size(); i++) {
			if (number == boardList.get(i).getNumber()) {
				System.out.println(boardList.get(i).getTitle());
				System.out.println(boardList.get(i).getPassword());
				System.out.println(boardList.get(i).getWriter());
				System.out.println(boardList.get(i).getContents());
			}
		}

	}

	// 글수정 메소드 - revise
	public List<BoardDTO> revise(List<BoardDTO> boardList) {
		System.out.print("글번호 : ");
		int number = scan.nextInt();
		System.out.print("비밀번호 : ");
		String password = scan.next();
		for (int i = 0; i < boardList.size(); i++) {
			if (number == boardList.get(i).getNumber() && password.equals(boardList.get(i).getPassword())) {
				System.out.print("수정 할 내용 : ");
				String contents = scan.next();
				boardList.get(i).setContents(contents);
			} else {
				System.out.println("비밀번호가 틀립니다.");
			}
		}
		return boardList;
	}

	// 글삭제 메소드 - delete
	public void delete(List<BoardDTO> boardList) {
		System.out.print("글번호 : ");
		int number = scan.nextInt();
		System.out.print("비밀번호 : ");
		String password = scan.next();
		for (int i = 0; i < boardList.size(); i++) {
			if (number == boardList.get(i).getNumber() && password.equals(boardList.get(i).getPassword())) {
				boardList.remove(i);
				System.out.println("삭제되었습니다.");
			} else {
				System.out.println("비밀번호가 틀립니다.");
			}

		}

	}
	
	
	
}
