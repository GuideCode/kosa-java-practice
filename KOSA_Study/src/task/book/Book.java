package task.book;

public class Book {

	private String name;
	private int price;
	private int dcPrice;

	public Book() {

	}

	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getDcPrice() {
		return dcPrice;
	}

	public void discount() {
		if (this.price >= 30000) {
			this.dcPrice = (this.price * 75) / 100;
		} else if (this.price >= 20000) {
			this.dcPrice = (this.price * 80) / 100;
		} else if (this.price >= 15000) {
			this.dcPrice = (this.price * 85) / 100;
		}
	}

	public void printPrice() {
		System.out.println(this.name + " 교재는 정가는 " + this.price + "원 할인된 가격은 " + this.dcPrice + "원 입니다.");
	}

}
