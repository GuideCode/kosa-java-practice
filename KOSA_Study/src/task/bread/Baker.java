package task.bread;

public class Baker extends Thread {

	private String name;
	private BakerManager m;

	public Baker(String threadName, BakerManager m) {
		this.name = threadName;
		this.m = m;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 20; i++) {
			m.push(name, getBread());
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public String getBread() {
		String bread = "";
		int num = (int) (Math.random() * 3);

		switch (num) {
		case 0:
			bread = "생크림빵";
			break;
		case 1:
			bread = "피자빵";
			break;
		case 2:
			bread = "고로케빵";
			break;
		}

		return bread;
	}

}
