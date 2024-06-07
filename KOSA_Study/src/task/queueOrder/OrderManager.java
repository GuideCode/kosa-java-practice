package task.queueOrder;

import java.util.Iterator;
import java.util.LinkedList;

public class OrderManager {

	private LinkedList<Food> waitingOrder = new LinkedList<Food>();
	private LinkedList<Food> endOrder = new LinkedList<Food>();

	public void addOrder() {

		System.out.print("음식 이름: ");
		String foodName = DataInput.sc.nextLine();
		System.out.print("가격: ");
		int price = DataInput.sc.nextInt();
		DataInput.sc.nextLine();

		Food newFood = new Food(foodName, price);
		waitingOrder.offer(newFood);

		System.out.println("주문 요청이 완료되었습니다.");
	}

	public void pollOneOrder() {

		printWaitingOrder();
		

		if (!waitingOrder.isEmpty()) {
			Food f = waitingOrder.poll();
			endOrder.offer(f);
			System.out.println(f.getFoodName()+" : 주문 처리 완료");

		} else {
			System.out.println("대기중인 주문이 없습니다.");
		}

	}

	public void printTotal() {
		int total = 0;
		Iterator iter = endOrder.iterator();
		while (iter.hasNext()) {
			Food f = (Food) iter.next();
			total += (int) f.getPrice();
		}

		System.out.println("총 결제 가격: " + total);
	}

	public void printWaitingOrder() {
		Iterator iter = waitingOrder.iterator();

		while (iter.hasNext()) {
			Food f = (Food) iter.next();
			f.show();
		}

	}

}
