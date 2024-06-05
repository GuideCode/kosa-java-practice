package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMission {

	public static void main(String[] args) {
		// List 자료구조를 활용하여 키보드로부터 문자열을 입력받아 처리하자.
		List<String> list = new ArrayList<String>();
		// 1. 데이터 추가 2. 데이터 삭제 3. 데이터 출력
		Scanner sc = new Scanner(System.in);

		while (true) {
			printMenu();
			String selected = sc.nextLine();
			switch (selected) {
			case "1":
				addData(sc, list);
				break;
			case "2":
				removeData(sc, list);
				break;
			case "3":
				printData(sc, list);
				break;
			case "4":
				System.out.println("프로그램 종료");
				return;

			default:
				break;
			}
		}

	}

	private static void printData(Scanner sc, List<String> list) {
		for (String s : list) {
			System.out.println(s);
		}
	}

	private static void removeData(Scanner sc, List<String> list) {
		System.out.print("입력: ");
		String remove = sc.nextLine();
		if (list.contains(remove)) {
			list.remove(remove);
			System.out.println("삭제 완료");
		} else {
			System.out.println("존재하지 않는 데이터");
		}
	}

	private static void addData(Scanner sc, List<String> list) {
		System.out.print("입력: ");
		String newInput = sc.nextLine();
		list.add(newInput);
		System.out.println("추가 완료");

	}

	private static void printMenu() {
		System.out.println("1.데이터 추가 2.데이터 삭제 3.데이터 출력 4.종료");
		System.out.print("입력: ");
	}

}
