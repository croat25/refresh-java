package oop;

public class Room {

		private Bathroom bathroom;
		private Fashion fashion;
		private Metal metal;
		public Room(Bathroom bathroom, Fashion fashion, Metal metal) {
			super();
			this.bathroom = bathroom;
			this.fashion = fashion;
			this.metal = metal;
		}
		public Bathroom getBathroom() {
			return bathroom;
		}
		public void setBathroom(Bathroom bathroom) {
			this.bathroom = bathroom;
		}
		public Fashion getFashion() {
			return fashion;
		}
		public void setFashion(Fashion fashion) {
			this.fashion = fashion;
		}
		public Metal getMetal() {
			return metal;
		}
		public void setMetal(Metal metal) {
			this.metal = metal;
		}
		
		public void starting(){
			getBathroom().flushtoilet();
			draw();
		}
		public void draw(){
			fashion.enter(50,50);
		}
	
}
