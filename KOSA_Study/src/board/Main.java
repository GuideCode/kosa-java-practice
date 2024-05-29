package board;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();

		while (true) {
			System.out.println("1.추가 2.전체출력 3.수정 4.종료");
			System.out.print("메뉴입력: ");
			String selected = sc.nextLine();

			switch (selected) {
			case "1":
				m.addArticle();
				break;
			case "2":
				m.listArticleInfo();
				break;
			case "3":
				m.editArticle();
				break;
			case "4":
				System.out.println("프로그램 종료");
				return;

			default:
				break;
			}
		}
	}

}
