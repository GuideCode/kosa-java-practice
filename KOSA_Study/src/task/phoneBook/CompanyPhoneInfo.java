package task.phoneBook;

public class CompanyPhoneInfo extends PhoneInfo {

	private String dept;
	private String position;

	public CompanyPhoneInfo() {

	}

	public CompanyPhoneInfo(String name, String phoneNo, String birth, String dept, String position) {
		super(name, phoneNo, birth);
		this.dept = dept;
		this.position = position;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("부서: " + this.dept);
		System.out.println("직책: " + this.position);
	}

}
