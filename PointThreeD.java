public class PointThreeD<T> extends Square<T>{

	private double xPoint;
	private double yPoint;
	private double zPoint;
	
	public PointThreeD() {	
	}//end empty constructor
	
	public PointThreeD(double x, double y, double z) {	
	}

	//getters and setters
	public double getxPoint() {
		return xPoint;
	}//end getxPoint

	public void setxPoint(double xPoint) {
		this.xPoint = xPoint;
	}//end setxPoint

	public double getyPoint() {
		return yPoint;
	}//end getyPoint

	public void setyPoint(double yPoint) {
		this.yPoint = yPoint;
	}//end setyPoint

	public double getzPoint() {
		return zPoint;
	}//end getzPoint

	public void setzPoint(double zPoint) {
		this.zPoint = zPoint;
	}//end setzPoint

	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}
	public void displayInfo() {
        System.out.println("xPoint: " + getxPoint());
        System.out.println("yPoint: " + getyPoint());
        System.out.println("zPoint: " + getzPoint());
	}//end displayInfo
	
}//end class
