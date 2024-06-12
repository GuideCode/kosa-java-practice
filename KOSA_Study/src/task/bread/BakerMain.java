package task.bread;

public class BakerMain {

	public static void main(String[] args) {
		BakerManager m = new BakerManager();

		Baker b1 = new Baker("명장", m);
		Baker b2 = new Baker("제자", m);
		Baker b3 = new Baker("신입", m);

		BreadCustomer c1 = new BreadCustomer("청년", m);
		BreadCustomer c2 = new BreadCustomer("중년", m);
		BreadCustomer c3 = new BreadCustomer("아이", m);

		b1.start();
		c1.start();

		b2.start();
		c2.start();

		b3.start();
		c3.start();

	}

}
