package oop;

public class Main {

	
	public static void main(String[] args){
		//input a new set of dimensions into dimensions= a new Dimensions called
		Dimensions dimensions = new Dimensions(20,20,5);
		
		//create a case called the case = a new Case with these paramenters		
		Case thecase = new Case("220B","Dell","240",dimensions);
		Monitor themonitor= new Monitor("27 inch beast","acer",27, new Resolution(2540,1440));
		
		Motherboard motherboard = new Motherboard("intel","i7",4,4,"bios");
		PC thepc=new PC(thecase,themonitor,motherboard);
		
		
		thepc.powerup();
		Area area=new Area(10,10,10);
		Bathroom bathroom= new Bathroom(3,1,2,1,1,area);
		
		
		Fashion fashion = new Fashion("Blue","minimal", new Rating(5));
		Metal metal = new Metal("Chrome");
		Room room = new Room(bathroom,fashion,metal);
		
		room.starting();
	
	}
}
