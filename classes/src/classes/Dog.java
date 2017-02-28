package classes;

public class Dog extends AnimalInher {
		private int eyes;
		private int legs;
		private int tail;
		private int teeth;
		private String coat;
		
		//this is my calling class in main function and wat attribute i want int the class
	public Dog(String name, int size,int weight,int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight);//taken from previous class or inherited class
		this.eyes=eyes;//added from this class
		this.legs=legs;
		this.tail=tail;
		this.teeth=teeth;
		this.coat=coat;
		// TODO Auto-generated constructor stub
	}
	public int getEyes() {
		return eyes;
	}
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getTail() {
		return tail;
	}
	public void setTail(int tail) {
		this.tail = tail;
	}
	public int getTeeth() {
		return teeth;
	}
	public void setTeeth(int teeth) {
		this.teeth = teeth;
	}
	public String getCoat() {
		return coat;
	}
	public void setCoat(String coat) {
		this.coat = coat;
	}

	
	private void chew(){
		System.out.println("chewing my food");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		//super.eat();//this also calls previous function to execute and then the new one i made in this class
		chew();
	}
	
		
}
