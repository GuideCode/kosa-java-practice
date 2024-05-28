package task.phoneNum;

public class PhoneInfo {

	private String name;
	private String phoneNo;
	private String birth;

	public PhoneInfo() {

	}

	public PhoneInfo(String name, String phoneNo, String birth) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public String getBirth() {
		return birth;
	}
	
	public void printInfo() {
		System.out.println("이름: "+this.name);
		System.out.println("전화번호: "+this.phoneNo);
		System.out.println("생년월일: "+this.birth);
	}

}
