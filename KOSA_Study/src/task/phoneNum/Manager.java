package task.phoneNum;

import java.util.Scanner;

// 전화번호 관리 전반적인 기능
public class Manager {

	// 필드 변수들은 기본적으로 초기값이 존재함 (null 또는 0)
	private PhoneInfo arr[];
	private Scanner sc;
	private int count;

	public Manager() {
		arr = new PhoneInfo[10];
		sc = new Scanner(System.in);
	}

	public void addPhoneInfo() {
		// 키보드로부터 이름, 전화번호, 생년월일을 입력받아
		// PhoneInfo를 생성해서 배열에 추가하는 것
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNo = sc.nextLine();
		System.out.print("생년월일: ");
		String birth = sc.nextLine();

		arr[count++] = new PhoneInfo(name, phoneNo, birth);
		System.out.println(count);
	}

	public void listPhoneInfo() {
		System.out.println("**전체내역**");
		for (int i = 0; i < count; i++) {
			arr[i].show();
		}
	}

	public void searchPhoneInfo() {
		// 검색하고자 하는 이름으로 1개의 PhoneInfo객체의 내용을 출력한다.
		System.out.print("이름: ");
		String name = sc.nextLine();

		int idx = -1;

		for (int i = 0; i < count; i++) {
			if (arr[i].getName().equals(name)) {
				arr[i].show();
				idx = i;
			}
		}

		if (idx == -1) {
			System.out.println("유저를 찾을 수 없습니다.");
		}

	}

	public void updatePhoneInfo() {
		// 이름 입력 => 해당 phoneInfo 추출 => 수정 전화번호 입력 => 전화번호 수정 완료
		System.out.print("이름: ");
		String name = sc.nextLine();

		int idx = -1;

		for (int i = 0; i < count; i++) {
			if (arr[i].getName().equals(name)) {

				System.out.print("수정 전화번호 입력: ");
				String phoneNo = sc.nextLine();
				arr[i].setPhoneNo(phoneNo);
				idx = i;
			}
		}

		if (idx == -1) {
			System.out.println("유저를 찾을 수 없습니다.");
		}
	}

	public void deletePhoneInfo() {
		// 이름 입력 => 대상 객체 검색 => 인덱스 찾기 => 해당 객체 삭제
		System.out.print("이름: ");
		String name = sc.nextLine();

		int idx = -1;

		for (int i = 0; i < count; i++) {
			if (arr[i].getName().equals(name)) {

				for (int j = i; j < count - 1; j++) {
					arr[j] = arr[j + 1];
				}
				count--;
				idx = i;
				System.out.println("유저 삭제 완료되었습니다.");
			}
		}

		if (idx == -1) {
			System.out.println("유저를 찾을 수 없습니다.");
		}

	}

}
