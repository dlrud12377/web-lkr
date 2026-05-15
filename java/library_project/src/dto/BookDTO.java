package dto;

public class BookDTO {
	// 필드
	private int book_id;
	private String title;
	private String author;
	private int stock;
	
	// 생성자
	public BookDTO(int book_id, String title, String author, int stock) {
		this.book_id = book_id;
		this.title = title;
		this.author = author;
		this.stock = stock;
	}
	
	// 생성자 오버로딩
	public BookDTO(String title, String author, int stock) {
		this.title = title;
		this.author = author;
		this.stock = stock;
	}

	
	// getter/setter
	
	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	

	
	

}
