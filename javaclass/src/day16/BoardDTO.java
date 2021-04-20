package day16;

public class BoardDTO {
	private int number;
	private String title;
	private String password;
	private String writer;
	private String contents;
	
	BoardDTO() {
		
	}
	
	BoardDTO(int number, String title, String password, String writer, String contents) {
		this.number = number;
		this.title = title;
		this.password = password;
		this.contents = contents;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return "BoardDTO [number=" + number + ", title=" + title + ", password=" + password + ", writer=" + writer
				+ ", contents=" + contents + "]";
	}
	
	

}
