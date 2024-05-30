package task.library;

import java.util.ArrayList;

public class Member {

	private int id;
	private String name;
	private String birth;
	private String phoneNumber;
	private ArrayList<Book> rentalBooks;

	public Member() {

	}

	public Member(int id, String name, String birth, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.birth = birth;
		this.phoneNumber = phoneNumber;
		this.rentalBooks = new ArrayList<Book>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public ArrayList<Book> getRentalBooks() {
		return rentalBooks;
	}

	public void setRentalBooks(ArrayList<Book> rentalBooks) {
		this.rentalBooks = rentalBooks;
	}

	public void retalBook(Book book) {
		rentalBooks.add(book);
	}

	public void returnBook(Book book) {
		rentalBooks.remove(book);
	}

	public void showUser() {
		System.out.println("이름: " + name);
		System.out.println("생년월일: " + birth);
		System.out.println("전화번호: " + phoneNumber);
		showRentalBooks();
	}

	public void showRentalBooks() {
		for (Book book : rentalBooks) {
			// print bookInfo
			book.showBook();
		}
	}

}
