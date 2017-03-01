package oop;

public class Case {

			private String model;
			private String manufact;
			private String powers;
			private Dimensions dimensions;
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
			public String getPowers() {
				return powers;
			}
			public void setPowers(String powers) {
				this.powers = powers;
			}
			public Dimensions getDimensions() {
				return dimensions;
			}
			public void setDimensions(Dimensions dimensions) {
				this.dimensions = dimensions;
			}
			public Case(String model, String manufact, String powers, Dimensions dimensions) {
				super();
				this.model = model;
				this.manufact = manufact;
				this.powers = powers;
				this.dimensions = dimensions;
			}
			
			public void presspower(){
				System.out.println("turn on computer");
			}
}
