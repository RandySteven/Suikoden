
public class Monster {
	private String name;
	private int hp;
	private int attack;
	private int defense;
	private String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Monster(String name, int hp, int attack, int defense, String type) {
		super();
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.type = type;
	}
	
}
