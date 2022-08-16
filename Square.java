public class Square<T> extends ArrayList<T>{
	
	private double side;

	public Square() {
	}//end side

	public Square(double s) {
		this.side = s;
	}//end s

	public double getArea() {
		return side;
	}//end getArea

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}//end toString
	
	public void displayInfo() {
        System.out.println("getArea: " + getArea());
        
	}//end displayInfo
	
}//end class
