package day16;

import java.util.*;

public class BoardMain {

	public static void main(String[] args) {
		// 게시글 정보 : 글번호, 글제목, 비밀번호, 작성자, 내용
		// 주요기능 : 글쓰기, 전체글목록, 글조회, 글수정, 글삭제
		// - 글쓰기 : 글번호를 제외한 모든 항목을 입력하고 글번호는 자동으로 하나씩 올라가도록 한다.
		// - 글조회 : 글번호를 입력하면 해당 글의 상세정보가 출력된다.
		// - 글수정 : 글번호, 비밀번호를 입력하고 정보가 맞으면 제목, 내용을 수정할 수 있고
		//          수정이 완료되면 해당글의 상세내용을 출력한다
		// - 글삭제 : 글번호, 비밀번호를 입력하고 맞으면 해당글 삭제
		// 글쓰기를 제외한 모든 기능은 BoardService에서 처리
		
		Scanner scan = new Scanner(System.in);
		List<BoardDTO> boardList = new ArrayList<BoardDTO>();
	    BoardDTO board = null;
	    BoardService bs = new BoardService();
	    
		boolean run = true;
		int select = 0;
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.글쓰기 2.전체글목록 3.글조회 4.글수정 5.글삭제 6.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			select = scan.nextInt();
			if(select == 1) {
				board = new BoardDTO();
				board.setNumber(boardList.size()+1);
				System.out.print("글제목 : ");
				board.setTitle(scan.next());
				System.out.print("비밀번호 : ");
				board.setPassword(scan.next());
				System.out.print("작성자 : ");
				board.setWriter(scan.next());
				System.out.print("내용 : ");
				board.setContents(scan.next());
				boardList.add(board);
			} else if(select == 2) {
				// 전체글목록
				bs.boardList(boardList);
			} else if(select == 3) {
				// 글조회
			    bs.inquiry(boardList);
			} else if(select == 4) {
				// 글수정
				boardList = bs.revise(boardList);
			} else if(select == 5) {
				// 글삭제
			    boardList = bs.delete(boardList);
			} else if(select == 6) {
				System.out.println("종료합니다.");
				run = false;
			}
				
		}
		scan.close();

	}

}
