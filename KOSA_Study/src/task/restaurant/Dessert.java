package task.restaurant;

public class Dessert extends MenuItem {

	private boolean glutenFree;

	public Dessert(String name, int price, String description, boolean glutenFree) {
		super(name, price, description);
		this.glutenFree = glutenFree;
	}

}
