package day13;

public class BoardMain {

	public static void main(String[] args) {
		// 기본생성자
		Board b = new Board();
		
		// 매개변수 생성자
		// Board b1 = new Board(1, "title", "김모모", "내용");
		
		// boardWrite 메소드
		b.boardWrite(2, "title1", "홍길동", "내용1");
		
		// boardView 메소드
		b.boardView();
		
		// boardUpdate 메소드
		b.boardUpdate("제목바꿈", "내용바꿈");
		b.boardView();

	}

}
