package task.restaurant;

public class Order {

	private MenuItem[] menuList;
	private int count;

	public Order() {
		this.menuList = new MenuItem[10];
	}

	public void addMenuItem(String menuSelected) {
		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		System.out.print("가격: ");
		int price = Integer.parseInt(DataInput.sc.nextLine());
		System.out.print("설명: ");
		String description = DataInput.sc.nextLine();

		// appetizer
		if (menuSelected.equals("1")) {
			System.out.print("칼로리: ");
			int calories = Integer.parseInt(DataInput.sc.nextLine());
			MenuItem appetizer = new Appetizer(name, price, description, calories);
			menuList[count++] = appetizer;
			System.out.println("에피타이저 주문 완료");

			// main course
		} else if (menuSelected.equals("2")) {
			System.out.print("비건: 예/아니오 : 기본값: false");
			String selected = DataInput.sc.nextLine();
			boolean vegetarian = false;
			if (selected.equals("예")) {
				vegetarian = true;
			}
			MenuItem mainCourse = new MainCourse(name, price, description, vegetarian);
			menuList[count++] = mainCourse;
			System.out.println("메인코스 주문 완료");

			// Dessert
		} else if (menuSelected.equals("3")) {
			System.out.print("글루텐프리: 예/아니오 : 기본값: false");
			String selected = DataInput.sc.nextLine();
			boolean glutenFree = false;
			if (selected.equals("예")) {
				glutenFree = true;
			}
			MenuItem dessert = new Dessert(name, price, description, glutenFree);
			menuList[count++] = dessert;
			System.out.println("디저트 주문 완료");
		} else {
			System.out.println("잘못된 선택입니다.");
		}

	}

	public void deleteMenuItem() {
		System.out.print("삭제할 주문(요리) 이름: ");
		String selected = DataInput.sc.nextLine();

		for (int i = 0; i < count; i++) {
			if (selected.equals(menuList[i].getName())) {
				if (i == count) {
					menuList[i] = null;
					break;
				}else {
					for (int j = i; j < count - 1; j++) {
						menuList[j] = menuList[j + 1];
					}
				}
				
			}
		}
		System.out.println(selected+" 주문 삭제 완료");
	}
}
