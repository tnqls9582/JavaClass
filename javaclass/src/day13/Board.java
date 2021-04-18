package day13;

public class Board {
	// 필드
	int bNumber;
	String bTitle;
	String bWriter;
	String bContents;
	
	// 기본생성자
	Board() {
		
	}
	
	// 매개변수 생성자
	Board(int bNumber, String bTitle, String bWriter, String bContents) {
		this.bNumber = bNumber;
		this.bTitle = bTitle;
		this.bWriter = bWriter;
		this.bContents = bContents;
	}
	
	// boardWrite 메소드 -> 모든 필드를 메소드로
    void boardWrite(int bNumber, String bTitle, 
    		String bWriter, String bContents) {
    	this.bNumber = bNumber;
		this.bTitle = bTitle;
		this.bWriter = bWriter;
		this.bContents = bContents;
    }
    
    // boardView 메소드 -> 모든 필드값 출력
    void boardView() {
    	System.out.println(this.bNumber);
    	System.out.println(this.bTitle);
    	System.out.println(this.bWriter);
    	System.out.println(this.bContents);
    }
    
    // boardUpdate 메소드 -> 제목과 내용 수정
    void boardUpdate(String bTitle, String bContents) {
    	this.bTitle = bTitle;
    	this.bContents = bContents;
    }
	

}
