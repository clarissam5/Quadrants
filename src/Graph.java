
public class Graph {
	public static void main(String args[]){
		//creating objects 
		Point point1 = new Point(2, 3);
		Point point2 = new Point(-3,3);
		Point point3 = new Point(-2, -3);
		Point point4 = new Point(2, -3);
		
		System.out.println();
		System.out.println(point1.Quadrant());
		System.out.println(point1.Distance(point2));
		point1.Shift();
		point2.Shift();
		System.out.println(point1.getX() + ","+ point1.getY());
		System.out.println(point2.toString());
	
	}
	
	
}
