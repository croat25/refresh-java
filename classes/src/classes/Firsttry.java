package classes;

public class Firsttry {
	public static void main(String[] args){
		System.out.println("hello git!");
		System.out.println("push this");
		
		Car porshe = new Car();
		porshe.setDoors(4);
		System.out.println(porshe.getDoors());
		porshe.setColour("matte black");
		System.out.println(porshe.getColour());
		
		BankAccount Brunos =  new BankAccount(500,500,"Bruno","email","9053342972");
		BankAccount vivas =  new BankAccount(5230,2323,"viva","email","9053qwer42972");
		System.out.println(Brunos.getBalance());
		System.out.println(vivas.getBalance());
		
		
		AnimalInher animal= new AnimalInher("Animal",1,1,5,5);
		
		Dog dog = new Dog("Yorkie",8,20,2,4,1,20,"long silky");
		dog.eat();
	}
}
