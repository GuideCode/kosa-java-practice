package board;

public class Article {

	private int index;
	private String writer;
	private String title;
	private String content;

	public Article(int index, String writer, String title, String content) {
		super();
		this.index = index;
		this.writer = writer;
		this.title = title;
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void showInfo() {
		System.out.println("번호: "+this.index+" 작성자: " + this.writer);
		System.out.println("제목: " + this.title);
		System.out.println(this.content);
		System.out.println("---------------------");

	}

}
