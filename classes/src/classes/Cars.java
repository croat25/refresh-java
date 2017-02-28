package classes;

public class Cars extends Vehicle {
		private int wheels;
		private int doors;
		private int gears;
		private boolean manual;
		private int currentgear;
		
		public Cars(String size, String name, int wheels, int doors, int gears, boolean manual, int currentgear) {
			super(size, name);
			this.wheels = wheels;
			this.doors = doors;
			this.gears = gears;
			this.manual = manual;
			this.currentgear = currentgear;
		}
		
		public void changegear(int currentgear){
			this.currentgear=currentgear;
			System.out.println("current gear is" + currentgear);
		}
		
	
	
}
