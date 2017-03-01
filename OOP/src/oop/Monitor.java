package oop;

public class Monitor {

		private String model;
		private String manufact;
		private int size;
		private Resolution nativeres;
		public Monitor(String model, String manufact, int size, Resolution nativeres) {
			super();
			this.model = model;
			this.manufact = manufact;
			this.size = size;
			this.nativeres = nativeres;
		}
		
	public  void drawpixelat(int x,int y, String color){
		System.out.println(x+" "+y+" "+ color);
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Resolution getNativeres() {
		return nativeres;
	}

	public void setNativeres(Resolution nativeres) {
		this.nativeres = nativeres;
	}
	
	
}
