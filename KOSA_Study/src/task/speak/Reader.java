package task.speak;

public class Reader extends Man implements Speakable {

	public Reader(String name) {
		super(name);
	}

	@Override
	public String speak() {
		return super.getName() + " 자바화이팅";
	}

}
