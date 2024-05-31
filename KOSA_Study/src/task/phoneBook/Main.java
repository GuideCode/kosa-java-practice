package task.phoneBook;

public class Main {

	// 0531 last mission
	public static void main(String[] args) {
		Manager m = new Manager();
		while (true) {
			printMenu();
			String selected = DataInput.sc.nextLine();
			switch (selected) {

			// add---------------------------------
			case "1":
				addPhoneInfo(m);
				break;
			// print-----------------------------------
			case "2":
				printPhoneInfo(m);
				break;
			case "3":
				System.out.println("프로그램 종료");
				return;
			default:
				break;
			}
		}
	}

	private static void printPhoneInfo(Manager m) {
		System.out.println("1.전체 2.회사 3.동창");
		String printCategory = DataInput.sc.nextLine();
		switch (printCategory) {
		case "1":
			m.printAllPhoneInfo();
			break;
		case "2":
			m.printCompanyInfo();
			break;
		case "3":
			m.printUniverseInfo();
			break;
		default:
			break;
		}
	}

	private static void addPhoneInfo(Manager m) {
		System.out.println("1.일반 2.회사 3.동창");
		String addCategory = DataInput.sc.nextLine();
		switch (addCategory) {
		case "1":
			m.addPhoneInfo();
			break;
		case "2":
			m.addCompanyPhoneInfo();
			break;
		case "3":
			m.addUniversePhoneInfo();
			break;
		default:
			break;
		}
	}

	private static void printMenu() {
		System.out.println("***메뉴***");
		System.out.println("1.추가 2.출력 3.종료");
	}

}
