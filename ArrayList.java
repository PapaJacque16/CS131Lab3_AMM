import java.util.Arrays;
/** 
 * @author Aaron McCarley
 * August 16, 2022
 *The purpose of the Arrays class’s static <T> List<T> 
 *asList(T... array) method is to return a fixed-size 
 *list backed by the specified array. 
 *(Changes to the returned list “write through” to the array.)T
 * @param <T>
 */

public class ArrayList<T> {

	private final int DEFAULT_SIZE=100;
   	private int currentItem=0;
   	private Object[] arList;
   	
   	//this is the proper way to initialize this object using a call to new Object.
   	ArrayList<T> sequence = new ArrayList<T>();
  
   	    public ArrayList() {	
		}//end empty constructor
   	   
		// use addItem() method to add elements in the list
   	    public void addItem(int size, T item) {
   	    }//end add
   	    
   	    public int size() {
   	        return 1;
   	    }//end size
   	    
   	   public boolean addItem(T item) {
   	        return true;
   	    }//end addItem

		@Override
		public String toString() {
			return "ArrayList [DEFAULT_SIZE=" + DEFAULT_SIZE + ", currentItem=" + currentItem + ", arList="
					+ Arrays.toString(arList) + ", sequence=" + sequence + "]";
		}//end toString

}//end class