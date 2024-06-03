package task.speak;

public class Student extends Man {

	public Student(String name) {
		super(name);
	}

	public String speak() {
		return super.getName() + " 공부나 열심히 해";
	}

}
