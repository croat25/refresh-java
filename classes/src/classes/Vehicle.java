package classes;

public class Vehicle {
		
	private String size;
	private String name;
	
	private int currentvel;
	private int currentdir;
	
	
	public Vehicle(String size, String name) {
		super();
		this.size = size;
		this.name = name;
		this.currentdir=currentdir;
		this.currentvel=currentvel;
	}
	
	public void steer(int direction){
		
		this.currentdir+=direction;
		System.out.println(currentdir);
	}
	
	public void move(int vel,int dir){
		currentdir=dir;
		currentvel=vel;
		System.out.println(currentvel+"  "+currentdir);
	}
}
