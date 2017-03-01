package encapsulation;

public class Enhancedplayer {
	
	private String name;
	private int health=100;
	private String weapon;
	
	
	public Enhancedplayer(String name, int health, String weapon) {
		super();
		this.name = name;
		if(health>0 && health<=200){
			this.health = health;
		}
		else if(health >200){
			this.health=200;
		}
		
		this.weapon = weapon;
	}
	
	public void loosehealth(int damage){
		this.health-=damage;
		if(this.health<=0){
			System.out.println("player knocked out");
		}
		else{
			System.out.println("dsfdsfdsfsdf");
		}
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	
}
