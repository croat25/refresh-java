package oop;

public class Area {

	
	private int height;
	private int width;
	private int length;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Area(int height, int width, int length) {
		super();
		this.height = height;
		this.width = width;
		this.length = length;
	}
	
	
}
