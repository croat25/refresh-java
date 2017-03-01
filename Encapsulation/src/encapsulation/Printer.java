package encapsulation;

public class Printer {

	private String name;
	private boolean duplex;
	private int pagesprint;
	private int tonerlvl;
	public Printer(String name, boolean duplex, int pagesprint, int tonerlvl) {
		super();
		this.name = name;
		this.duplex = duplex;
		this.pagesprint = pagesprint;
		if(tonerlvl>100){
			this.tonerlvl=100;
		}
		this.tonerlvl = tonerlvl;
	}
	
	public void filltoner(int refill){
		this.tonerlvl+=refill;
		if(this.tonerlvl<=0){
			System.out.println("printer empty");
			
		}
	}
	public int getPagesprint() {
		return pagesprint;
	}

	public void setPagesprint(int pagesprint) {
		this.pagesprint = pagesprint;
	}

	public void printmore(int pages){
		this.pagesprint+=pages;
	}

	public int getTonerlvl() {
		return tonerlvl;
	}

	public void setTonerlvl(int tonerlvl) {
		this.tonerlvl = tonerlvl;
	}
	
	
}
