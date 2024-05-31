package task.phoneBook;

public class UniversePhoneInfo extends PhoneInfo {

	private String major;
	private String year;

	public UniversePhoneInfo() {

	}

	public UniversePhoneInfo(String name, String phoneNo, String birth, String major, String year) {
		super(name, phoneNo, birth);
		this.major = major;
		this.year = year;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("전공: " + this.major);
		System.out.println("학년: " + this.year);
	}

}
