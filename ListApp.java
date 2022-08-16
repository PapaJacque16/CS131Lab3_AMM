import java.util.AbstractList;
import java.util.LinkedList;

public class ListApp<T> extends PointThreeD<T>{

	public static <T> void main(String[] args) {

		// Creating an empty AbstractList
        AbstractList<Integer> squareList = new LinkedList<Integer>();
 
        // Using add() method to add elements in the list
        squareList.add(4);
        squareList.add(8);
        squareList.add(12);
        squareList.add(8);
        squareList.add(4);
        
     // Output the list
	    System.out.println("SquareList: " + squareList);
 
     // Creating an empty AbstractList
        AbstractList<String> pointsList = new LinkedList<String>();
 
        // Using add() method to add elements in the list
        pointsList.add("Crazy Glue");
        pointsList.add("People");
        pointsList.add("Things");
        pointsList.add("10");
        pointsList.add("20");
        
     // Output the list
	    System.out.println("PointsList: " + pointsList);
        
     // Creating an empty AbstractList
        AbstractList<String> stringsList = new LinkedList<String>();
        
 
        // Using add() method to add elements in the list
        stringsList.add("Billy Strings");
        stringsList.add("Blue Grass");
        stringsList.add("Grammy");
        
        // Output the list
	    System.out.println("StringsList: " + stringsList);
		
	}//end methods

	@Override
	public String toString() {
		return "ListApp [sequence=" + sequence + ", getxPoint()=" + getxPoint() + ", getyPoint()=" + getyPoint()
				+ ", getzPoint()=" + getzPoint() + ", toString()=" + super.toString() + ", getArea()=" + getArea()
				+ ", size()=" + size() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
		
	}//end toString

}//end class
