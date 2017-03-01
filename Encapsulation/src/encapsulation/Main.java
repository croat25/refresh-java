package encapsulation;

class Movie{
	private String name;

	public Movie(String name) {
		super();
		this.name = name;
	}
	
	public String plot(){
		return "no plot here";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

class Car{
	private int cylinders;
	private boolean engine;
	private String name;
	private int wheels;
	public Car(int cylinders, boolean engine, String name, int wheels) {
		super();
		this.cylinders = cylinders;
		this.engine = engine;
		this.name = name;
		this.wheels = wheels;
	}
	public String Startcar(){
		return "no car started";
	}
	public int getCylinders() {
		return cylinders;
	}
	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}
	public boolean isEngine() {
		return engine;
	}
	public void setEngine(boolean engine) {
		this.engine = engine;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	
}
class Bmw extends Car{

	public Bmw(int cylinders, String name) {
		super(cylinders, true, name, 4);
		// TODO Auto-generated constructor stub
	}
		public  String Startcar(){
			return "i started my car bmw";
		}
				
					
}



 class Jaws extends Movie{
	 public Jaws(){
		 super("Jaws");
	 }
	 public String plot(){
		 return "shark eats lots of people";
		 
	 }
	 
	 
 }
class IndependecyDay extends Movie{
	public IndependecyDay(){
		super("Independence day");
	}
	@Override
	public String plot(){
		return "aliems attempt to take over planet";
		}
	
}

class Mazerunner extends Movie{
	public Mazerunner(){
		super("a movie about mazes");
	}
	@Override
	public String plot(){
		return "kids going to a maze";
	}
}
class Starwars extends Movie{
	public Starwars (){
		super("sdsdfsdfsdf");
	}
	public String plot(){
		return "light sabers bam bam";
	}
}

class Forget extends Movie {
	public Forget(){
		super("sfsdfsd");
	}
	
}
public class Main {
	
	
		public static void main(String[] args){
//		 Player player = new Player("Bruno",100,"hammer");
//		 
//		 
//		 int damage=10;
//		 player.loosehealth(damage);
//		 
//		 System.out.println("remaining health"+player.healthremain());

//		
//			Enhancedplayer player = new Enhancedplayer("bruno",256,"ak");
//			System.out.println("health is "+player.getHealth());
//		
//		Printer printer = new Printer("hp",true,15,23);
//		printer.filltoner(15);
//		System.out.print("printer tonerlvl is : "+printer.getTonerlvl());
//		
//		printer.printmore(15);
//		System.out.print(printer.getPagesprint());
		for ( int i =1;i<11;i++){
			Movie movie= randomMovie();
			System.out.println(movie.getName());
		}
			Car mycar= new Bmw(5,"m3");
		
		System.out.println(mycar.getName());
			
		}
		
		
		public static Movie randomMovie(){
			int random= (int) (Math.random()*5)+1;
			System.out.println(random);
			switch (random) {
			case 1:
				return new Jaws();
			case 2:
				return new IndependecyDay();
			case 3:
				return new Mazerunner();
			case 4:
				return new Starwars();
			case 5:
				return new Forget();
			}
			return null;
		}
}
