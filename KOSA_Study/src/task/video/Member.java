package task.video;

public class Member {

	private String id;
	private String name;
	private String address;
	private Video video;

	public Member() {

	}

	public Member(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void rent(Video video) {
		this.video = video;
	}

	public void showInfo() {
		System.out.println("회원의 아이디: "+id);
		System.out.println("회원의 이름: "+name);
		System.out.println("회원의 주소: "+address);
		video.showInfo();
	}

}
