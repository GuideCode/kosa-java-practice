package task.restaurant;

public class Appetizer extends MenuItem {

	private int calories;

	public Appetizer(String name, int price, String description, int calories) {
		super(name, price, description);
		this.calories = calories;
	}

}
