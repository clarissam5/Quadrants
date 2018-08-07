
public class Point {

		//Declaring attributes
		private int x;
		private int y;
		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

	
		
		//Constructor
		Point ( int x, int y){
			this.x = x;
			this.y = y; 
		}
		
		//Instance Methods
		
		public String Quadrant() {
			String quad;
			if (x > 0 && y >  0) {
				quad = "is in quadrant 1";
			}
			else if (x < 0 && y >  0){
				quad = "is in quadrant 2";
			}
			else if (x < 0 && y <  0) {
				quad = "is in quadrant 3";
			}
			else if (x > 0 && y <  0) {
			quad = "is in quadrant 4";
			}
			else {
				quad = "This is the origin.";
			}
			return "(" + (x) +"," + (y) + ")" + " : " + quad;
		
		}
		
		public double Distance(Point another) {
			double dist;
			dist = Math.sqrt(Math.pow((this.x - another.x), 2) + Math.pow((this.x - another.x), 2));
			return  dist;
		}
		
		public void Shift() {
			this.x = ++this.x;
			this.y = ++this.y;
		}
	
		public String toString() {
			return ("The new value of this point is: " + "(" + this.x +","+ this.y + ")");
		}
}
