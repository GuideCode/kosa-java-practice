package task.bread;

public class BreadCustomer extends Thread {

	private String name;
	private BakerManager m;

	public BreadCustomer(String threadName, BakerManager m) {
		this.name = threadName;
		this.m = m;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 20; i++) {
			m.pop(name);
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}