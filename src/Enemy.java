import java.util.ArrayList;

public class Enemy {
	private ArrayList<Monster> monsterList;
	private ArrayList<Item> dropItemList;
	public ArrayList<Monster> getMonsterList() {
		return monsterList;
	}
	public void setMonsterList(ArrayList<Monster> monsterList) {
		this.monsterList = monsterList;
	}
	public ArrayList<Item> getDropItemList() {
		return dropItemList;
	}
	public void setDropItemList(ArrayList<Item> dropItemList) {
		this.dropItemList = dropItemList;
	}
	public Enemy(ArrayList<Monster> monsterList, ArrayList<Item> dropItemList) {
		super();
		this.monsterList = monsterList;
		this.dropItemList = dropItemList;
	}
	
}
