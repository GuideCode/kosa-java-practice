package board;

import java.util.Scanner;

public class Manager {
	private Article[] list;
	private Scanner sc;
	private int count;

	public Manager() {
		this.list = new Article[10];
		this.sc = new Scanner(System.in);
	}

	public void addArticle() {
		System.out.print("작성자: ");
		String writer = sc.nextLine();
		System.out.print("제목: ");
		String title = sc.nextLine();
		System.out.print("내용: ");
		String content = sc.nextLine();

		this.list[count++] = new Article(count, writer, title, content);
	}

	public void listArticleInfo() {
		for (int i = 0; i < count; i++) {
			list[i].showInfo();
		}
	}

	public void editArticle() {
		listArticleInfo();
		System.out.print("수정할 글 번호 입력");
		int selected = sc.nextInt();
		System.out.print("수정 사항(내용)작성: ");
		this.list[selected].setContent(sc.nextLine());
		System.out.println("수정 완료");
	}

}
