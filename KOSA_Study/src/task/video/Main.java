package task.video;

public class Main {

	public static void main(String[] args) {
		Video v1 = new Video(1, "트랜스포머3", "서봉수");
		Video v2 = new Video(2, "쿵푸팬더", "지성민");
		
		Member m1 = new Member("aaa", "홍길동", "동탄");
		Member m2 = new Member("bbb", "김철수", "서울");
		
		m1.rent(v1);
		m2.rent(v2);
		
		m1.showInfo();
		System.out.println("--------------------");
		m2.showInfo();
	}
}
