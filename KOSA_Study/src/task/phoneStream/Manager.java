package task.phoneStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 전화번호 관리 전반적인 기능
public class Manager {

	// 필드 변수들은 기본적으로 초기값이 존재함 (null 또는 0)
	private List<PhoneInfo> phoneList;
	private Scanner sc = DataInput.sc;
	private int count;

	public Manager() {
		phoneList = new ArrayList<PhoneInfo>();
//		sc = new Scanner(System.in);
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

		phoneList.add(new PhoneInfo(name, phoneNo, birth));
	}

	public void listPhoneInfo() {
		System.out.println("**전체내역**");
		this.phoneList.stream().forEach(p -> p.show());
	}

	public void searchPhoneInfo() {
		// 검색하고자 하는 이름으로 1개의 PhoneInfo객체의 내용을 출력한다.
		System.out.print("이름: ");
		String name = sc.nextLine();

		Stream<PhoneInfo> phoneStream = phoneList.stream();
		phoneStream.forEach(p -> {
			if (p.getName().equals(name)) {
				p.show();
			}
		});

	}

	public void updatePhoneInfo() {
		// 이름 입력 => 해당 phoneInfo 추출 => 수정 전화번호 입력 => 전화번호 수정 완료
		System.out.print("이름: ");
		String name = sc.nextLine();
		phoneList.stream().forEach(p -> {
			if (p.getName().equals(name)) {
				System.out.print("수정 전화번호: ");
				p.setPhoneNo(sc.nextLine());
			}
		});
	}

	public void deletePhoneInfo() throws Exception {
		// 이름 입력 => 대상 객체 검색 => 인덱스 찾기 => 해당 객체 삭제
		System.out.print("이름: ");
		String name = sc.nextLine();

		Stream<PhoneInfo> phoneStream = phoneList.stream();
		PhoneInfo first = phoneStream.filter(p -> p.getName().equals(name)).findFirst().orElseThrow(() -> new Exception("검색 기록이 없습니다"));

		this.phoneList.remove(first);
	}

}
