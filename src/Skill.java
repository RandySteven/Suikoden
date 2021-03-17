
public class Skill {
	String name;
	int quantity;
	int damage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public Skill(String name, int quantity, int damage) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.damage = damage;
	}
	

}
