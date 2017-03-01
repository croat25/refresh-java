package oop;

public class Fashion {

	private String wallcolor;
	private String theme;
	private Rating rating;
	
	public String getWallcolor() {
		return wallcolor;
	}
	public void setWallcolor(String wallcolor) {
		this.wallcolor = wallcolor;
	}
	public String getTheme() {
		return theme;
	}
	public Rating getRating() {
		return rating;
	}
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public void enter(int x ,int y){
		System.out.println(x+"enter the fashion show in my bathroom!"+y);
	}
	public Fashion(String wallcolor, String theme, Rating rating) {
		super();
		this.wallcolor = wallcolor;
		this.theme = theme;
		this.rating = rating;
	}
	
	
		
}
