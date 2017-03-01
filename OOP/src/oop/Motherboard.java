package oop;

public class Motherboard {
		
		private String model;
		private String manufact;
		private int ramslots;
		private int cardslots;
		private String bios;
		public Motherboard(String model, String manufact, int ramslots, int cardslots, String bios) {
			super();
			this.model = model;
			this.manufact = manufact;
			this.ramslots = ramslots;
			this.cardslots = cardslots;
			this.bios = bios;
		}
		
		public void loadprogram(String programname){
			System.out.println("prgroam "+programname+" is loaded");
		}
		
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getManufact() {
			return manufact;
		}
		public void setManufact(String manufact) {
			this.manufact = manufact;
		}
		public int getRamslots() {
			return ramslots;
		}
		public void setRamslots(int ramslots) {
			this.ramslots = ramslots;
		}
		public int getCardslots() {
			return cardslots;
		}
		public void setCardslots(int cardslots) {
			this.cardslots = cardslots;
		}
		public String getBios() {
			return bios;
		}
		public void setBios(String bios) {
			this.bios = bios;
		}
		
		
		
}
