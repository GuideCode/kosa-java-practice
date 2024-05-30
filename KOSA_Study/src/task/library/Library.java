package task.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private long id;
	private String name;
	private String location;
	private List<Book> books;
	private List<Member> members;

	public Library() {

	}

	public Library(long id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.books = new ArrayList<>();
		this.members = new ArrayList<>();
		;
	}

	public void join(Member member) {
		members.add(member);
	}

	public Member findByMemberId(int id) {
		for (Member member : members) {
			if (member.getId() == id) {
				return member;
			}
		}
		return null;
	}

	public Member findByMemberName(String name) {
		for (Member member : members) {
			if (member.getName().equals(name)) {
				return member;
			}
		}
		return null;
	}

	public void searchMember(String name) {
		Member findMember = findByMemberName(name);
		if (findMember == null)
			System.out.println("찾으시는 회원이 존재하지 않습니다.");
		else
			findMember.showUser();
	}

	public void deleteMember(String name) {
		Member findMember = findByMemberName(name);
		if (members.remove(findMember))
			System.out.println("성공적으로 삭제되었습니다.");
		else
			System.out.println("삭제하려는 회원이 존재하지 않습니다.");
	}

	// -----------------------

	public void addNewBook(Book book) {
		if (books.contains(book)) {
			System.out.println("이미 등록되어 있는 책입니다.");
		} else {
			books.add(book);
			System.out.println("새로운 책 등록이 완료되었습니다.");
		}
	}

	// book return
	public Book findByBookTitle(String title) {
		for (Book book : books) {
			if (book.getTitle().equals(title)) {
				return book;
			}
		}
		return null;
	}

	// book search
	public void searchBook(String title) {
		Book book = findByBookTitle(title);
		if (book == null) {
			System.out.println("찾으려는 책이 존재하지 않습니다.");
		} else {
			book.showBook();
		}
	}

	public void deleteBook(String title) {
		Book book = findByBookTitle(title);

		if (book == null) {
			System.out.println("삭제하려는 책이 존재하지 않습니다.");
		} else {
			books.remove(book);
			System.out.println("책 삭제 완료되었습니다.");
		}

	}

	public List<Book> getBooks() {
		return books;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void showLibrary() {
		System.out.println("도서관 이름: " + name);
		System.out.println("위치: " + location);
	}

}