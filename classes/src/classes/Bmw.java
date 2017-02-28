package classes;

public class Bmw extends Cars{
	private int roadservicemonths;

	public Bmw(String size, String name, int wheels, int doors, int gears, boolean manual, int currentgear,
			int roadservicemonths) {
		super(size, name, wheels, doors, gears, manual, currentgear);
		this.roadservicemonths = roadservicemonths;
	}

	public int getRoadservicemonths() {
		return roadservicemonths;
	}

	public void setRoadservicemonths(int roadservicemonths) {
		this.roadservicemonths = roadservicemonths;
	}
	
	public void speedup(int rate){
//		//int newvel=getCurrentvel()+rate;
//		if(newvel==0){
//			
//		}
//		else if(newvel>0 && newvel <=10){
//			changegear(1);
//		}
//		else if(newvel>10 && newvel <=20){
//			changegear(2);
//		}
//		else if(newvel>20 && newvel <=30){
//			changegear(3);
//		}
//		else{
//			changegear(4);
//		}
	}
	
	
}
