package encapsulation;

public class Player {

			public String name;
			public int health;
			public String weapon;
	
			
			public void loosehealth(int damage){
				this.health-=damage;
				if(this.health<=0){
					System.out.println("player knocked out");
				}
				else{
					System.out.println("dsfdsfdsfsdf");
				}
			}
			
			public int healthremain(){
				return this.health;
			}

			public Player(String name, int health, String weapon) {
				super();
				this.name = name;
				this.health = health;
				this.weapon = weapon;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getHealth() {
				return health;
			}

			public void setHealth(int health) {
				this.health = health;
			}

			public String getWeapon() {
				return weapon;
			}

			public void setWeapon(String weapon) {
				this.weapon = weapon;
			}
			
			
}
