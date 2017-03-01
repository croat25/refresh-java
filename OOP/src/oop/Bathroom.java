package oop;

public class Bathroom {

		private int walls;
		private int toilets;
		private int showers;
		private int baths;
		private int mirror;
		private Area area;
		
		public int getWalls() {
			return walls;
		}
		public Area getArea() {
			return area;
		}
		public void setArea(Area area) {
			this.area = area;
		}
		public void setWalls(int walls) {
			this.walls = walls;
		}
		public int getToilets() {
			return toilets;
		}
		public void setToilets(int toilets) {
			this.toilets = toilets;
		}
		public int getShowers() {
			return showers;
		}
		public void setShowers(int showers) {
			this.showers = showers;
		}
		public int getBaths() {
			return baths;
		}
		public void setBaths(int baths) {
			this.baths = baths;
		}
		public int getMirror() {
			return mirror;
		}
		public void setMirror(int mirror) {
			this.mirror = mirror;
		}
		public Bathroom(int walls, int toilets, int showers, int baths, int mirror,Area area) {
			super();
			this.walls = walls;
			this.toilets = toilets;
			this.showers = showers;
			this.baths = baths;
			this.mirror = mirror;
			this.area=area;
		}
		
		public void flushtoilet(){
			System.out.println("flush the toilet flush flush flush");
		}
		
		
}
