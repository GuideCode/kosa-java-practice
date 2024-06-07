package task.queueOrder;

public class Main {

	public static void main(String[] args) {
		OrderManager om = new OrderManager();

		while (true) {
			System.out.println("1.주문요청 2.주문처리 3.주문 대기 목록 4.매출액 총액 5.종료");
			String selected = DataInput.sc.nextLine();

			switch (selected) {
			case "1":
				om.addOrder();
				break;
			case "2":
				om.pollOneOrder();
				break;
			case "3":
				om.printWaitingOrder();
				break;
			case "4":
				om.printTotal();
				break;
			case "5":
				System.out.println("프로그램 종료");
				return;
			default:
				break;
			}
		}
	}

}
