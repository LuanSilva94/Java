package Classes;

public class ClasseProduto {
	private String name;
	private String category;
	private float price;
	private int amount;
	private int launchYear;

	public ClasseProduto(String name, String category, float price, int amount, int launchYear) {

		this.name = name;
		this.category = category;
		this.price = price;
		this.amount = amount;
		this.launchYear = launchYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmout(int amount) {
		this.amount = amount;
	}

	public int getLaunchYear() {
		return launchYear;
	}

	public void setType(int launchYear) {
		this.launchYear = launchYear;
	}

	public void toView() {
		System.out.println("Name: " + getName());
		System.out.println("Category: " + getCategory());
		System.out.println("Price: "+"U$$"  + getPrice());
		System.out.println("Amount: " + getAmount() + "unit(s)" );
		System.out.println("Launch Year: " + getLaunchYear() + "\n\n");
	}
}
