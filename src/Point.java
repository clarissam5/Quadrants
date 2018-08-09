
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
		
		public int Quadrant() {
			//have to equal it to 0 because it is a local variable 
			int quad=0;
			if (x > 0 && y >  0) {
				quad = 1;
			}
			else if (x < 0 && y >  0){
				quad = 2;
			}
			else if (x < 0 && y <  0) {
				quad = 3;
			}
			else if (x > 0 && y <  0) {
			quad = 4;
			}
			
			return quad;
		
		}
		
		public double Distance(Point another) {
			double dist;
			dist = Math.sqrt(Math.pow((this.x - another.x), 2) + Math.pow((this.x - another.x), 2));
			return  dist;
		}
		
		public void Shift() {
			++this.x;
			++this.y;
		}

		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}
	
		
		
}
