import java.util.ArrayList;

public class Rune {
	private String name;
	private ArrayList<Skill> skillList;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Skill> getSkillList() {
		return skillList;
	}
	public void setSkillList(ArrayList<Skill> skillList) {
		this.skillList = skillList;
	}
	public Rune(String name, ArrayList<Skill> skillList) {
		super();
		this.name = name;
		this.skillList = skillList;
	}
	
}
