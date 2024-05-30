package task.library;

import java.util.Scanner;

public class Main {

	public static String bookIcon = Character.toString(0x1F4D5);
	public static String searchIcon = Character.toString(0x1F50D);
	public static String booksIcon = Character.toString(0x1F4DA);
	public static String userIcon = Character.toString(0x1F464);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Library library = new Library(1, "혜화 도서관", "서울시 종로구 혜화로 혜화길 15");

		int memberId = 1;
		int bookId = 1;
		System.out.println(bookIcon + "  도서 관리 시스템  " + bookIcon);
		while (true) {
			System.out.println("이용하실 서비스를 선택해주세요!");
			System.out.println("1.도서 관리 서비스  2.회원 관리 서비스 3.대출/반납 서비스");
			System.out.print("> ");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) { // 도서 관리
				subMenu1: while (true) {
					System.out.println("메뉴를 선택해주세요 > (1.책 등록 2.책 검색" + searchIcon + " 3.책 목록 4.책 삭제 5.이전 화면으로)");
					System.out.print("> ");
					int subMenu = Integer.parseInt(sc.nextLine());
					switch (subMenu) {
					case 1:
						addNewBook(sc, library, bookId);
						break;
					case 2:
						searchBook(sc, library);
						break;
					case 3:
						showBooks(library);
						break;
					case 4:
						deleteBook(sc, library);
						break;

					case 5:
						break subMenu1;
					}
				}

			} else if (menu == 2) { // 회원 관리
				subMenu2: while (true) {
					System.out.println("메뉴를 선택해주세요!  (1.회원 등록 2.회원 검색" + searchIcon + " 3.회원 목록 4.회원 삭제 5.이전 화면으로)");
					System.out.print("> ");
					int subMenu = Integer.parseInt(sc.nextLine());
					switch (subMenu) {
					case 1:
						addMember(sc, library, memberId);
						break;
					case 2:
						searchMember(sc, library);
						break;
					case 3:
						showMemberList(library);
						break;
					case 4:
						deleteMember(sc, library);
						break;
					case 5:
						break subMenu2;
					}
				}
			}

			else if (menu == 3) {
				subMenu3: while (true) {

					// 유저 선택
					System.out.print("로그인할 유저 아이디: ");
					int id = Integer.parseInt(sc.nextLine());
					Member member = library.findByMemberId(id);
					if (member == null) {
						System.out.println("존재하지 않는 회원입니다.");
						continue;
					}
					// ----------------------------------
					System.out.println("메뉴를 선택해주세요!  (1. 대출 2. 반납)");
					System.out.print("> ");
					int subMenu = Integer.parseInt(sc.nextLine());
					switch (subMenu) {
					case 1:
						// 대출
						System.out.print("대여할 책 이름: ");
						String rentaltitle = sc.nextLine();
						Book rentalBook = library.findByBookTitle(rentaltitle);
						member.retalBook(rentalBook);
						System.out.println(rentalBook.getTitle() + " 대여 완료했습니다.");
						break;
					case 2:
						// 반납
						System.out.print("반납할 책 이름");
						String returnTitle = sc.nextLine();
						Book returnBook = library.findByBookTitle(returnTitle);
						member.returnBook(returnBook);
						System.out.println(returnBook.getTitle() + " 반납 완료했습니다.");
						break;
					case 3:
						break subMenu3;
					}
				}
			} else
				System.out.println("잘못된 선택지 입니다. 1번과 2번에서 골라주세요!");
		}
	}

	// ------------------------------------------------------------
	// 도서 관리부
	private static void addNewBook(Scanner sc, Library library, int bookId) {
		System.out.print("책 제목: ");
		String title = sc.nextLine();
		System.out.print("저자: ");
		String author = sc.nextLine();
		System.out.print("장르: ");
		String category = sc.nextLine();

		Book newBook = new Book(bookId++, title, author, category);
		library.addNewBook(newBook);
	}

	private static void searchBook(Scanner sc, Library library) {
		System.out.print("검색할 책 제목: ");
		String title = sc.nextLine();
		library.searchBook(title);
	}

	private static void showBooks(Library library) {
		if (library.getBooks().isEmpty()) {
			System.out.println("등록된 책이 없습니다.");
		} else {
			for (Book book : library.getBooks()) {
				book.showBook();
			}
		}
	}

	private static void deleteBook(Scanner sc, Library library) {
		System.out.print("삭제할 책 이름: ");
		String title = sc.nextLine();
		library.deleteBook(title);
	}

	// ------------------------------------------------------------
	// 회원 관리부
	private static void addMember(Scanner sc, Library library, int memberId) {
		System.out.print("회원 명 : ");
		String name = sc.nextLine();
		System.out.print("생년월일 : ");
		String birth = sc.nextLine();
		System.out.print("핸드폰 번호 : ");
		String phoneNumber = sc.nextLine();
		library.join(new Member(memberId++, name, birth, phoneNumber));
	}

	private static void searchMember(Scanner sc, Library library) {
		System.out.print("검색할 회원의 이름을 입력해주세요 : ");
		library.searchMember(sc.nextLine());
	}

	private static void showMemberList(Library library) {

		if (library.getMembers().isEmpty()) {
			System.out.println("가입된 회원이 없습니다.");
		} else {
			for (Member member : library.getMembers())
				member.showUser();
		}
	}

	private static void deleteMember(Scanner sc, Library library) {
		System.out.print("삭제할 회원의 이름을 입력해주세요 : ");
		library.deleteMember(sc.nextLine());
	}

}