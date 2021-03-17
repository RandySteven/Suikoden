import java.util.ArrayList;

public class Character {
	private String name;
	private int hp;
	private int xp;
	private int defense;
	private ArrayList<Rune> runeList;
	private ArrayList<Item> itemList;
	private Weapon weapon;
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
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public ArrayList<Rune> getRuneList() {
		return runeList;
	}
	public void setRuneList(ArrayList<Rune> runeList) {
		this.runeList = runeList;
	}
	public ArrayList<Item> getItemList() {
		return itemList;
	}
	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public Character(String name, int hp, int xp, int defense, ArrayList<Rune> runeList, ArrayList<Item> itemList,
			Weapon weapon) {
		super();
		this.name = name;
		this.hp = hp;
		this.xp = xp;
		this.defense = defense;
		this.runeList = runeList;
		this.itemList = itemList;
		this.weapon = weapon;
	}
	
}
