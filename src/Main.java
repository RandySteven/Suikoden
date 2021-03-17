import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	
	ArrayList<Skill> soulEaterSkillList = new ArrayList<>();
	ArrayList<Rune> tirRuneList = new ArrayList<>();
	ArrayList<Skill> lightningSkillList = new ArrayList<>();
	ArrayList<Rune> flikRuneList = new ArrayList<>();
	
	ArrayList<Character> characterList = new ArrayList<>();
	Party party;
	void Monster() {
		
	}
	
	Weapon bo, odessa;
	void Weapon() {
		bo = new Weapon("Bo", "Medium", 8, 96);
		odessa = new Weapon("Odessa", "Short", 12, 130);
	}
	
	void Item() {
		
	}
	
	public void Skill() {
		Skill DeathFinger = new Skill("Death Finger", 6, 0);
		Skill DarkHole = new Skill("Death Finger", 4, 450);
		Skill Hell = new Skill("Death Finger", 3, 0);
		Skill Judgement = new Skill("Death Finger", 3, 2500);
	
		soulEaterSkillList.add(DeathFinger);
		soulEaterSkillList.add(DarkHole);
		soulEaterSkillList.add(Hell);
		soulEaterSkillList.add(Judgement);
		
		Skill AngryBlow = new Skill("Angry Blow", 6, 150);
		Skill RainStrom = new Skill("Rain Strom", 5, 100);
		Skill RagingBlow = new Skill("Raging Blow", 4, 600);
		Skill BallofLightning = new Skill("Ball of Lightning", 3, 1000);
		
		lightningSkillList.add(AngryBlow);
		lightningSkillList.add(RainStrom);
		lightningSkillList.add(RagingBlow);
		lightningSkillList.add(BallofLightning);
	}
	
	Rune SoulEater, Lightning, Earth, Fire, Wind, Water;
	
	void Rune() {
		SoulEater = new Rune("Soul Eater", soulEaterSkillList);
		Lightning = new Rune("Lightning", lightningSkillList);
		
		tirRuneList.add(SoulEater);
		flikRuneList.add(Lightning);
	}
	
	void print() {
		for(int i = 0 ; i < 2 ; i ++) {
			for(int j = 0 ; j < 3 ; j++) {
				System.out.print(characterList.get(j).getName() + " ");
			}
			System.out.print("\n");
		}
	}
	
	void Character() {
		Character Tir = new Character("Tir McDohl", 120, 130, 20, 25, tirRuneList, null, bo);
		Character Flik = new Character("Flik", 200, 240, 130, 110, flikRuneList, null, odessa);
		Character Viktor = new Character("Viktor", 200, 240, 130, 110, flikRuneList, null, odessa);
		Character Gremio = new Character("Gremio", 200, 240, 130, 110, flikRuneList, null, odessa);
		Character Cleo = new Character("Cleo", 200, 240, 130, 110, flikRuneList, null, odessa);
		Character Pahn = new Character("Pahn", 200, 240, 130, 110, flikRuneList, null, odessa);
		
		characterList.add(Tir);
		characterList.add(Flik);
		characterList.add(Viktor);
		characterList.add(Gremio);
		characterList.add(Cleo);
		characterList.add(Pahn);
		party = new Party(1000, null, characterList);
	}
	
	public Main() {
		Character();
		print();
	}

	public static void main(String[] args) {
		new Main();
	}

}
