package ams2.magicinterface.baseclases;

public class Carta {
	private String name;
	private Coste cost;
	private String type;
	private String subType;
	private String edition;
	private int power;
	private int toughness;
	private String rules;
	private String lore;
	private String imagePath;
	
	
	public Carta(String name, Coste cost, String type, String subType, String edition, int power, int toughness,
			String rules, String lore, String imagePath) {
		super();
		setName(name);
		setCost(cost);
		setType(type);
		setSubType(subType);
		setEdition(edition);
		setPower(power);
		setToughness(toughness);
		setRules(rules);
		setLore(lore);
		setImagePath(imagePath);
		
	}
	public Carta() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Coste getCost() {
		return cost;
	}
	public void setCost(Coste cost) {
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSubType() {
		return subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getToughness() {
		return toughness;
	}
	public void setToughness(int toughness) {
		this.toughness = toughness;
	}
	public String getRules() {
		return rules;
	}
	public void setRules(String rules) {
		this.rules = rules;
	}
	public String getLore() {
		return lore;
	}
	public void setLore(String lore) {
		this.lore = lore;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	

}
