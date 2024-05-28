package task.book;

public class Main {

	public static void main(String[] args) {
		Book java = new Book("Java", 30000);
		Book jsp = new Book("JSP", 20000);
		Book oracle = new Book("Oracle", 15000);

		java.discount();
		jsp.discount();
		oracle.discount();
		
		java.printPrice();
		jsp.printPrice();
		oracle.printPrice();
		
		System.out.println("총금액: "+(java.getDcPrice()+jsp.getDcPrice()+oracle.getDcPrice())+"원");
	}

}
