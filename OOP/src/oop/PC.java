package oop;

public class PC {

	private Case thecase;
	private Monitor monitor;
	private Motherboard motherboard;
	public Case getThecase() {
		return thecase;
	}
	public void setThecase(Case thecase) {
		this.thecase = thecase;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public Motherboard getMotherboard() {
		return motherboard;
	}
	public void setMotherboard(Motherboard motherboard) {
		this.motherboard = motherboard;
	}
	public PC(Case thecase, Monitor monitor, Motherboard motherboard) {
		super();
		this.thecase = thecase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	
	public void powerup(){
		getThecase().presspower();
		drawLogo();
	}
	
	public void drawLogo(){
		//fancy graphics
		//calls the monitor class to execute the function drawpixelat
	monitor.drawpixelat(1200, 50, "yellow");
	}
}
