package task.restaurant;

public class Main {

	public static void main(String[] args) {
		// MenuItem 객체의 목록을 저장하고, 주문 추가, 삭제, 결제 기능, 총매출 합계 등을 제공
		Order order = new Order();

		while (true) {
			printMenu();
			String selected = DataInput.sc.nextLine();

			switch (selected) {
			case "1":
				System.out.println("1.에피타이저 2.메인 요리 3.디저트");
				String menuSelected = DataInput.sc.nextLine();
				order.addMenuItem(menuSelected);
				break;
			case "2":
				order.deleteMenuItem();
				break;
			case "3":
				
				break;
			case "4":
				
				break;

			default:
				break;
			}
		}
	}

	private static void printMenu() {
		System.out.println("***Restaurant***");
		System.out.println("1.주문 추가 2.주문 삭제 3.주문 결제 4.총매출 합계 5.종료");
	}
}
