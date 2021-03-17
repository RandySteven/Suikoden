
public class Weapon {
	private String name;
	private String type;
	private int level;
	private int attack;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public Weapon(String name, String type, int level, int attack) {
		super();
		this.name = name;
		this.type = type;
		this.level = level;
		this.attack = attack;
	}
	
}
