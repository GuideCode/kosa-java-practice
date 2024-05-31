package task.restaurant;

public class MainCourse extends MenuItem {

	private boolean vegetarian;

	public MainCourse(String name, int price, String description, boolean vegetarian) {
		super(name, price, description);
		this.vegetarian = vegetarian;
	}

}
