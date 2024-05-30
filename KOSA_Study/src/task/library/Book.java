package task.library;

public class Book {
	private long ISBN; // 책 고유번호
	private String title;
	private String author;
	private String category;

	public Book() {
	}

	public Book(long iSBN, String title, String author, String category) {
		ISBN = iSBN;
		this.title = title;
		this.author = author;
		this.category = category;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	};

	public void showBook() {
		System.out.println("책 이름: " + title);
		System.out.println("저자: " + author);
		System.out.println("장르: " + category);
	}

}
