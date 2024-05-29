package task.video;

public class Video {

	private int number;
	private String title;
	private String actor;

	public Video() {

	}
	
	public Video(int number, String title, String actor) {
		this.number = number;
		this.title = title;
		this.actor = actor;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}
	
	public void showInfo() {
		System.out.println("회원이 빌린 비디오 번호: " + number);
		System.out.println("회원이 빌린 비디오 제목: " + title);
		System.out.println("회원이 빌린 비디오 배우: " + actor);
	}
	
}
