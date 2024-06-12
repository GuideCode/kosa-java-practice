package task.bread;

import java.util.ArrayList;
import java.util.List;

public class BakerManager {

	List<String> breadList = new ArrayList<>();

	public synchronized void pop(String threadName) {
		while (breadList.size() == 0) {
			try {
				System.out.println(threadName + " 대기상태");
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("진열장 빵갯수: " + breadList.size());
		String bread = breadList.remove(breadList.size() - 1);
		System.out.println(threadName + " : " + bread + " 구매");
		this.notify();
	}

	// 진열장에 빵을 추가
	public synchronized void push(String threadName, String bread) {
		while (breadList.size() > 3) {
			try {
				System.out.println(threadName + " 대기상태");
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		breadList.add(bread);
		System.out.println(threadName + " : " + bread + " 만듬");
		this.notify();
	}
}
