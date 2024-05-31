package task.phoneBook;

import java.util.Scanner;

public class Manager {

	private PhoneInfo[] phoneInfoList;
	private int count;
	private Scanner sc = DataInput.sc;

	public Manager() {
		this.phoneInfoList = new PhoneInfo[10];
	}

	public void addPhoneInfo() {
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNo = sc.nextLine();
		System.out.print("생년월일: ");
		String birth = sc.nextLine();

		PhoneInfo phoneInfo = new PhoneInfo(name, phoneNo, birth);
		phoneInfoList[count++] = phoneInfo;
	}

	public void addCompanyPhoneInfo() {
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNo = sc.nextLine();
		System.out.print("생년월일: ");
		String birth = sc.nextLine();
		System.out.print("부서: ");
		String dept = sc.nextLine();
		System.out.print("직책: ");
		String position = sc.nextLine();

		PhoneInfo companyPhoneInfo = new CompanyPhoneInfo(name, phoneNo, birth, dept, position);
		phoneInfoList[count++] = companyPhoneInfo;

	}

	public void addUniversePhoneInfo() {
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNo = sc.nextLine();
		System.out.print("생년월일: ");
		String birth = sc.nextLine();
		System.out.print("전공: ");
		String major = sc.nextLine();
		System.out.print("학년: ");
		String year = sc.nextLine();

		PhoneInfo universePhoneInfo = new UniversePhoneInfo(name, phoneNo, birth, major, year);
		phoneInfoList[count++] = universePhoneInfo;
	}

	public void printAllPhoneInfo() {
		for (int i = 0; i < count; i++) {
			phoneInfoList[i].show();
		}
	}

	public void printCompanyInfo() {
		for (int i = 0; i < count; i++) {
			if (phoneInfoList[i] instanceof CompanyPhoneInfo) {
				phoneInfoList[i].show();
			}
		}
	}

	public void printUniverseInfo() {
		for (int i = 0; i < count; i++) {
			if (phoneInfoList[i] instanceof UniversePhoneInfo) {
				phoneInfoList[i].show();
			}
		}
	}

}
