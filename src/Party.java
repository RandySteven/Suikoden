import java.util.ArrayList;

public class Party {
	private int money;
	private ArrayList<Item> itemList;
	private ArrayList<Character> characterList;
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public ArrayList<Item> getItemList() {
		return itemList;
	}
	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}
	public ArrayList<Character> getCharacterList() {
		return characterList;
	}
	public void setCharacterList(ArrayList<Character> characterList) {
		this.characterList = characterList;
	}
	public Party(int money, ArrayList<Item> itemList, ArrayList<Character> characterList) {
		super();
		this.money = money;
		this.itemList = itemList;
		this.characterList = characterList;
	}

	
}
