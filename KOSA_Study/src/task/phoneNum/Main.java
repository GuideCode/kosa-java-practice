package task.phoneNum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static Exception UserNotFoundException = new Exception("검색 결과 없음");

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {
		List<PhoneInfo> manager = new ArrayList<>();

		while (true) {
			printMenu();
			int selected = sc.nextInt();
			switch (selected) {
			case 1:
				addPhoneInfo(sc, manager);
				break;
			case 2:
				listPhoneInfo(manager);
				break;
			case 3:
				try {
					searchPhoneInfo(sc, manager);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				sc.close();
				return;
			default:
				System.out.println("잘못된 입력 값입니다, 재입력 바랍니다.");
				break;
			}
		}
	}
	private static void addPhoneInfo(Scanner sc, List<PhoneInfo> manager) {
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("전화번호: ");
		String phoneNo = sc.next();
		System.out.print("생년월일: ");
		String birth = sc.next();
		PhoneInfo newPhone = new PhoneInfo(name, phoneNo, birth);
		manager.add(newPhone);
		System.out.println("전화번호가 등록 되었습니다.");
	}

	private static void listPhoneInfo(List<PhoneInfo> manager) {
		for (PhoneInfo phone : manager) {
			phone.printInfo();
			System.out.println();
		}
	}

	private static void searchPhoneInfo(Scanner sc, List<PhoneInfo> manager) throws Exception {
		System.out.print("검색 이름: ");
		String searchName = sc.next();
		boolean isUserFound = false;
		for (PhoneInfo phone : manager) {
			if (phone.getName().equals(searchName)) {
				phone.printInfo();
				isUserFound = true;
				break;
			}
		}

		if (!isUserFound) {
			throw UserNotFoundException;
		}
	}

	public static void printMenu() {
		System.out.println("============메뉴============");
		System.out.println("1. 추가 2. 전체출력 3. 검색 4. 종료");
	}

}
